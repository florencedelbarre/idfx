package com.sogilis.idfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;
import java.util.ResourceBundle;

public class TollApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/ui/LoginScene.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        String appTitle = ResourceBundle.getBundle("i18n", Locale.FRANCE).getString("app-title");
        primaryStage.setTitle(appTitle);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(TollApplication.class, args);
    }

}
