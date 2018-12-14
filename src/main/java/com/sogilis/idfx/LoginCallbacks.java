package com.sogilis.idfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class LoginCallbacks {

    public static Scene buildScene(Class clazz) throws IOException {
        Parent root = FXMLLoader.load(clazz.getResource("/ui/LoginScene.fxml"), ResourceBundle.getBundle("i18n", Locale.ENGLISH));
        return new Scene(root);
    }

    @FXML
    protected void onConnectionButton(ActionEvent event) {
        Main.primaryStage.setScene(Main.tollScene);
    }

}
