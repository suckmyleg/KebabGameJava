package com.GameEngine.Management;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Utils.MouseEvents;
import javafx.scene.input.MouseEvent;

import java.util.List;
/**
 * Class only to pass info about the game, the stage, the objects, tasks, and events of the mouse so the class
 * controllers can know what is happening in the game
 * @author suckmyleg
 * @version 1.0
 */
public class GameContent {
    private final List<ControllableSprite> objects;
    private final Stadistics gameStats;
    private final Stadistics sceneStats;
    private final ControllableSprite controlling;
    private final MouseEvents mouseEvents;
    private final Tasks tasks;
    private final Stage stage;
    private final StageBridge bridge;

    public ControllableSprite getControlling(){return this.controlling;}
    public Stadistics getGameStats(){return this.gameStats;}
    public Stadistics getSceneStats(){return this.sceneStats;}
    public List<ControllableSprite> getObjects(){return this.objects;}
    public Tasks getTasks(){return this.tasks;}
    public StageBridge getBridge(){return this.bridge;}

    public GameContent(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, ControllableSprite controlling, MouseEvents events, Tasks tasks, Stage stage, StageBridge bridge){
        this.objects = objects;
        this.gameStats = gameStats;
        this.sceneStats = sceneStats;
        this.controlling = controlling;
        this.mouseEvents = events;
        this.tasks = tasks;
        this.stage = stage;
        this.bridge = bridge;
    }

    public MouseEvents getMouse() {
        return this.mouseEvents;
    }
}
