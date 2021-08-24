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
       
        
        //switch scene to play
        public void playClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
<<<<<<< HEAD
=======
      	  idleTimer.main(null);
<<<<<<< HEAD
>>>>>>> parent of 595da88 (Whitespace Cleanup)
=======
>>>>>>> parent of 595da88 (Whitespace Cleanup)
      	 }
        
        //switch scene to status
        public void statusClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Status.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	  
      	 
      	//currentTime = idle.time;
        //currentTime - intClickCounter = newTime;
      	 }
        
        
        //switch scene to upgrade
        public void upgradeClick(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Upgrade.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
    
      //Go back to play scene
        public void goBackClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }
        
<<<<<<< HEAD
<<<<<<< HEAD
        
        static String url = "jdbc\\:mysql://localhost:3306/"
                + "people?allowPublicKeyRetrieval=true&useSSL=false";
        static String user = "root";
        static String password = "8162001";
        
        public  void insertInformation(String firstName, String lastName, String email, String userName, String userPassword) {
        	        	
            String sql = "INSERT INTO People(firstName, lastName, email, username, userpassword) Values"
            		+ "('" + firstName + "','" + lastName + "','" + email + "','" + userName + "','" + userPassword + "')";
                    
            try {
                Connection con = DriverManager.getConnection(url, user, password);
                Statement st = con.createStatement();
                st.executeUpdate(sql);
            
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        
        public void saveClick(ActionEvent event) {
        	 String firstNames = txtfirstName.getText();
      	   String lastName = txtlastName.getText();
      	   String email = txtemail.getText();
      	   String userName = txtuserName.getText();
      	   String userPassword = txtuserPassword.getText();
     	   
     		insertInformation(firstNames,lastName,email,userName,userPassword);
        }
        
=======
=======
>>>>>>> parent of 595da88 (Whitespace Cleanup)
        public void goBackHomeClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Home.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }   
>>>>>>> parent of 595da88 (Whitespace Cleanup)

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
                   
        }       
           
            
        }



 