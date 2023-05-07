package com.GameEngine.Management;

import com.GameEngine.Backgrounds.Tasks;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.Object2d;
import com.GameEngine.Stages.Stage;
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

    public List<Object2d> objectsToDraw(){
        if(this.runningStage == null) return null;
        return this.runningStage.objectsToDraw();
    }

    private void RunTasks(Tasks tasks){
        HashMap content = tasks.getContent();
        if(content.get("activateScene")!=null) activateScene(content.get("activateScene").toString());
        if(content.get("startScene")!=null) startScene(content.get("startScene").toString());
    }

    public Image getBackground(){
        return this.runningStage.getBackground();
    }

    public void Run(){
        this.stats.run();

        this.runningStage.RunObjects(this.stats);

        RunTasks(runningStage.RunBackgrounds(this.stats));

    }
}
