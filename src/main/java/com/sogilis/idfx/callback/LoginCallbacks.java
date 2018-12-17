package com.sogilis.idfx.callback;

import com.sogilis.idfx.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Locale;

public class LoginCallbacks {

    @FXML private TextField agentId;
    @FXML private PasswordField agentPassword;

    @FXML protected void onConnectionPressed(ActionEvent event) {
        Main.primaryStage.setScene(Main.tollScene);
        agentId.clear();
        agentPassword.clear();
    }

    @FXML public void setFrench() throws IOException {
        Main.rebuildAllScenes(Locale.FRANCE);
        selfReload();
    }

    @FXML public void setEnglish() throws IOException {
        Main.rebuildAllScenes(Locale.ENGLISH);
        selfReload();
    }

    private void selfReload() {
        String agentIdValue = agentId.getText();
        String agentPasswordValue = agentPassword.getText();

        Main.primaryStage.setScene(Main.loginScene);

        ((TextField) Main.loginScene.lookup("#agentId")).setText(agentIdValue);
        ((PasswordField) Main.loginScene.lookup("#agentPassword")).setText(agentPasswordValue);
    }

}
