package sceneMain.sceneInside;

import helpers.ConstScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSceneInside implements Initializable {

    @FXML
    private Button connection;

    @FXML
    private TextField user;

    @FXML
    private PasswordField userPassword;

    private double xOffset = 100;
    private double yOffset = 100;

    @FXML
    private void handleButtonAction (ActionEvent event) throws Exception {
        Stage stage;
        Parent root;

        if(event.getSource()==connection){
            if (user.getText().equals("user") && userPassword.getText().equals("1234")) {
                ConstScene constScene = new ConstScene((Stage) connection.getScene().getWindow(), "/sceneDashboard/viewSceneDashboard.fxml");
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}




