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

public class Progress {

    ProgressBar progressBar;

    public ProgressBar getProgressBar() {
        return progressBar;
    }

    public void progress(String s1, String s2) {
        Stage stage = new Stage();
        stage.setTitle(s1);
        stage.getIcons().add(new Image("file:src/resources/images/percent-1.png"));

        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root,242,122);
        scene.getStylesheets().add("file:src/resources/style/alertCss.css");

        progressBar = new ProgressBar();
        progressBar.setPrefSize(200,11);
        progressBar.setMinSize(200,11);
        progressBar.setMaxSize(200,11);

        Separator separator = new Separator(Orientation.HORIZONTAL);
        separator.setPrefWidth(210);
        separator.setMinWidth(210);
        separator.setMaxWidth(210);

        JFXTextArea jfxTextArea = new JFXTextArea();
        jfxTextArea.setEditable(false);
        jfxTextArea.appendText(s2);
        jfxTextArea.setMinSize(200, 60);
        jfxTextArea.setMaxSize(200, 60);
        jfxTextArea.setPrefSize(200, 60);

        root.getChildren().addAll(progressBar, separator, jfxTextArea);
        AnchorPane.setTopAnchor(progressBar, 20d);
        AnchorPane.setLeftAnchor(progressBar, 21d);
        AnchorPane.setBottomAnchor(separator, 81d);
        AnchorPane.setLeftAnchor(separator, 16d);
        AnchorPane.setBottomAnchor(jfxTextArea, 10d);
        AnchorPane.setRightAnchor(jfxTextArea, 21d);

        stage.resizableProperty().setValue(false);
        stage.setMaximized(false);
        stage.setScene(scene);
        stage.show();

    }
}
