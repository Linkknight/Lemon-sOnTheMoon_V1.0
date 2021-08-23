import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.scene.control.Alert;
import javafx.stage.Window;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



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
        idleTimer ti = new idleTimer();
        

        //These are all the buttons used to switch between screens.
        //Switch to the play area.
        public void playClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	  idleTimer.main(null);
      	 }      
        //Switch to the Statistics area.
        public void statusClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Status.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 
      	//currentTime = idle.time;
        //currentTime - intClickCounter = newTime;
      	 }
        //Switch to the Upgrades area.
        public void upgradeClick(ActionEvent event) throws IOException {
        	  root = FXMLLoader.load(getClass().getResource("Upgrade.fxml"));
        	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        	  scene = new Scene(root);
        	  stage.setScene(scene);
        	  stage.show();
        	 }
     
      //Go back buttons for the upgrades screen, the stats screen, and to return to main menu from game screen.
        //Back button for Upgrades screen.
        public void goBackClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Play.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }
        //Back button to return to the main menu.
        public void goBackHomeClick(ActionEvent event) throws IOException {
      	  root = FXMLLoader.load(getClass().getResource("Home.fxml"));
      	  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      	  scene = new Scene(root);
      	  stage.setScene(scene);
      	  stage.show();
      	 }   

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
                   
        }
}

 