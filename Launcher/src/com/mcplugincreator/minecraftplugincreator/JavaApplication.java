package com.mcplugincreator.minecraftplugincreator;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import netscape.javascript.JSObject;

import java.net.URL;

public class JavaApplication {
    private Stage stage;


    JavaApplication(Stage stage) {
        this.stage = stage;
    }



    public void test() {
        System.out.println("test");
    }

    public void update() {
        Stage newStage = new Stage();
        newStage.initStyle(StageStyle.UNDECORATED);
        Main.setIcon(this.getClass(), newStage);

        WebView webView = Main.createWebView("update.html");

        Scene scene = new Scene(webView, 400, 400);

        newStage.setScene(scene);
        newStage.show();
        stage.close();
    }
}
