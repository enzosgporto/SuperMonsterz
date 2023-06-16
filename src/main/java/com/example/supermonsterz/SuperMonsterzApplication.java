package com.example.supermonsterz;

import com.example.supermonsterz.characters.player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SuperMonsterzApplication extends Application {
    static public player Player;
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SuperMonsterzApplication.class.getResource("profile-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("SuperMonsterz");
        stage.setScene(scene);
        stage.show();
    }

    public static void setScene(String controllerName) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(SuperMonsterzApplication.class.getResource(controllerName));
        scene.setRoot(fxmlLoader.load());
    }

    public static void main(String[] args) {
        launch();
    }
}