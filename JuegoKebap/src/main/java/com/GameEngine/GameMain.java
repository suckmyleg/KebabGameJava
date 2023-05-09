package com.GameEngine;
import com.GameEngine.Management.StageManager;
import com.GameEngine.Stages.Stage;
import com.example.juegokebap.Stages.Home;
import com.example.juegokebap.Stages.Test;
import com.example.juegokebap.Stages.Work;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

/**
 * Class to define the main loader of the game
 * @author suckmyleg
 * @version 1.0
 */
public class GameMain extends Thread{
    private final Canvas canvas;
    StageManager scenes;

    public GameMain(Canvas c){
        this.canvas = c;
        this.scenes = new StageManager();
    }

    public void startStage(String stageName){
        this.scenes.startScene(stageName);
    }

    public void addStage(Stage stage){
        this.scenes.addScene(stage);
    }

    public void run(){
        GraphicsContext graphicContext = canvas.getGraphicsContext2D();

        while(true){
            scenes.Run(canvas.getWidth(), canvas.getHeight());
            graphicContext.drawImage(scenes.getBackground(), 0, 0, canvas.getWidth(), canvas.getHeight());

            scenes.objectsToDraw().forEach(o -> graphicContext.drawImage(o.getImage(), o.getX(), o.getY(), o.getWidth(), o.getHeight()));
            //scenes.objectsToDraw().forEach(System.out::println);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
