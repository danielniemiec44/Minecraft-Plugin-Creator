package com.mcplugincreator.minecraftplugincreator;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
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

    public void showProjects() {
        Stage newStage = new Stage();
        System.out.println("Showing projects...");
        newStage.setTitle("Open or create new project.");
        Main.setIcon(this.getClass(), newStage);

        WebView webView = Main.createWebView("index.html");

        JavaApplication javaApp = new JavaApplication(newStage);
        WebEngine webEngine = webView.getEngine();
        JSObject window = (JSObject) webEngine.executeScript("window");
        window.setMember("app", javaApp);

        Scene scene = new Scene(webView, 800, 600);

        newStage.setScene(scene);
        newStage.show();
        stage.close();
    }
}
