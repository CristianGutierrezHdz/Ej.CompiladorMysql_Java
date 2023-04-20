/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejcompilador;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;

/**
 *
 * @author Criss
 */
public class IU extends javax.swing.JFrame {

    public IU() {
        initComponents();
        jButton6.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Ejemplos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        jLabel1.setText("Compilador");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("Analizador Sintactico");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Analizador Lexico");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("Querys");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setText("Analizar Lexico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Analizar Sintaxis");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Limpiar todo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Analizar todo");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Compilar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(jButton2))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jButton3)
                            .addComponent(jLabel1)
                            .addComponent(jButton6))
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4))
                        .addGap(41, 41, 41))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jTextArea1.setText("CREATE TABLE direcciones ( \nid INT AUTO_INCREMENT PRIMARY KEY, \ncp VARCHAR(50), \ndireccion VARCHAR(50) \n); \n\n"
                + "INSERT INTO direcciones (cp, direccion) \nVALUES ('28001', 'Calle Serrano 1'), \n       ('08001', 'Plaça Catalunya 1'), \n       ('28002', 'Calle Velázquez 10');\n\n"
                + "DROP DATABASE hola; \n\nDROP TABLE direcciones; \n\n");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
            analizadorLexico();
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jTextArea3.setText("");
        
        String ST = jTextArea1.getText();
        String todoMayuscula = ST.toUpperCase();
        Sintax s = new Sintax(new ejcompilador.LexerCup(new StringReader(todoMayuscula)));

        try {
            s.parse();
            jTextArea3.setText("Analisis realizado correctamente");
            jTextArea3.setForeground(new Color(25, 111, 61));
            jButton6.setEnabled(true);
        } catch (Exception ex) {
            Symbol sym = s.getS();
            jTextArea3.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: "
                    + (sym.left + 1) + ", Texto: \"");
            jTextArea3.setForeground(Color.red);
            jButton6.setEnabled(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        try {
            analizadorLexico();
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        try {
            analizadorLexico();
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        jTextArea3.setText("");
        
        String ST = jTextArea1.getText();
        String todoMayuscula = ST.toUpperCase();
        Sintax s = new Sintax(new ejcompilador.LexerCup(new StringReader(todoMayuscula)));

        try {
            s.parse();
            jTextArea3.setText("Analisis realizado correctamente");
            jTextArea3.setForeground(new Color(25, 111, 61));
            jButton6.setEnabled(true);
        } catch (Exception ex) {
            Symbol sym = s.getS();
            jTextArea3.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: "
                    + (sym.left + 1) + ", Texto: \"");
            jTextArea3.setForeground(Color.red);
            jButton6.setEnabled(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        jTextArea1.setText("");
        jTextArea2.setText("");
        jTextArea3.setText("");
        jTextArea4.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IU().setVisible(true);
            }
        });
    }
    
    public void analizadorLexico() throws FileNotFoundException, IOException {
        String resultado = "";

        File fichero = new File("fichero.txt");
        PrintWriter writer;

        try {
            writer = new PrintWriter(fichero);

            writer.print(jTextArea1.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader reader = new BufferedReader(new FileReader("fichero.txt"));
            Lexer lexer = new Lexer(reader);
            
            while (true) {
                Tokens token = lexer.yylex();
                if (token != null) {
                    switch (token) {
                        case SALTO_DL: {
                            break;
                        }

                        case PR_TABLES, PR_DATABASES, PR_TABLE, PR_DATABASE, PR_VIEW, PR_KEY, PR_INT, PR_BIGINT, PR_FLOAT, PR_DOUBLE, PR_DECIMAL, PR_VARCHAR, 
                                PR_CHAR, PR_TEXT, PR_ENUM, PR_DATE, PR_TIME, PR_DATETIME, PR_CREATE, PR_DROP, PR_ALTER, PR_TRUNCATE, PR_RENAME, 
                                PR_SHOW, PR_DESCRIBE, PR_SELECT, PR_FROM, PR_SET, PR_INSERT, PR_UPDATE, PR_DELETE, PR_WHERE, PR_ORDER_BY, 
                                PR_GROUP_BY, PR_UNION, PR_DISTINCT, PR_HAVING, PR_LIMIT, PR_OFFSET, PR_I_JOIN, PR_L_JOIN, PR_R_JOIN, PR_FO_JOIN, PR_INTO,
                                PR_CHANGE, PR_COLUMN, PR_ADD, PR_ON, PR_PRIMARY, PR_FOREIGN, PR_INDEX, PR_UNIQUE, PR_CHECK, PR_DEFAULT, PR_NOT_NULL, 
                                PR_NULL, PR_AUTO_INCREMENT, PR_AS, PR_REFERENCES, PR_REPLACE, PR_PROCEDURE, PR_CONSTRAINT, PR_STORED, PR_FUNCTION, PR_DECLARE, PR_BEGIN, PR_END, PR_IF, PR_ELSE, PR_WHILE, PR_FOR, 
                                PR_LOOP, PR_GRANT, PR_REVOKE, PR_USER, PR_PASSWORD, PR_COMMIT, PR_ROLLBACK, PR_SAVEPOINT, PUNTOYC, COMA, P_OPEN, P_CLOSE, 
                                LLAVE_A, PR_VALUES, LLAVE_C, IGUAL, NOIGUAL, MAYORQ, MENORQ, MAYORIG, MENORIG, IN, BETWEEN, LIKE, AND, OR, NOT,PR_ASC, PR_DESC, 
                                S_SUMA, S_RESTA, S_MULT, S_DIV, S_MODULO, PUNTO, CADENA_CARACT, INT, FLOAT, IDENTIFICADOR: {
                            resultado += lexer.lexeme + "\t\t" + token + "\n";
                            break;
                        }

                        case ERROR: {
                            resultado += "  ERROR! CARACTER NO DEFINIDO\n";
                            break;
                        }
                    }
                } else {
                    jTextArea2.setText(resultado);
                    return;
                }

                }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public void analizarLexicoYCompilar() throws FileNotFoundException, IOException, SQLException {
        String resul = "";
        int numQuerys = 0;
        ConexcionDB conexion = new ConexcionDB();
        conexion.conectar();

        File fichero = new File("fichero.txt");
        PrintWriter writer;

        try {
            writer = new PrintWriter(fichero);

            writer.print(jTextArea1.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Reader reader = new BufferedReader(new FileReader("fichero.txt"));
            Lexer lexer = new Lexer(reader);
            
            String query = jTextArea1.getText();
        
            while (true) {
                Tokens token = lexer.yylex();
                if (token != null && numQuerys <= 1) {
                    switch (token) {
                        // CREATE SELECT UPDATE DELETE ALTER DROP SHOW                         
                        case PR_CREATE: {
                            token = lexer.yylex();
                            switch (token) {
                                case PR_TABLE: {                                 
                                    resul += conexion.querys("CREATE_T", query);
                                    numQuerys++;
                                    break;
                                }
                                case PR_DATABASE: {
                                    resul += conexion.querys("CREATE_D", query);
                                    numQuerys++;
                                    break;
                                }
                            }
                            break;
                        }
                        case PR_INSERT: {
                            resul += conexion.querys("PR_INSERT", query);
                            numQuerys++;
                            break;
                        }
                        case PR_DROP: {
                            token = lexer.yylex();
                            switch (token) {                    
                                case PR_DATABASE: {
                                    resul += conexion.querys("DROP_D", query);
                                    break;
                                }
                            }
                            break;
                        }
                        case PR_SHOW: {
                            token = lexer.yylex();
                            switch (token) {
                                case PR_TABLES, PR_DATABASES: {
                                    resul += conexion.querys("SHOW", query);
                                    break;
                                }
                            }
                            numQuerys++;
                            break;
                        }
                        default: {
                            break;
                        }
                    }
                } else {
                    if (numQuerys <= 1){
                        jTextArea4.setText(resul);
                    } else {
                        resul = conexion.querys("script", query);
                        jTextArea4.setText(resul);
                    }
                    conexion.desconectar();
                    return;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(IU.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
