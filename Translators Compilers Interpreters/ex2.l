/*
Realiza un programa Lex que invierta cada palabra del texto de entrada. Además pasa a mayúsuclas cada letra. Imprimir el texto transformado por pantalla.
*/
%%
[a-zA-Z]+ { char aux;
int cont;

        for (cont=1; cont <= (yyleng/2); cont++){
                aux = toupper(yytext[cont-1]);
                yytext[cont-1] = toupper(yytext[yyleng-cont]);
                yytext[yyleng-cont] = aux;
        }
        if ((yyleng % 2) != 0) {yytext[yyleng/2]=toupper(yytext[yyleng/2]);}
        ECHO;
}
%%
main()
{
        yylex();
}
yywrap()
{
        return 1;
}