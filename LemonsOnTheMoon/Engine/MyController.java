import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.control.Alert;
import javafx.stage.Window;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyController implements Initializable {
	
	 private Stage stage;
	 private Scene scene;
	 private Parent root;
	 
	 clickerDatabase db = new clickerDatabase();
	 
        @FXML
        private TextField txt;
        @FXML
        private Button btn;        
        @FXML
        private Pane rootpane;              
        @FXML
        private ImageView theMoon;        
        @FXML
        private Slider slider;
        @FXML
        private TextField lemonPerTree;
        @FXML
        private TextField lemonPerMinute;
        @FXML
        private TextField CurrencyUpdater;
        
        MediaPlayer mediaPlayer;
       
       
        //Switch between the game pages.
        //Switch to Play
        public void goToPlay(ActionEvent event) throws IOException {
          clickSFX();
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	  
      	  idleTimer idleTimer = new idleTimer();
      	  idleTimer.main();
      	  
      	  CurrencyUpdater.setText(Integer.valueOf(idleTimer.lemonCounter).toString());      	  
      	 }
        //Decreases the time every 10 seconds when the button is pressed.
        public void DecreaseTime(ActionEvent event) throws IOException {
        	clickSFX();
        	  try {
				idleTimer.second-=10;
				System.out.println(idleTimer.second);
			} catch (Exception e) {
				e.printStackTrace();
			}
        	 }
        //Switch scene to How To Play
        public void goToHowToPlay(ActionEvent event) throws IOException {
        	clickSFX();
        	  root = FXMLLoader.load(getClass().getResource("HowToPlay.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to Status
        public void goToStatus(ActionEvent event) throws IOException {
        	clickSFX();
      	  root = FXMLLoader.load(getClass().getResource("Status.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }       
        //Switch to Settings.
        public void goToSettings(ActionEvent event) throws IOException {
        	clickSFX();
        	  root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to Upgrade
        public void goToUpgrade(ActionEvent event) throws IOException {
        	clickSFX();
        	  root = FXMLLoader.load(getClass().getResource("Upgrade.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to Home
        public void goToHome(ActionEvent event) throws IOException {
        	clickSFX();
        	  root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 } 
        //save the game 
        public void saveGame(ActionEvent event) throws IOException {
        	clickSFX();
        	  String strLemonPerTree = lemonPerTree.getText();
        	  String strLemonPerMinute = lemonPerMinute.getText();
        	          	  
        	  clickerDatabase.insertUserInformation(strLemonPerTree,strLemonPerMinute);
     	 }
    
        //Volume Controller
        public void VolumeSlider(ActionEvent event) throws IOException {
        	
        	slider.setValue(mediaPlayer.getVolume() * 100);
        	
        	//slider.valueProperty().bindBidirectional(mediaPlayer.volumeProperty());
        	
        	slider.valueProperty().addListener(new InvalidationListener() {
        		
        		public void invalidated(Observable observable) {
        			
        			if (slider.isValueChanging()) {
                    	
                    	mediaPlayer.setVolume(slider.getValue() / 100);
                    	
                    }
        			
        		}
        		
        	});  
        	
        	if (!slider.isValueChanging()) {
        		
        		slider.setValue((int)Math.round(mediaPlayer.getVolume() * 100));
        		
        	}
      	  
      	 }
        
    	
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
       
        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
                   
        }
        
}
 