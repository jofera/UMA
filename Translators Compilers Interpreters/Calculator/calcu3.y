%{
#include "hoc.h"
#include "stdio.h"
extern double Pow ();
extern int lineno;

%}
%union
{
	double val; /* valor actual */
	Symbol * sym; /* puntero a la tb. Símbolos */
}
%token <val> NUMBER
%token <sym> VAR BLTIN UNDEF
%type <val> expr 
%right '='
%left '+' '-'
%left '*' '/'
%left UNARYMINUS
%right '^' /*exponent.*/
%%
list: /*nada*/
	| list '\n'
	| list expr '\n' { printf ("\t%lf\n", $2);}
	| list error '\n' { yyerrok;}
	;
expr: NUMBER {$$=$1;}
	| VAR { if ($1->type==UNDEF)
		execerror ("undefined variable", $1->name);
		$$=$1->u.val;
	}
	| VAR '=' expr {$$=$1->u.val=$3; $1->type=VAR;}
	| BLTIN '(' expr ')' { $$=(*($1->u.ptr))($3);}
	| expr '+' expr {$$=$1+$3;}
	| expr '-' expr {$$=$1-$3;}
	| expr '*' expr {$$=$1*$3;}
	| expr '/' expr { if ($3==0.0)
			  {	
				execerror("division by zero","");
				$$=0;
			  }
			  else { $$=$1/$3; }
			}
	| expr '^' expr {$$=Pow ($1,$3);}
	| '(' expr ')' { $$=$2;}
	| '-' expr %prec UNARYMINUS {$$=-$2;}
	;
%%
main (int argc, char * argv [])
{
	init ();
	yyparse () ;
}
execerror(char * s1, char * s2)
{
	if (s1!=0) {printf ("%s\n", s1);}
	if (s2!=0) {printf ("%s\n", s2);}
	printf ("Error cerca de la linea: %d\n", lineno);
}
yyerror(char * s)
{
	printf ("%s\n", s);
}
