import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class ClickerMain extends Application {
	
	MyController MyController = new MyController();

    public static void main(String[] args) {
       launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception {    
    	
    	MyController.music();
        Pane mainPane = (Pane) FXMLLoader.load(ClickerMain.class.getResource("Home.fxml"));
        stage.setScene(new Scene(mainPane));
        stage.show();
        
    }
    
}