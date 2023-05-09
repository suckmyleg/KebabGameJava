package com.GameEngine.Backgrounds;

import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Stages.Stage;

import java.util.List;

public class AutomaticSwitch implements Background{
    private double after;
    private String scene;
    public AutomaticSwitch(double after, String scene){
        this.after = after;
        this.scene = scene;
    }
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage stage) {
        if(sceneStats.getTotalLapsed() > this.after) tasks.startScene(this.scene);
        return tasks;
    }
}
