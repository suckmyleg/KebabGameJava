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
    private final StageBridge bridge = new StageBridge();

    private Stage runningStage;

    public StageManager(){
        this.stats = new Stadistics();
    }

    public void addScene(Stage stage){
        this.scenes.put(stage.getName(), stage);
    }

    public void startScene(String name){
        this.activateScene(name);
        this.runningStage.Start(bridge);
    }

    public void restartScene(){
        if(this.runningStage !=null)this.startScene(this.runningStage.getName());
    }

    public void activateScene(String name){
        System.out.println("Activating " + name + " scene");
        if(this.runningStage != null) this.runningStage.Stop();
        this.runningStage = this.scenes.get(name);
        if(this.runningStage != null) RunTasks(this.runningStage.Activate(bridge, new Tasks()));
        else{
            System.out.println("No scene called "+name);
        }
    }

    public List<ControllableSprite> objectsToDraw(){
        if(this.runningStage == null) return null;
        return this.runningStage.objectsToDraw();
    }

    private void RunTasks(Tasks tasks){
        HashMap<String, List<String>> content = tasks.getContent();
        if(content.get("activateScene")!=null) content.get("activateScene").forEach(this::activateScene);
        if(content.get("startScene")!=null) content.get("startScene").forEach(this::startScene);;
        if(content.get("removeObject")!=null) content.get("removeObject").forEach(runningStage::removeObject);
    }

    public Image getBackground(){
        return this.runningStage.getBackground();
    }

    public void Run(double w, double h, MouseEvents mouseEvents){
        this.stats.run(w, h);
        RunTasks(this.runningStage.RunObjects(this.stats, mouseEvents, bridge));
        RunTasks(runningStage.RunBackgrounds(this.stats));

    }
}
