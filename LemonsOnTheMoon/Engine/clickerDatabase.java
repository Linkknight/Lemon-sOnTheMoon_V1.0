import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class clickerDatabase {

	static String url = "jdbc:mysql://localhost:3306/"
            + "clickerDatabase?allowPublicKeyRetrieval=true&useSSL=false";
    static String user = "root";
    static String password = "8162001";
    
    public  void insertInformation(String txt1, String txt2) {
    	
    	


        String sql = "INSERT INTO Player(LemonPerTree,NumberOfTrees) Values"
        		+ "('" + txt1 + "','"  + txt2 + "')";
                
        try {
            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            st.executeUpdate(sql);
        
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        
}
