import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class clickerDatabase {

	static String url = "jdbc:mysql://localhost:3306/" + "clickerDatabase?allowPublicKeyRetrieval=true&useSSL=false";
    static String user = "root";
    static String password = "8162001";
    
    public static void insertUserInformation(String strLemonPerTree, String strLemonPerMinute) {
    	
    	String sql = "INSERT INTO Player(LemonPerTree, LemonPerMinute) Values"
        		+ "('" + strLemonPerTree + "','" + strLemonPerMinute + "')";;
    	
    	try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate(sql);         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
  
     
}
