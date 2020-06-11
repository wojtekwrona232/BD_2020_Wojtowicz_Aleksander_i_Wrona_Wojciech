/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package GUI;

import com.jfoenix.controls.JFXProgressBar;
import javafx.application.Preloader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoadingScreen extends Preloader {
    JFXProgressBar jfxProgressBar;
    Stage stage;

    private Scene createPreloaderScene() {
        jfxProgressBar = new JFXProgressBar();
        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(jfxProgressBar);
        borderPane.setCursor(Cursor.WAIT);
        return new Scene(borderPane, 300, 300);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setScene(createPreloaderScene());
        stage.setResizable(false);
        stage.show();
    }

    @Override
    public void handleProgressNotification(ProgressNotification pn) {
        jfxProgressBar.setProgress(pn.getProgress());
    }

    @Override
    public void handleStateChangeNotification(StateChangeNotification evt) {
        if (evt.getType() == StateChangeNotification.Type.BEFORE_START) {
            stage.hide();
        }
    }

}
