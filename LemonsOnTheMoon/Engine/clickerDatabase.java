import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

public class clickerDatabase {

	static String url = "jdbc:mysql://localhost:3306/" + "clickerDatabase?allowPublicKeyRetrieval=true&useSSL=false";
    static String user = "root";
    static String password = "test";
    
    public static void createClickerDatabase() {
    	
    	String sql = "drop database if exists clickerData; create database clickerData; go";
    	
    	try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate(sql);         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static void updateValue() {

        int intRows;
        String sql = "use clickerData UPDATE ";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(sql);
            intRows = pst.executeUpdate(sql);
            System.out.println(intRows);
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}
