typedef struct Symbol
{
/* estructura de la tabla de símbolos */
char * name;
short type;
union
{
	double val; /* si es una variable */
	double (*ptr)(); /* si es BLTIN */
}u;
struct Symbol *next; /* para enlazar con otro elemento de
la tabla de símbolos */
}Symbol;
Symbol * install (), * lookup ();

