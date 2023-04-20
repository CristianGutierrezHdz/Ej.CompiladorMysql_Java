

package ejcompilador;
import java_cup.runtime.Symbol;

%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup     
%full         
%line
%char

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

I=[a-zA-Z_]+
D=[0-9]+ 
WHITE = [ ,\t,\r\n]+

%%

TABLES      {return new Symbol(sym.PR_TABLES, yychar, yyline, yytext());}
DATABASES   {return new Symbol(sym.PR_DATABASES, yychar, yyline, yytext());}  
TABLE       {return new Symbol(sym.PR_TABLE, yychar, yyline, yytext());}
DATABASE    {return new Symbol(sym.PR_DATABASE, yychar, yyline, yytext());}
VIEW        {return new Symbol(sym.PR_VIEW, yychar, yyline, yytext());}
KEY         {return new Symbol(sym.PR_KEY, yychar, yyline, yytext());}

/* _________________________________________________________________________ */
INT         {return new Symbol(sym.PR_INT, yychar, yyline, yytext());}
BIGINT      {return new Symbol(sym.PR_BIGINT, yychar, yyline, yytext());}
FLOAT       {return new Symbol(sym.PR_FLOAT, yychar, yyline, yytext());}
DOUBLE      {return new Symbol(sym.PR_DOUBLE, yychar, yyline, yytext());}
DECIMAL     {return new Symbol(sym.PR_DECIMAL, yychar, yyline, yytext());}

VARCHAR     {return new Symbol(sym.PR_VARCHAR, yychar, yyline, yytext());}
CHAR        {return new Symbol(sym.PR_CHAR, yychar, yyline, yytext());}
TEXT        {return new Symbol(sym.PR_TEXT, yychar, yyline, yytext());}
ENUM        {return new Symbol(sym.PR_ENUM, yychar, yyline, yytext());}
DATE        {return new Symbol(sym.PR_DATE, yychar, yyline, yytext());}
TIME        {return new Symbol(sym.PR_TIME, yychar, yyline, yytext());}
DATETIME    {return new Symbol(sym.PR_DATETIME, yychar, yyline, yytext());}

/*___________________________________________________________________________*/
/* Palabras reservadas para definir y manipular bases de datos: */

CREATE      {return new Symbol(sym.PR_CREATE, yychar, yyline, yytext());}
DROP        {return new Symbol(sym.PR_DROP, yychar, yyline, yytext());}
ALTER       {return new Symbol(sym.PR_ALTER, yychar, yyline, yytext());}

TRUNCATE    {return new Symbol(sym.PR_TRUNCATE, yychar, yyline, yytext());}
RENAME      {return new Symbol(sym.PR_RENAME, yychar, yyline, yytext());}
TO      {return new Symbol(sym.PR_TO, yychar, yyline, yytext());}
SHOW        {return new Symbol(sym.PR_SHOW, yychar, yyline, yytext());}
DESCRIBE    {return new Symbol(sym.PR_DESCRIBE, yychar, yyline, yytext());}

/*___________________________________________________________________________*/
/* Palabras reservadas para consultar y manipular datos en tablas: */

SELECT      {return new Symbol(sym.PR_SELECT, yychar, yyline, yytext());}
FROM        {return new Symbol(sym.PR_FROM, yychar, yyline, yytext());}
SET         {return new Symbol(sym.PR_SET, yychar, yyline, yytext());}
INSERT      {return new Symbol(sym.PR_INSERT, yychar, yyline, yytext());}
UPDATE      {return new Symbol(sym.PR_UPDATE, yychar, yyline, yytext());}
DELETE      {return new Symbol(sym.PR_DELETE, yychar, yyline, yytext());}
WHERE       {return new Symbol(sym.PR_WHERE, yychar, yyline, yytext());}
"ORDER BY"  {return new Symbol(sym.PR_ORDER_BY, yychar, yyline, yytext());}
"GROUP BY"  {return new Symbol(sym.PR_GROUP_BY, yychar, yyline, yytext());}
UNION       {return new Symbol(sym.PR_UNION, yychar, yyline, yytext());}
DISTINCT    {return new Symbol(sym.PR_DISTINCT, yychar, yyline, yytext());}
HAVING      {return new Symbol(sym.PR_HAVING, yychar, yyline, yytext());}
LIMIT       {return new Symbol(sym.PR_LIMIT, yychar, yyline, yytext());}
OFFSET      {return new Symbol(sym.PR_OFFSET, yychar, yyline, yytext());}

