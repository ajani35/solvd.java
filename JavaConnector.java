
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Naim
 */
public class JavaConnector {
    Connection conn;
    
public static Connection ConnecrDb(){
  try{
     
     Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/repair", "root", "");
     return conn;
  } catch(Exception e){
      
  }
        return null;
}
}
