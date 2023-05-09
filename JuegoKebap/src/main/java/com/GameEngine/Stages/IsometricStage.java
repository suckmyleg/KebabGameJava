package com.GameEngine.Stages;

import com.GameEngine.Maps.TitledMap;
import com.GameEngine.Vectors.Vector;

public class IsometricStage extends Stage {
    public IsometricStage(String name, String background, Vector tileSize) {
        super(name, background);
        map = new TitledMap(tileSize);
    }

    public IsometricStage(String name, String background, int w, int h) {
        super(name, background, w, h);
        map = new TitledMap(new Vector(10,10,10));
    }

    public IsometricStage(String name, String background) {
        super(name, background);
        map = new TitledMap(new Vector(10,10,10));
    }

    public IsometricStage(String name) {
        super(name);
        map = new TitledMap(new Vector(10,10,10));
    }
}