"INNER JOIN"        {return new Symbol(sym.PR_I_JOIN, yychar, yyline, yytext());}      
"LEFT JOIN"         {return new Symbol(sym.PR_L_JOIN, yychar, yyline, yytext());}
"RICHT JOIN"        {return new Symbol(sym.PR_R_JOIN, yychar, yyline, yytext());}
"FULL OUTER JOIN"   {return new Symbol(sym.PR_FO_JOIN, yychar, yyline, yytext());}


/*___________________________________________________________________________*/
/* Palabras reservadas para definir y manipular tablas: */

CHANGE          {return new Symbol(sym.PR_CHANGE, yychar, yyline, yytext());}
COLUMN          {return new Symbol(sym.PR_COLUMN, yychar, yyline, yytext());}
ADD             {return new Symbol(sym.PR_ADD, yychar, yyline, yytext());}
ON              {return new Symbol(sym.PR_ON, yychar, yyline, yytext());}
PRIMARY         {return new Symbol(sym.PR_PRIMARY, yychar, yyline, yytext());}
FOREIGN         {return new Symbol(sym.PR_FOREIGN, yychar, yyline, yytext());}
INDEX           {return new Symbol(sym.PR_INDEX, yychar, yyline, yytext());}
UNIQUE          {return new Symbol(sym.PR_UNIQUE, yychar, yyline, yytext());}
CHECK           {return new Symbol(sym.PR_CHECK, yychar, yyline, yytext());}
DEFAULT         {return new Symbol(sym.PR_DEFAULT, yychar, yyline, yytext());}
"NOT NULL"      {return new Symbol(sym.PR_NOT_NULL, yychar, yyline, yytext());}
NULL            {return new Symbol(sym.PR_NULL, yychar, yyline, yytext());}
AUTO_INCREMENT  {return new Symbol(sym.PR_AUTO_INCREMENT, yychar, yyline, yytext());}
AS              {return new Symbol(sym.PR_AS, yychar, yyline, yytext());}  
REFERENCES      {return new Symbol(sym.PR_REFERENCES, yychar, yyline, yytext());} 
REPLACE         {return new Symbol(sym.PR_REPLACE, yychar, yyline, yytext());} 
CONSTRAINT      {return new Symbol(sym.PR_CONSTRAINT, yychar, yyline, yytext());}  
STORED          {return new Symbol(sym.PR_STORED, yychar, yyline, yytext());}
INTO            {return new Symbol(sym.PR_INTO, yychar, yyline, yytext());}
VALUES          {return new Symbol(sym.PR_VALUES, yychar, yyline, yytext());}

/*___________________________________________________________________________*/
/* Palabras reservadas para trabajar con procedimientos almacenados: */

PROCEDURE   {return new Symbol(sym.PR_PROCEDURE, yychar, yyline, yytext());}
FUNCTION    {return new Symbol(sym.PR_FUNCTION, yychar, yyline, yytext());}
DECLARE     {return new Symbol(sym.PR_DECLARE, yychar, yyline, yytext());}
BEGIN       {return new Symbol(sym.PR_BEGIN, yychar, yyline, yytext());}
END         {return new Symbol(sym.PR_END, yychar, yyline, yytext());}
IF          {return new Symbol(sym.PR_IF, yychar, yyline, yytext());}
ELSE        {return new Symbol(sym.PR_ELSE, yychar, yyline, yytext());}
WHILE       {return new Symbol(sym.PR_WHILE, yychar, yyline, yytext());}
FOR         {return new Symbol(sym.PR_FOR, yychar, yyline, yytext());}
LOOP        {return new Symbol(sym.PR_LOOP, yychar, yyline, yytext());}


