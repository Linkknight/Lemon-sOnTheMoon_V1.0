import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class clickerDatabase {

	static String url = "jdbc:mysql://localhost:3306/"
            + "testdb?allowPublicKeyRetrieval=true&useSSL=false";
    static String user = "root";
    static String password = "test";
    
    
    
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
        
        //butt

    }
	
}
