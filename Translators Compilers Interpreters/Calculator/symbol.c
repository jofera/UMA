# include "string.h"
# include "hoc.h"
# include "calcu3.tab.h" 

static Symbol *symlist=0;/*tabla símbolos: lista enlazada */

Symbol * lookup (char * s)
{

Symbol * sp;

	for (sp=symlist; sp !=(Symbol *)0; sp=sp->next)
		if(strcmp(sp->name,s)==0) return sp;

	return 0; /* no se encontró */

}

Symbol * install (char * s, int t, double d)
/* instalar "s" en la tabla de sim. */
{
Symbol * sp;
char * emalloc ();

	sp=(Symbol *) emalloc (sizeof(Symbol));
	sp->name=emalloc(strlen(s)+1); /* +1 para '\0'*/
	strcpy (sp->name,s);
	sp->type=t;
	sp->u.val=d;
	sp->next=symlist; /* poner al frente de la lista */
	symlist=sp;

	return sp;
}

char * emalloc (unsigned n)
{
char * p; char * malloc ();

	p=malloc(n);
	if (p==0)
		execerror ("out of memory", (char *)0);
	return p;
}
