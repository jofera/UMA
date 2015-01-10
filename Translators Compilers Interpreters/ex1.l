/*
Para la siguiente entrada:
Ciervo tigre habitacion
raton que? cuando donde
curso cuarto 4to f.i.n.

la salida debe ser:
C: Ciervo
B: tigre
A: habitacion
D: raton
E: que?
C: cuando
B: donde
B: curso
C: cuarto
E: 4to
E: f.i.n.
A: 1 B: 3 C: 3 D: 1 E: 3
*/

%{
int A=0, B=0, C=0, D=0, E=0;
%}
l [A-Za-z]
b [ \t\n]
v [aeiou]
c [b-df-hj-np-tv-zB-DF-HJ-NP-TV-Z]
%%
{b}+ {/*saltar blancos*/}
{l}*{v}{v}{l}*{c} {A++; printf("A: %s\n", yytext);}
({c}|{v}{c})*{v} {B++; printf("B: %s\n", yytext);}
{l}*{v} {C++; printf("C: %s\n", yytext);}
{l}+ {D++; printf("D: %s\n", yytext);}
[^ \n\t]* {E++; printf("E: %s\n", yytext);}
%%
main()
{
yylex();
printf("A: %d B: %d C: %d D: %d E: %d\n", A, B, C, D, E);
}