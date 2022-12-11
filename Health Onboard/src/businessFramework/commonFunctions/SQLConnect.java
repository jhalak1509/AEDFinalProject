package businessFramework.commonFunctions;
//import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jhalaksurve
 */
public class SQLConnect {
    
    //Connection con; //local variables
    //Statement st;
        
     public static Connection Connect(){

	
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/HealthOnboard", "root", "root");
        } catch (ClassNotFoundException | SQLException exception) {
            return null;
        }
    }
}

