package com.GameEngine.Management;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Utils.MouseEvents;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.List;

/**
 * Class to change, activate and start scenes
 * @author suckmyleg
 * @version 1.0
 */
public class StageManager {
    private final HashMap<String, Stage> scenes = new HashMap<>();
    private final Stadistics stats;

    private Stage runningStage;

    public StageManager(){
        this.stats = new Stadistics();
    }

    public void addScene(Stage stage){
        this.scenes.put(stage.getName(), stage);
    }

    public void startScene(String name){
        this.activateScene(name);
        this.runningStage.Start();
    }

    public void restartScene(){
        if(this.runningStage !=null)this.startScene(this.runningStage.getName());
    }

    public void activateScene(String name){
        System.out.println("Activating " + name + " scene");
        if(this.runningStage != null) this.runningStage.Stop();
        this.runningStage = this.scenes.get(name);
        this.runningStage.Activate();
    }

    public List<ControllableSprite> objectsToDraw(){
        if(this.runningStage == null) return null;
        return this.runningStage.objectsToDraw();
    }

    private void RunTasks(Tasks tasks){
        HashMap content = tasks.getContent();
        if(content.get("activateScene")!=null) activateScene(content.get("activateScene").toString());
        if(content.get("startScene")!=null) startScene(content.get("startScene").toString());
        if(content.get("removeObject")!=null) runningStage.removeObject(content.get("removeObject").toString());
    }

    public Image getBackground(){
        return this.runningStage.getBackground();
    }

    public void Run(double w, double h, MouseEvents mouseEvents){
        this.stats.run(w, h);

        this.runningStage.RunObjects(this.stats, mouseEvents);

        RunTasks(runningStage.RunBackgrounds(this.stats));

    }
}
