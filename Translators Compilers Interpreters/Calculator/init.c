# include "hoc.h"
# include "calcu3.tab.h"
# include <math.h>
extern double Log(), Log10(), Exp(), Sqrt(), integer();
static struct { /* constantes */
char * name;
double cval;
}consts[]={
	"PI",3.141516,
	"E", 2.71828,
	"GAMMA", 0.5772,
	0,0};

static struct { /* funciones predefinidas */
char * name;
double (*func)();
}builtins[]={
	"sin",sin,
	"cos",cos,
	"atan",atan,
	"log",Log,
	"log10",log10,
	"exp",Exp,
	"Sqrt",Sqrt,
	"int",integer,
	"abs",fabs,
	0,0};

init () /* instalar las constantes y funciones predefin. en la tabla de símbolos */
{ int i; Symbol *s;
	for (i=0; consts[i].name; i++)
	install (consts[i].name, VAR, consts[i].cval);
	for (i=0; builtins[i].name;i++) {
		s=install(builtins[i].name,BLTIN,0.0);
		s->u.ptr=builtins[i].func;
	}
}
