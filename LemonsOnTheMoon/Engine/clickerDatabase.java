import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class clickerDatabase {

	static String url = "jdbc:mysql://localhost:3306/"
            + "testdb?allowPublicKeyRetrieval=true&useSSL=false";
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
        String sql = "use clickerData UPDATE Books SET Title = 'A Casual Vacancy' Where id=2";
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = con.prepareStatement(sql);
            intRows = pst.executeUpdate(sql);
        
            System.out.println(intRows);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
<<<<<<< Updated upstream
=======
        
        /*
         * 
         * What variables to save?
         * 
         * Tree Growth/Age
         * Game Time
         * Amount of Lemons 
         * 
         * 
         * 
         * 
         * 
         */
        

>>>>>>> Stashed changes
    }
	
}
