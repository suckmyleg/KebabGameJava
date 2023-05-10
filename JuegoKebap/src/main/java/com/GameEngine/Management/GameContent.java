package com.GameEngine.Management;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Utils.MouseEvents;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class GameContent {
    private final List<ControllableSprite> objects;
    private final Stadistics gameStats;
    private final Stadistics sceneStats;
    private final ControllableSprite controlling;
    private final MouseEvents mouseEvents;

    public ControllableSprite getControlling(){return this.controlling;}
    public Stadistics getGameStats(){return this.gameStats;}
    public Stadistics getSceneStats(){return this.sceneStats;}
    public List<ControllableSprite> getObjects(){return this.objects;}

    public GameContent(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, ControllableSprite controlling, MouseEvents events){
        this.objects = objects;
        this.gameStats = gameStats;
        this.sceneStats = sceneStats;
        this.controlling = controlling;
        this.mouseEvents = events;
    }

    public MouseEvents getMouse() {
        return this.mouseEvents;
    }
}
