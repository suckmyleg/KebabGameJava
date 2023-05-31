package com.example.juegokebap.App;

import com.GameEngine.GameMain;
import com.example.juegokebap.Stages.*;
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
        GameMain main = new GameMain(root, canvas);

        main.addStage(new StartMenuStage());
        main.addStage(new FoodFallingMiniGame());
        main.addStage(new SelectModeMenu());
        main.addStage(new SelectDifficultyMenu());
        main.addStage(new Won());
        main.addStage(new Lost());

        main.startStage("StartMenu");
        main.start();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}