
package ejcompilador;

import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConexcionDB {

    // Configurar la conexión
    String url = "jdbc:mysql://localhost:3306/";
    String db = "java";
    String user = "root";
    String password = "1423#Ghz1233";
    Connection cx = null;

    public static void main(String[] args) {
        ConexcionDB conexion = new ConexcionDB();

        conexion.conectar();
        String query = "show tables;";
        try {
            conexion.querys("SHOW", query);
        } catch (SQLException ex) {
            Logger.getLogger(ConexcionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        conexion.desconectar();
    }


    public Connection conectar() {
        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            cx = DriverManager.getConnection(url + db, user, password);
            System.out.println("SE CONECTO A LA BASE DE DATOS");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("NO SE CONECTO A LA BASE DE DATOS");
            Logger.getLogger(ConexcionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }

    public void desconectar() {
        if (cx != null) {
            try {
                cx.close();
                System.err.println("CONEXION CERRADA");
            } catch (SQLException ex) {
                Logger.getLogger(ConexcionDB.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("ERROR AL CERRAR LA CONEXION" + ex.getMessage());
            }
        }
    }

    @SuppressWarnings("ConvertToTryWithResources")
    public String querys(String accion, String query) throws SQLException {
        String result = "";
        
        try {
            // Crear un objeto Statement
            java.sql.Statement stmt = cx.createStatement();

            switch (accion) {
                case "CREATE_T", "CREATE_D": {
                    stmt.executeUpdate(query);
                    if ("CREATE_T".equals(accion)){
                        result = "LA TABLA SE CREO CORRECTAMENTE";
                    } else {
                        result = "LA BASE DE DATOS SE CREO CORRECTAMENTE";
                    }
                    break;
                }
                
                case "PR_INSERT": {
                    stmt.executeUpdate(query);
                    result = "LOS DATOS FUERON INSERTADOS CORRECTAMENTE.";
                    break;
                }
                
                case "DROP_D": {
                    stmt.executeUpdate(query);
                    result = "LA BASE DE DATOS SE ELIMINO CORRECTAMENTE";
                    break;
                }
                
                case "SHOW": {
                    ResultSet rs = stmt.executeQuery(query);
                    while (rs.next()) {
                        //String tableName = rs.getString("Tables_in_" + database);

                        result += rs.getString(1) + "\n";
                        //System.out.println(result);

                        //databaseName += rs.getString("Databases") + "\n";
                    }
                    rs.close();
                    break;
                }
                case "script": {
                    // dividir las querys individuales
                    String[] queriesArray = query.split(";");
                    for (String query_dos : queriesArray) {
                        //  asegura que no se ejecuten consultas vacías o que solo contengan espacios en blanco
                        if (!query_dos.trim().equals("")) {
                            // Se ejecuta el script contenido en la variable
                            stmt.execute(query_dos + ";");
                        }
                    }
                    result += "El SCRIPT SE COMPILO Y EJECUTO CORRECTAMENTE.";
                    break;
                }
            }
            
            stmt.close(); // metodo close al objeto Statement
            cx.close();

        } catch (SQLException e) {
            if (accion == "script"){
                return "ERROR EN EL SCRPT: " + e.getMessage();
            } else {
                return "OCURRIO UN ERROR: " + e.getMessage();
            }
            
        }

        return result;
    }
    
}
