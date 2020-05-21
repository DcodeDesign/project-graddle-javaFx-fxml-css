package sceneDashboard;

import helpers.ConstScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerSceneDashboard implements Initializable {

    @FXML
    private Button personnes;

    @FXML
    private Button calculatrice;

    @FXML
    private Button jeuxPendu;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void ButtonContact(ActionEvent event) throws Exception {
        ConstScene constScene = new ConstScene("/scenePersonnes/viewScenePersonnes.fxml", 20, 20);
    }

    @FXML
    private void ButtonCalculatrice(ActionEvent event) throws Exception {
        ConstScene constScene = new ConstScene("/sceneCalculatrice/viewSceneCalculatrice.fxml", 120, 120);
    }

    @FXML
    private void ButtonJeuxPendu(ActionEvent event) throws Exception {
        ConstScene constScene = new ConstScene("/JeuxPendu/viewSceneJeuxPendu.fxml", 220, 120);
    }


}




