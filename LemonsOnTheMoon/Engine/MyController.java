import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
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
	 
        @FXML
        private TextField txt;
        @FXML
        private Button btn;        
        @FXML
        private Pane rootpane;              
        @FXML
        private ImageView theMoon;        
        @FXML
        private TextField txtfirstName;        
        @FXML
        private TextField txtlastName;        
        @FXML
        private TextField txtemail;        
        @FXML
        private TextField txtuserName;        
        @FXML
        private TextField txtuserPassword;
        @FXML
        private TextField lemonPerTree;
        @FXML
        private TextField lemonPerMinute;
       
       
        //Switch between the game pages.
        //Switch to Play
        public void goToPlay(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	  
      	  idleTimer idleTimer = new idleTimer();
      	  idleTimer.main();
      	 }      
        //Switch scene to How To Play
        public void goToHowToPlay(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("HowToPlay.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to Status
        public void goToStatus(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Status.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }       
        //Switch to Settings.
        public void goToSettings(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to Upgrade
        public void goToUpgrade(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Upgrade.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to Home
        public void goToHome(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Home.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 } 
        //save the game 
        public void saveGame(ActionEvent event) throws IOException {
        	  clickerDatabase db = new clickerDatabase();
        	  String strLemonPerTree = lemonPerTree.getText();
        	  String strLemonPerMinute = lemonPerMinute.getText();
        	  
        	  lemonPerMinute.setText("lol");
        	  
        	  clickerDatabase.insertUserInformation(strLemonPerTree,strLemonPerMinute);
     	 }
    
      //Volume Controller
        public void VolumeSlider(ActionEvent event) throws IOException {
      	  
      	 }
       
        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
                   
        }
        
}
 