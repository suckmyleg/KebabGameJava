package com.example.juegokebap.App;

import com.example.juegokebap.GameMain;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Group root = new Group();
        Canvas canvas = new Canvas(900, 600);

        root.getChildren().add(canvas);

        stage.setScene(new Scene(root));
        new GameMain(canvas);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}