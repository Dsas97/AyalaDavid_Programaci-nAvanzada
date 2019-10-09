
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static final String db = "espe";
    private static final String URL = "jdbc:mysql://localhost:3306/" + db;
    private static final String USERNAME = "root";
    private static final String PASSSWORD = "";
    
    public  Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSSWORD);
            System.out.println("Conexion realizada con exito");
        } catch (Exception e) {
            System.out.println("Conexion Fallida...");
        }
        return connection;
    }
}

//
//public class Conexion {
//    private static final String URL = "jdbc:mysql://localhost:3306/academia?useTimezone=true&serverTimezone=UTC";
//    private static final String USERNAME = "root";
//    private static final String PASSWORD = "";
//    
//    public static Connection getConnection(){
//        Connection connection = null;
//            try{
//                Class.forName("com.mysql.jdbc.Driver");
//                connection=DriverManager.getConnection(URL, USERNAME, PASSWORD);
//                System.out.println("Conexión realizada con éxito..!!");
//            }catch(Exception e){
//                System.out.println(e);
//                System.out.println("Conexión fallida..!!");
//            }
//            return connection;
//    }
//}