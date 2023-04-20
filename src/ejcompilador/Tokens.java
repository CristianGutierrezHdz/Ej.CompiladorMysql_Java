
package ejcompilador;

public enum Tokens {
    SALTO_DL,
    
    PR_TABLES, 
    PR_DATABASES,
    PR_TABLE,
    PR_DATABASE,
    PR_VIEW,
    PR_KEY,
    
    PR_INT,
    PR_BIGINT,
    PR_FLOAT,
    PR_DOUBLE,
    PR_DECIMAL,

    PR_VARCHAR,
    PR_CHAR,
    PR_TEXT,
    PR_ENUM,
    PR_DATE,
    PR_TIME,
    PR_DATETIME,
    
    PR_CREATE,
    PR_DROP,
    PR_ALTER,
    
    PR_TRUNCATE,
    PR_RENAME,
    PR_TO,
    PR_SHOW,
    PR_DESCRIBE,
    
    PR_SELECT,
    PR_FROM,
    PR_SET,
    PR_INSERT,
    PR_UPDATE,
    PR_DELETE,
    PR_WHERE,
    PR_ORDER_BY,
    PR_GROUP_BY,
    PR_JOIN,
    PR_UNION,
    PR_DISTINCT,
    PR_HAVING,
    PR_LIMIT,
    PR_OFFSET,
    
    PR_I_JOIN,
    PR_L_JOIN,
    PR_R_JOIN,
    PR_FO_JOIN,
    
    PR_CHANGE,
    PR_COLUMN,
    PR_ADD,
    PR_ON,
    PR_PRIMARY,
    PR_FOREIGN, 
    PR_INDEX, 
    PR_UNIQUE, 
    PR_CHECK, 
    PR_DEFAULT, 
    PR_NOT_NULL, 
    PR_NULL, 
    PR_AUTO_INCREMENT,
    PR_AS,
    PR_REFERENCES,
    PR_REPLACE,
    PR_CONSTRAINT,
    PR_STORED,
    PR_INTO,
    PR_VALUES,
    
    PR_PROCEDURE,
    PR_FUNCTION,
    PR_DECLARE,
    PR_BEGIN,
    PR_END,
    PR_IF,
    PR_ELSE,
    PR_WHILE,
    PR_FOR,
    PR_LOOP,
    
    PR_GRANT, 
    PR_REVOKE, 
    PR_USER, 
    PR_PASSWORD,
    
    PR_COMMIT,
    PR_ROLLBACK,
    PR_SAVEPOINT,
    
    PUNTOYC,
    COMA,
    P_OPEN,
    P_CLOSE,
    LLAVE_A,
    LLAVE_C,
    
    IGUAL,  
    NOIGUAL,
    MAYORQ,
    MENORQ,
    MAYORIG,
    MENORIG,
    
    IN,
    BETWEEN,
    LIKE,
    
    AND,
    OR,
    NOT,
    
    PR_ASC,
    PR_DESC,
    
    S_SUMA,
    S_RESTA,
    S_DIV,
    S_MODULO,
    
    S_MULT,
    PUNTO,
    
    CADENA_CARACT,
    INT,
    FLOAT,
    IDENTIFICADOR,
    
    ERROR
}
