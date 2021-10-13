package com.mcplugincreator.minecraftplugincreator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login to your account.");
        setIcon(this.getClass(), primaryStage);

        WebView webView = createWebView("login.html");

        JavaApplication javaApp = new JavaApplication(primaryStage);
        WebEngine webEngine = webView.getEngine();
        JSObject window = (JSObject) webEngine.executeScript("window");
        window.setMember("app", javaApp);

        Scene scene = new Scene(webView, 400, 500);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void setIcon(Class cl, Stage stage) {
        URL url = cl.getResource("icon.png");
        stage.getIcons().add(new Image(url.toString()));
    }

    public static WebView createWebView(String relativePath) {
        WebView webView = new WebView();
        URL url = Main.class.getResource(relativePath);
        webView.getEngine().load(url.toString());

        return webView;
    }

}