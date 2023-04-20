
package ejcompilador;
import static ejcompilador.Tokens.*;

%%
%class Lexer 
%type Tokens

%{
    public String lexeme;
%}

I=[a-zA-Z_]+
D=[0-9]+ 
WHITE = [ ,\t,\r]+


%%

\n          {return SALTO_DL;}

TABLES      {lexeme=yytext(); return PR_TABLES;}
DATABASES   {lexeme=yytext(); return PR_DATABASES;}
TABLE       {lexeme=yytext(); return PR_TABLE;}
DATABASE    {lexeme=yytext(); return PR_DATABASE;}
VIEW        {lexeme=yytext(); return PR_VIEW;}
KEY         {lexeme=yytext(); return PR_KEY;}
COLUMN      {lexeme=yytext(); return PR_COLUMN;}

/* _________________________________________________________________________ */
INT         {lexeme=yytext(); return PR_INT;}
BIGINT      {lexeme=yytext(); return PR_BIGINT;}
FLOAT       {lexeme=yytext(); return PR_FLOAT;}
DOUBLE      {lexeme=yytext(); return PR_DOUBLE;}
DECIMAL     {lexeme=yytext(); return PR_DECIMAL;}

VARCHAR     {lexeme=yytext(); return PR_VARCHAR;}
CHAR        {lexeme=yytext(); return PR_CHAR;}
TEXT        {lexeme=yytext(); return PR_TEXT;}
ENUM        {lexeme=yytext(); return PR_ENUM;}
DATE        {lexeme=yytext(); return PR_DATE;}
TIME        {lexeme=yytext(); return PR_TIME;}
DATETIME    {lexeme=yytext(); return PR_DATETIME;}

/*___________________________________________________________________________*/
/* Palabras reservadas para definir y manipular bases de datos: */

CREATE      {lexeme=yytext(); return PR_CREATE;}
DROP        {lexeme=yytext(); return PR_DROP;}
ALTER       {lexeme=yytext(); return PR_ALTER;}

TRUNCATE    {lexeme=yytext(); return PR_TRUNCATE;}
RENAME      {lexeme=yytext(); return PR_RENAME;}
TO          {lexeme=yytext(); return PR_TO;}
SHOW        {lexeme=yytext(); return PR_SHOW;}
DESCRIBE    {lexeme=yytext(); return PR_DESCRIBE;}

/*___________________________________________________________________________*/
/* Palabras reservadas para consultar y manipular datos en tablas: */

SELECT      {lexeme=yytext(); return PR_SELECT;}
FROM        {lexeme=yytext(); return PR_FROM;}
SET         {lexeme=yytext(); return PR_SET;}
INSERT      {lexeme=yytext(); return PR_INSERT;}
UPDATE      {lexeme=yytext(); return PR_UPDATE;}
DELETE      {lexeme=yytext(); return PR_DELETE;}
WHERE       {lexeme=yytext(); return PR_WHERE;}
"ORDER BY"  {lexeme=yytext(); return PR_ORDER_BY;}
"GROUP BY"  {lexeme=yytext(); return PR_GROUP_BY;}
UNION       {lexeme=yytext(); return PR_UNION;}
DISTINCT    {lexeme=yytext(); return PR_DISTINCT;}
HAVING      {lexeme=yytext(); return PR_HAVING;}
LIMIT       {lexeme=yytext(); return PR_LIMIT;}
OFFSET      {lexeme=yytext(); return PR_OFFSET;}

"INNER JOIN"        {lexeme=yytext(); return PR_I_JOIN;}      
"LEFT JOIN"         {lexeme=yytext(); return PR_L_JOIN;}
"RICHT JOIN"        {lexeme=yytext(); return PR_R_JOIN;}
"FULL OUTER JOIN"   {lexeme=yytext(); return PR_FO_JOIN;}


/*___________________________________________________________________________*/
/* Palabras reservadas para definir y manipular tablas o columnas */

CHANGE          {lexeme=yytext(); return PR_CHANGE;}
ADD             {lexeme=yytext(); return PR_ADD;}
ON              {lexeme=yytext(); return PR_ON;}
PRIMARY         {lexeme=yytext(); return PR_PRIMARY;}
FOREIGN         {lexeme=yytext(); return PR_FOREIGN;}
INDEX           {lexeme=yytext(); return PR_INDEX;}
UNIQUE          {lexeme=yytext(); return PR_UNIQUE;}
CHECK           {lexeme=yytext(); return PR_CHECK;}
DEFAULT         {lexeme=yytext(); return PR_DEFAULT;}
"NOT NULL"      {lexeme=yytext(); return PR_NOT_NULL;}
NULL            {lexeme=yytext(); return PR_NULL;}
AUTO_INCREMENT  {lexeme=yytext(); return PR_AUTO_INCREMENT;}
AS              {lexeme=yytext(); return PR_AS;}
REFERENCES      {lexeme=yytext(); return PR_REFERENCES;}
REPLACE         {lexeme=yytext(); return PR_REPLACE;}
CONSTRAINT      {lexeme=yytext(); return PR_CONSTRAINT;}
STORED          {lexeme=yytext(); return PR_STORED;}
INTO            {lexeme=yytext(); return PR_INTO;}
VALUES          {lexeme=yytext(); return PR_VALUES;}

