package com.sogilis.idfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class TollCallbacks {

    public static Scene buildScene(Class clazz) throws IOException {
        Parent root = FXMLLoader.load(clazz.getResource("/ui/TollScene.fxml"));
        return new Scene(root);
    }

}
