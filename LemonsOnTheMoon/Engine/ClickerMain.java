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
        Pane mainPane = (Pane) FXMLLoader.load(ClickerMain.class.getResource("Home.fxml"));
        stage.setScene(new Scene(mainPane));
        stage.show();
    }

}