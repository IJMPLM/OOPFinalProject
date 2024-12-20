package finalproject.Connection;
import java.sql.*;

public class ConnectPLMDB {
    
    public static Connection Connect() { 
        Connection conn = null; 
        
       try {
           Class.forName("oracle.jdbc.driver.OracleDriver");
           conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","plm","plm");
           System.out.println("Successful Connection!");

       } catch(Exception e) {
           System.out.print(e);
    }
       return conn;
    }
}