/*___________________________________________________________________________*/
/* Palabras reservadas para controlar el acceso y la seguridad de la base de datos: */
GRANT       {return new Symbol(sym.PR_GRANT, yychar, yyline, yytext());}
REVOKE       {return new Symbol(sym.PR_REVOKE, yychar, yyline, yytext());}
USER       {return new Symbol(sym.PR_USER, yychar, yyline, yytext());}
PASSWORD       {return new Symbol(sym.PR_PASSWORD, yychar, yyline, yytext());}


/*___________________________________________________________________________*/
/* Palabras reservadas para trabajar con transacciones: */
COMMIT       {return new Symbol(sym.PR_COMMIT, yychar, yyline, yytext());}
ROLLBACK       {return new Symbol(sym.PR_ROLLBACK, yychar, yyline, yytext());}
SAVEPOINT       {return new Symbol(sym.PR_SAVEPOINT, yychar, yyline, yytext());}


/*___________________________________________________________________________*/
/* Símbolos de separación y delimitación: */
";"         {return new Symbol(sym.PUNTOYC, yychar, yyline, yytext());}
"," |
{WHITE}(","{WHITE}) |
{WHITE}"," |
","{WHITE} {return new Symbol(sym.COMA, yychar, yyline, yytext());}
"("         {return new Symbol(sym.P_OPEN, yychar, yyline, yytext());}
")"         {return new Symbol(sym.P_CLOSE, yychar, yyline, yytext());}
"["         {return new Symbol(sym.LLAVE_A, yychar, yyline, yytext());}
"]"         {return new Symbol(sym.LLAVE_C, yychar, yyline, yytext());}


/*___________________________________________________________________________*/
/* Símbolos de comparación y operadores lógicos: */
"="           {return new Symbol(sym.IGUAL, yychar, yyline, yytext());}
"<>" | "!="     {return new Symbol(sym.NOIGUAL, yychar, yyline, yytext());}
">"           {return new Symbol(sym.MAYORQ, yychar, yyline, yytext());}
"<"           {return new Symbol(sym.MENORQ, yychar, yyline, yytext());}
">="          {return new Symbol(sym.MAYORIG, yychar, yyline, yytext());}
"<="          {return new Symbol(sym.MENORIG, yychar, yyline, yytext());}

IN          {return new Symbol(sym.IN, yychar, yyline, yytext());}
BETWEEN     {return new Symbol(sym.BETWEEN, yychar, yyline, yytext());}
LIKE        {return new Symbol(sym.LIKE, yychar, yyline, yytext());}

AND     {return new Symbol(sym.AND, yychar, yyline, yytext());}
OR      {return new Symbol(sym.OR, yychar, yyline, yytext());}
NOT     {return new Symbol(sym.NOT, yychar, yyline, yytext());}

/* ___________________________________________________________________________*/
/* palabras clave para especificar el orden de la clasificion de los resultados de una consulta select */
ASC     {return new Symbol(sym.PR_ASC, yychar, yyline, yytext());}
DESC    {return new Symbol(sym.PR_DESC, yychar, yyline, yytext());}


/*___________________________________________________________________________*/
/* Símbolos matemáticos y aritméticos: */
"+"       {return new Symbol(sym.S_SUMA, yychar, yyline, yytext());}
"-"       {return new Symbol(sym.S_RESTA, yychar, yyline, yytext());}
"/"       {return new Symbol(sym.S_DIV, yychar, yyline, yytext());}
"\%"      {return new Symbol(sym.S_MODULO, yychar, yyline, yytext());}

"*"       {return new Symbol(sym.S_MULT, yychar, yyline, yytext());}
"."       {return new Symbol(sym.PUNTO, yychar, yyline, yytext());}

{WHITE}             {/**/}

"\'"(.[^']*"\'")    {return new Symbol(sym.CADENA_CARACT, yychar, yyline, yytext());}
("(-"{D}+")")|{D}+  {return new Symbol(sym.INT, yychar, yyline, yytext());}
{D}("."{D})         {return new Symbol(sym.FLOAT, yychar, yyline, yytext());}
{I}({I}|{D})*       {return new Symbol(sym.IDENTIFICADOR, yychar, yyline, yytext());}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());} 