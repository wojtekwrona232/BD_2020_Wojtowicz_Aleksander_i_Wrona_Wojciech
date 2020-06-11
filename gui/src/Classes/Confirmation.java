/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package Classes;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Confirmation {

    JFXButton jfxButton, jfxButton1;
    Stage stage;

    public Stage getStage() {
        return stage;
    }
    public JFXButton getJfxButton() {
        return jfxButton;
    }

    public JFXButton getJfxButton1() {
        return jfxButton1;
    }

    public void confirmation(String s1, String s2) {
        stage = new Stage();
        stage.setTitle(s1);
        stage.getIcons().add(new Image("file:src/resources/images/info.png"));

        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root,482,242);
        scene.getStylesheets().add("file:src/resources/style/alertCss.css");

        ImageView imageView = new ImageView("file:src/resources/images/info.png");
        imageView.setFitHeight(128);
        imageView.setFitWidth(128);

        Separator separator = new Separator(Orientation.VERTICAL);
        separator.setPrefHeight(166);
        separator.setMinHeight(166);
        separator.setMaxHeight(166);

        JFXTextArea jfxTextArea = new JFXTextArea();
        jfxTextArea.setEditable(false);
        jfxTextArea.appendText(s2);
        jfxTextArea.setMinSize(293.88, 128);
        jfxTextArea.setMaxSize(293.88, 128);
        jfxTextArea.setPrefSize(293.88, 128);

        jfxButton = new JFXButton("OK");
        jfxButton.setMinSize(87.96, 32);
        jfxButton.setMaxSize(87.96, 32);
        jfxButton.setPrefSize(87.96, 32);

        jfxButton1 = new JFXButton("Cancel");
        jfxButton1.setMinSize(87.96, 32);
        jfxButton1.setMaxSize(87.96, 32);
        jfxButton1.setPrefSize(87.96, 32);

        HBox hBox = new HBox(15.53, jfxButton,jfxButton1);

        root.getChildren().addAll(imageView, separator, jfxTextArea, hBox);
        AnchorPane.setLeftAnchor(imageView, 15.53d);
        AnchorPane.setTopAnchor(imageView, 57d);
        AnchorPane.setTopAnchor(separator, 33d);
        AnchorPane.setLeftAnchor(separator, 159.06d);
        AnchorPane.setTopAnchor(jfxTextArea, 33d);
        AnchorPane.setRightAnchor(jfxTextArea, 15.53d);
        AnchorPane.setBottomAnchor(hBox, 15.53d);
        AnchorPane.setRightAnchor(hBox,15.53d);

        stage.resizableProperty().setValue(false);
        stage.setMaximized(false);
        stage.setScene(scene);
        stage.show();

    }
}
