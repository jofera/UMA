/*
Construye un programa lex que elimine comentarios C, bien del tipo /* .. */ o bien //
*/

%s COMENT
%%
"/*" {BEGIN COMENT;}
<COMENT>.|\n {;}
<COMENT>"*/"	{BEGIN INITIAL;}
"//".*\n	{;}