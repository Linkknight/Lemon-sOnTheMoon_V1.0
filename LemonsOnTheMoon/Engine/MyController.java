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
       
        
        //Switch between the game pages.
        //Switch to the play screen.
        public void playClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }      
        //Switch scene to how to play screen.
        public void HowToPlay(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("HowToPlay.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to status
        public void statusClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Status.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }       
        //Switch to settings.
        public void Settings(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Settings.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //switch scene to upgrade
        public void upgradeClick(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Upgrade.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        //Volume Controller
        public void VolumerSlider(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }
    
        
        
        
      //Go back buttons for the play screen, upgrades screen, and stats screen.
        public void goBackClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }  
        public void goBackHomeClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Home.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }   
        public void SettingsExit(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
        

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
                   
        }
}



 