/*___________________________________________________________________________*/
/* Palabras reservadas para trabajar con procedimientos almacenados: */

PROCEDURE   {lexeme=yytext(); return PR_PROCEDURE;}
FUNCTION    {lexeme=yytext(); return PR_FUNCTION;}
DECLARE     {lexeme=yytext(); return PR_DECLARE;}
BEGIN       {lexeme=yytext(); return PR_BEGIN;}
END         {lexeme=yytext(); return PR_END;}
IF          {lexeme=yytext(); return PR_IF;}
ELSE        {lexeme=yytext(); return PR_ELSE;}
WHILE       {lexeme=yytext(); return PR_WHILE;}
FOR         {lexeme=yytext(); return PR_FOR;}
LOOP        {lexeme=yytext(); return PR_LOOP;}


/*___________________________________________________________________________*/
/* Palabras reservadas para controlar el acceso y la seguridad de la base de datos: */
GRANT           {lexeme=yytext(); return PR_GRANT;}
REVOKE          {lexeme=yytext(); return PR_REVOKE;}
USER            {lexeme=yytext(); return PR_USER;}
PASSWORD        {lexeme=yytext(); return PR_PASSWORD;}


/*___________________________________________________________________________*/
/* Palabras reservadas para trabajar con transacciones: */
COMMIT       {lexeme=yytext(); return PR_COMMIT;}
ROLLBACK       {lexeme=yytext(); return PR_ROLLBACK;}
SAVEPOINT       {lexeme=yytext(); return PR_SAVEPOINT;}


/*___________________________________________________________________________*/
/* Símbolos de separación y delimitación: */
";"       {lexeme=yytext(); return PUNTOYC;}
"," | " ," | ", "       {lexeme=yytext(); return COMA;}
"("       {lexeme=yytext(); return P_OPEN;}
")"       {lexeme=yytext(); return P_CLOSE;}
"["       {lexeme=yytext(); return LLAVE_A;}
"]"       {lexeme=yytext(); return LLAVE_C;}


/*___________________________________________________________________________*/
/* Símbolos de comparación y operadores lógicos: */
"="           {lexeme=yytext(); return IGUAL;}
"<>" | "!="     {lexeme=yytext(); return NOIGUAL;}
">"           {lexeme=yytext(); return MAYORQ;}
"<"           {lexeme=yytext(); return MENORQ;}
">="          {lexeme=yytext(); return MAYORIG;}
"<="          {lexeme=yytext(); return MENORIG;}

IN          {lexeme=yytext(); return IN;}
BETWEEN     {lexeme=yytext(); return BETWEEN;}
LIKE        {lexeme=yytext(); return LIKE;}


AND     {lexeme=yytext(); return AND;}
OR      {lexeme=yytext(); return OR;}
NOT     {lexeme=yytext(); return NOT;}

/* ___________________________________________________________________________*/
/* palabras clave para especificar el orden de la clasificion de los resultados de una consulta select */
ASC     {lexeme=yytext(); return PR_ASC;}
DESC    {lexeme=yytext(); return PR_DESC;}


/*___________________________________________________________________________*/
/* Símbolos matemáticos y aritméticos: */
"+"       {lexeme=yytext(); return S_SUMA;}
"-"       {lexeme=yytext(); return S_RESTA;}
"/"       {lexeme=yytext(); return S_DIV;}
"\%"      {lexeme=yytext(); return S_MODULO;}

"*"       {lexeme=yytext(); return S_MULT;}
"."       {lexeme=yytext(); return PUNTO;}

{WHITE}             {/* */}

"\'"(.[^']*"\'")    {lexeme=yytext(); return CADENA_CARACT; }
("(-"{D}+")")|{D}+  {lexeme=yytext(); return INT; }
{D}("."{D})         {lexeme=yytext(); return FLOAT; }
{I}({I}|{D})*       {lexeme=yytext(); return IDENTIFICADOR; }

 . {return ERROR;} 
