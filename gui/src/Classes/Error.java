/*
 * Copyright (c) 2020. Wojciech Wrona
 * All rights reserved
 */

package Classes;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Error {

    public void error(String s1, String s2) {
        Stage stage = new Stage();
        stage.setTitle(s1);
        stage.getIcons().add(new Image("file:src/resources/images/error.png"));

        AnchorPane root = new AnchorPane();
        Scene scene = new Scene(root,482,242);
        scene.getStylesheets().add("file:src/resources/style/alertCss.css");

        ImageView imageView = new ImageView("file:src/resources/images/error.png");
        imageView.setFitHeight(128);
        imageView.setFitWidth(128);

        Separator separator = new Separator(Orientation.VERTICAL);
        separator.setPrefHeight(166);
        separator.setMinHeight(166);
        separator.setMaxHeight(166);

        JFXTextArea jfxTextArea = new JFXTextArea();
        jfxTextArea.setEditable(false);
        jfxTextArea.appendText(s2);
        jfxTextArea.setWrapText(true);
        jfxTextArea.setMinSize(293.88, 128);
        jfxTextArea.setMaxSize(293.88, 128);
        jfxTextArea.setPrefSize(293.88, 128);

        ScrollPane scrollPane = new ScrollPane();
        scrollPane.setContent(jfxTextArea);
        scrollPane.setMinSize(293.88, 128);
        scrollPane.setMaxSize(293.88, 128);
        scrollPane.setPrefSize(293.88, 128);

        JFXButton jfxButton = new JFXButton("OK");
        jfxButton.setMinSize(87.96, 32);
        jfxButton.setMaxSize(87.96, 32);
        jfxButton.setPrefSize(87.96, 32);

        jfxButton.setOnAction(actionEvent -> {
            stage.close();
        });

        root.getChildren().addAll(imageView,separator, scrollPane,jfxButton);
        AnchorPane.setLeftAnchor(imageView, 15.53d);
        AnchorPane.setTopAnchor(imageView, 57d);
        AnchorPane.setTopAnchor(separator, 33d);
        AnchorPane.setLeftAnchor(separator, 159.06d);
        AnchorPane.setTopAnchor(scrollPane, 33d);
        AnchorPane.setRightAnchor(scrollPane, 15.53d);
        AnchorPane.setBottomAnchor(jfxButton, 15.53d);
        AnchorPane.setRightAnchor(jfxButton,15.53d);

        stage.resizableProperty().setValue(false);
        stage.setMaximized(false);
        stage.setScene(scene);
        stage.show();

    }
}
