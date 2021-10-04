package com.mcplugincreator.minecraftplugincreator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.web.WebView;

import java.net.URL;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Login to your account.");

        WebView webView = new WebView();

        URL url = this.getClass().getResource("login.html");
        webView.getEngine().load(url.toString());

        Scene scene = new Scene(webView, 400, 500);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }
}