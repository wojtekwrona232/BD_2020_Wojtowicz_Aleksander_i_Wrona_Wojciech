package Alerts;

import com.jfoenix.controls.JFXSpinner;
import com.jfoenix.controls.JFXTextArea;
import javafx.geometry.Orientation;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Loading {

    public void progress(String s1, String s2) {
        Stage stage = new Stage();
        stage.setTitle(s1);
        stage.getIcons().add(new Image("file:src/resources/images/percent-1.png"));

        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root,242,122);
        scene.getStylesheets().add("file:src/resources/style/alertCss.css");

        ProgressBar progressBar = new ProgressBar();
        progressBar.setPrefSize(200,22);
        progressBar.setMinSize(200,22);
        progressBar.setMaxSize(200,22);

        root.getChildren().addAll(progressBar);
        AnchorPane.setTopAnchor(progressBar, 50d);
        AnchorPane.setLeftAnchor(progressBar, 21d);

        scene.cursorProperty().set(Cursor.WAIT);
        stage.resizableProperty().setValue(false);
        stage.setMaximized(false);
        stage.setScene(scene);
        stage.show();

    }
}
