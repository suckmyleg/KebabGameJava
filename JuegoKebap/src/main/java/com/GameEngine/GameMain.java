package com.GameEngine;
import com.GameEngine.Management.StageManager;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Utils.MouseEvents;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.MouseEvent;

/**
 * Class to define the main loader of the game
 * @author suckmyleg
 * @version 1.0
 */
public class GameMain extends Thread{
    private final Canvas canvas;
    private final Group group;
    private final StageManager scenes;
    private final MouseEvents mouseEvents = new MouseEvents();
    public void initializeControls(){
        this.group.setOnMouseClicked(mouseEvents::setClick);
        this.group.setOnMouseMoved(mouseEvents::setMove);
    }

    public GameMain(Group g, Canvas c){
        this.group = g;
        this.canvas = c;
        this.scenes = new StageManager();
        Platform.runLater(this::initializeControls);
    }

    public void startStage(String stageName){
        this.scenes.startScene(stageName);
    }

    public void addStage(Stage stage){
        this.scenes.addScene(stage);
    }

    public void run(){
        GraphicsContext graphicContext = canvas.getGraphicsContext2D();
            scenes.Run(canvas.getWidth(), canvas.getHeight(), this.mouseEvents);
            graphicContext.drawImage(scenes.getBackground(), 0, 0, canvas.getWidth(), canvas.getHeight());

            scenes.objectsToDraw().forEach(o -> graphicContext.drawImage(o.getImage(), o.getX(), o.getY(), o.getWidth(), o.getHeight()));
            //scenes.objectsToDraw().forEach(System.out::println);

            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        run();
    }
}
