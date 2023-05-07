package com.GameEngine.Management;

import com.GameEngine.Objects.Object2d;

import java.util.List;
import java.util.Objects;

public class GameContent {
    List<Object2d> objects;
    Stadistics gameStats;
    Stadistics sceneStats;
    Object2d controlling;

    public Object2d getControlling(){return this.controlling;}
    public Stadistics getGameStats(){return this.gameStats;}
    public Stadistics getSceneStats(){return this.sceneStats;}
    public List<Object2d> getObjects(){return this.objects;}

    public GameContent(List<Object2d> objects, Stadistics gameStats, Stadistics sceneStats, Object2d controlling){
        this.objects = objects;
        this.gameStats = gameStats;
        this.sceneStats = sceneStats;
        this.controlling = controlling;
    }
}
