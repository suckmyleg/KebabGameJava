package com.example.juegokebap;
import com.GameEngine.Management.StageManager;
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

        this.scenes.addScene(new Home());
        this.scenes.addScene(new Work());
        this.scenes.addScene(new Test());
        this.scenes.startScene("Home");

        start();
    }

    public void run(){
        GraphicsContext graphicContext = canvas.getGraphicsContext2D();

        while(true){
            scenes.Run();
            graphicContext.drawImage(scenes.getBackground(), 0, 0, canvas.getWidth(), canvas.getHeight());

            scenes.objectsToDraw().forEach(o -> graphicContext.drawImage(o.getImage(), o.getX(), o.getY(), o.getWidth(), o.getHeight()));
            scenes.objectsToDraw().forEach(System.out::println);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
