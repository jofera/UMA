/*
Escribe un programa Lex que cuente los caracteres, palabras y líneas de un fichero de entrada.
*/
%{
#include "stdio.h"
int ncar=0, npal=0, nlin=0;
%}

%%
[^ \t\n]+    {ncar+=yyleng;npal++;}
.            {ncar++;}
\n          {ncar++;nlin++;}
%%

main(int argc,char *argv[])
{

  FILE *ptrFile;

  if(argc<=1)
  {
        fprintf (stderr, "Use %s <fichero>\n", argv[0]);
        exit (1);
  }

  ptrFile=fopen(argv[1],"r");

  if (!ptrFile)
  {
          fprintf(stderr,"Error al abrir el fichero %s\n",argv[1]);
          exit(2);
  }

  yyin=ptrFile;

  yylex();
  printf("Lineas:%d\nPalabras:%d\nCaracteres:%d\n", nlin, npal, ncar);
}

int yywrap()
{
  return 1;
}
