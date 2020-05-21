package launcher;

import helpers.ConstScene;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

public class Launcher extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            ConstScene constScene = new ConstScene("/sceneMain/viewSceneMain.fxml");
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
