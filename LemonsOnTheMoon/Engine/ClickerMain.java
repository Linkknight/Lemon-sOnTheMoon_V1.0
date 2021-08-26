import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.stage.Screen;
import java.net.URL;
import java.nio.file.Paths;
import java.io.File;


public class ClickerMain extends Application {

    public static void main(String[] args) {
       launch(args);
    }
    

    @Override
    public void start(Stage stage) throws Exception {    
    	music();
        Pane mainPane = (Pane) FXMLLoader.load(ClickerMain.class.getResource("Home.fxml"));
        stage.setScene(new Scene(mainPane));
        stage.show();
        
    }
    
    
    MediaPlayer mediaPlayer;
	
    public void music() {
		String s = "test.mp3";
		Media h = new Media(Paths.get(s).toUri().toString());
		mediaPlayer = new MediaPlayer(h);
		mediaPlayer.play();
		
	}
    
    public void clickSFX() {
    	
    	String s = "click.mp3";
		Media h = new Media(Paths.get(s).toUri().toString());
		mediaPlayer = new MediaPlayer(h);
		mediaPlayer.play();
    	
    }
}