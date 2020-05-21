package helpers;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ConstScene {

    @FXML
    private Label Title;

    private double xOffset = 0;
    private double yOffset = 0;

    public ConstScene(String fxml, double x, double y) throws Exception {
        GridPane loader = FXMLLoader.load(getClass().getResource(fxml));

        Stage stage = new Stage();
        Scene scene = new Scene(loader);

        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setX(x);
        stage.setY(y);

        stage.setResizable(true);
        ResizeHelper.addResizeListener(stage);

        loader.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isControlDown() || event.isShiftDown()) {
                    return;
                }
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        loader.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isControlDown() || event.isShiftDown()) {
                    return;
                }
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });

        stage.show();
    }

    public ConstScene(final Stage stage, String fxml) throws Exception {
        Parent root;

        root = FXMLLoader.load(getClass().getResource(fxml));

        Scene scene = new Scene(root);
        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);

        stage.setResizable(true);
        ResizeHelper.addResizeListener(stage);

        root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isControlDown() || event.isShiftDown()) {
                    return;
                }
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.isControlDown() || event.isShiftDown()) {
                    return;
                }
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });

        stage.show();
    }

    public ConstScene(String fxml) throws Exception {
        GridPane loader = FXMLLoader.load(getClass().getResource(fxml));

        Stage stage = new Stage();
        Scene scene = new Scene(loader);

        stage.setScene(scene);

        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setResizable(true);
        ResizeHelper.addResizeListener(stage);


        loader.setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (event.isControlDown() || event.isShiftDown()) {
                    return;
                }
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        loader.setOnMouseDragged(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (event.isControlDown() || event.isShiftDown()) {
                    return;
                }
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });

        stage.show();
    }
}
