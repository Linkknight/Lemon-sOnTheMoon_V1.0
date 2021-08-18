import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.Screen;
import java.net.URL;
import java.io.File;


public class ClickerMain extends Application {

    public static void main(String[] args) {
       launch(args);
    }
    

    @Override
    public void start(Stage stage) throws Exception {
       URL url = new File("C:\\Users\\james\\Documents\\GitHub\\Lemon-sOnTheMoon_V1.0\\LemonsOnTheMoon\\Engine\\LemonsOnTheMoonTitle.fxml").toURI().toURL();
       Parent root = FXMLLoader.load(url);
       stage.setScene(new Scene(root,200, 200));
       stage.setFullScreen(true);
       stage.show();
    }
    
   
    public void openGame(Stage stage) throws Exception{
    	URL url = new File("C:\\Users\\james\\Documents\\GitHub\\Lemon-sOnTheMoon_V1.0\\LemonsOnTheMoon\\Engine\\LemonOnTheMoon.fxml").toURI().toURL();
    	Parent root = FXMLLoader.load(url);
    	Pane gamePane = (Pane) FXMLLoader.load(ClickerMain.class.getResource("LemonOnTheMoon.fxml"));
    	stage.setScene(new Scene(root, 200, 200));
    	stage.show();
    }

}