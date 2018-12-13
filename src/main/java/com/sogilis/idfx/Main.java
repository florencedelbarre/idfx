package com.sogilis.idfx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage primaryStage;
    public static Scene loginScene;
    public static Scene tollScene;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Main.primaryStage = primaryStage;
        Main.loginScene = LoginCallbacks.buildScene(getClass());
        Main.tollScene = TollCallbacks.buildScene(getClass());

        primaryStage.setTitle("Première application");
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }

}
