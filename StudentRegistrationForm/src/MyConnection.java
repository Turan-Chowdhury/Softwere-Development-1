
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
    
    public static String user= "root";
    public static String pass= "";
    public static String connString= "jdbc:mysql://localhost:3306/registration_form";
    
    public static Connection getConnection() {
        
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(connString,user,pass);
            System.out.println("Turan u are connected");
        } 
        catch (SQLException e) {
            System.err.println(e);
        }
        
        return conn;
    }
}
