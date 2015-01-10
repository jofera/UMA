/**
UNIX Shell Project

Sistemas Operativos
Grados I. Informatica, Computadores & Software
Dept. Arquitectura de Computadores - UMA

Some code adapted from "Fundamentos de Sistemas Operativos", Silberschatz et al.

To compile and run the program:
   $ gcc Shell_project.c job_control.c -o Shell
   $ ./Shell          
	(then type ^D to exit program)

**/

#include "job_control.h"   // remember to compile with module job_control.c 

#define MAX_LINE 256 /* 256 chars per line, per command, should be enough. */

job * my_job_list;  // lista de tareas

//---------------------------------------------------------
void funcion (int signal)
{
  int pid_wait,status,info,pid_lista;
  int i;
  job * tarea;
  enum status status_res;

   debug(signal,%d);
  
  if(empty_list(my_job_list)) return;

  for( i= list_size(my_job_list); i>=1; i--)
  {
   tarea= get_item_bypos(my_job_list, i);

   pid_lista= tarea->pgid;

   pid_wait = waitpid( pid_lista , &status, WUNTRACED | WNOHANG);
   if(pid_wait==pid_lista)
   {
     status_res = analyze_status ( status, &info);
     printf("\nProceso segundo plano %d, %s, estado: %s, info: %d\n",
                pid_wait, tarea->command, status_strings[status_res], info);
     if(status_res!=SUSPENDED) // == EXITED o == SIGNALED
     { 
       delete_job(my_job_list, tarea);
     }else{
	tarea->state = STOPPED;
	}
     
   }
  }
  
}



// -----------------------------------------------------------------------
//                            MAIN          
// -----------------------------------------------------------------------

int main(void)
{
	char inputBuffer[MAX_LINE]; /* buffer to hold the command entered */
	int background;             /* equals 1 if a command is followed by '&' */
	char *args[MAX_LINE/2];     /* command line (of 256) has max of 128 arguments */
	// probably useful variables:
	int pid_fork, pid_wait; /* pid for created and waited process */
	int status;             /* status returned by wait */
	enum status status_res; /* status processed by analyze_status() */
	int info;				/* info processed by analyze_status() */

        signal(SIGCHLD, funcion);

	ignore_terminal_signals();


	my_job_list = new_list("Tareas Shell");  // mi lista de tareas


	while (1)   /* Program terminates normally inside get_command() after ^D is typed*/
	{   		
		printf("tu comando-> ");
		fflush(stdout);
		get_command(inputBuffer, MAX_LINE, args, &background);  /* get next command */
		
		if(args[0]==NULL) continue;   // if empty command
		//comandos internos
		if(strcmp(args[0],"cd")==0)
		{
		  if(args[1]!=NULL)
			 chdir(args[1]);
			else printf("Introduce el directorio\n");
                 continue;
		}

		if(strcmp(args[0],"jobs")==0)
		{
		 print_job_list(my_job_list);		 
		 continue;
		}

		if(strcmp(args[0],"fg") == 0){
			job * tarea = NULL;
			int pos = 1;
		
			if(args[1] != NULL)	
				pos = atoi(args[1]);
			
			tarea = get_item_bypos(my_job_list,pos);

			if(tarea == NULL){
				printf("No se ha encontrado el proceso\n");
				continue;
			}

			tarea->state = FOREGROUND;
			int pid_tarea = tarea->pgid;
			set_terminal(pid_tarea);
                        killpg(pid_tarea,SIGCONT);
			pid_wait = waitpid(pid_tarea, &status, WUNTRACED);
			set_terminal(getpid());
			
               	 	status_res = analyze_status ( status, &info);
                	printf("Proceso en primer plano %d, %s, estado: %s, info: %d\n",
			pid_tarea, tarea->command, status_strings[status_res], info);
			
			if(status_res == SUSPENDED)
				tarea->state = STOPPED;
			else
				delete_job(my_job_list,tarea);
			continue;
			
			
		}

		if(strcmp(args[0],"bg") == 0){

			int pos = 1;
			
			if(args[1] != NULL)	
				pos = atoi(args[1]);

			job * tarea = get_item_bypos(my_job_list,pos);

			if(tarea == NULL){
				printf("No se ha encontrado el proceso\n");
				continue;
			}
		
			int pid_tarea = tarea->pgid;
			
			if(tarea->state == STOPPED){
				tarea->state = BACKGROUND;
				killpg(pid_tarea,SIGCONT);
			}else{
				printf("El proceso ya se está ejecutando\n");
				continue;
			}

			printf("El proceso %s con pid %d se ha renaudado\n",tarea->command,tarea->pgid);
			continue;
		}
                                

 
		//aplicaciones y comandos externos
                pid_fork = fork();
                
                if (pid_fork==0)
                {  // soy el hijo
		  restore_terminal_signals();
                  new_process_group(getpid());
                  if(!background) set_terminal(getpid());        
                	
		  execvp(args[0], args);
                  printf("Error al ejecutar %s\n",args[0]);
		  perror("EXECVP");
                  exit(16);
		}
                // soy el padre, el shell
              
                new_process_group(pid_fork);
              
                if(background)
		{  // segundo plano
                  printf("Proceso ejecutando en segundo plano %d, %s\n",
                        pid_fork, args[0] );

		  block_SIGCHLD();
                  add_job(my_job_list, new_job(pid_fork, args[0], BACKGROUND));
		  unblock_SIGCHLD();
		}
		else
		{ // primer plano
                        set_terminal(pid_fork);        
                	pid_wait = waitpid(pid_fork, &status, WUNTRACED);
                        set_terminal(getpid());
               	 	status_res = analyze_status ( status, &info);
                	printf("Proceso en primer plano %d, %s, estado: %s, info: %d\n",
                        pid_wait, args[0], status_strings[status_res], info);

                      // si se ha suspendido, añadir a lista
			if(status_res == SUSPENDED)
				add_job(my_job_list, new_job(pid_fork, args[0], STOPPED));
                }

		/* the steps are:
			 (1) fork a child process using fork()
			 (2) the child process will invoke execvp()
			 (3) if  == 0, the parent will wait, otherwise continue 
			 (4) Shell shows a status message for processed command 
			 (5) loop returns to get_commnad() function
		*/

	} // end while
}
