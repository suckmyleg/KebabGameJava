package com.GameEngine.Management;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;

import java.util.List;

public class GameContent {
    List<ControllableSprite> objects;
    Stadistics gameStats;
    Stadistics sceneStats;
    ControllableSprite controlling;

    public ControllableSprite getControlling(){return this.controlling;}
    public Stadistics getGameStats(){return this.gameStats;}
    public Stadistics getSceneStats(){return this.sceneStats;}
    public List<ControllableSprite> getObjects(){return this.objects;}

    public GameContent(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, ControllableSprite controlling){
        this.objects = objects;
        this.gameStats = gameStats;
        this.sceneStats = sceneStats;
        this.controlling = controlling;
    }
}
