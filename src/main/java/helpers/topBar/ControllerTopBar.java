package helpers.topBar;

import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Rectangle2D;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ControllerTopBar implements Initializable {

    @FXML
    Circle min;

    @FXML
    Circle close;

    @FXML
    private Label Title;

    private double lastX = 0.0d;
    private double lastY = 0.0d;
    private double lastWidth = 0.0d;
    private double lastHeight = 0.0d;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Title.setText("App");
    }

    /**** back ****/
    @FXML
    public void back(MouseEvent event) throws IOException {

    }

    /**** minimize ****/
    @FXML
    public void minclick(MouseEvent event) throws IOException {
        ((Stage) ((Circle) event.getSource()).getScene().getWindow()).setIconified(true);
    }

    /**** close screen ****/
    @FXML
    public void closeclick(MouseEvent event) throws IOException {
        //System.exit(0);
        //((Node) event.getSource()).getScene().getWindow().hide();

        Stage stage = (Stage) close.getScene().getWindow();
        // do what you have to do
        stage.close();

    }

    public void maximize(MouseEvent event) {

        Node n = (Node)event.getSource();

        Window w = n.getScene().getWindow();

        double currentX = w.getX();
        double currentY = w.getY();
        double currentWidth = w.getWidth();
        double currentHeight = w.getHeight();

        Screen screen = Screen.getPrimary();
        Rectangle2D bounds = screen.getVisualBounds();

        if( currentX != bounds.getMinX() &&
                currentY != bounds.getMinY() &&
                currentWidth != bounds.getWidth() &&
                currentHeight != bounds.getHeight() ) {

            w.setX(bounds.getMinX());
            w.setY(bounds.getMinY());
            w.setWidth(bounds.getWidth());
            w.setHeight(bounds.getHeight());

            lastX = currentX;  // save old dimensions
            lastY = currentY;
            lastWidth = currentWidth;
            lastHeight = currentHeight;

        } else {
            w.setX(lastX);
            w.setY(lastY);
            w.setWidth(lastWidth);
            w.setHeight(lastHeight);
        }

        event.consume();
    }


}




