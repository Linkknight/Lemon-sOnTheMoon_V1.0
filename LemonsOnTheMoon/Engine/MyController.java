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
import java.util.ResourceBundle;
import javafx.scene.control.Alert;
import javafx.stage.Window;
import javafx.fxml.Initializable;

public class MyController implements Initializable {

         @FXML
        private TextField txt;

        @FXML
        private Button btn;
        
        @FXML
        private Pane rootpane;
        
        int intClickCounter = 0;
        
        @FXML
        private ImageView theMoon;
        
        @FXML
        void onSubmitClick(ActionEvent event) {
            
            Window owner = btn.getScene().getWindow();
            intClickCounter = intClickCounter + 1;
            btn.setText("clicked: " + intClickCounter);    
        }

        @Override
        public void initialize(URL arg0, ResourceBundle arg1) {
                   
        }
    
}

 