package com.GameEngine.Maps;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Vectors.Vector;

import java.util.List;

public class TitledMap extends Map2D{
    protected Vector tileSize;
    public TitledMap(Vector tileSize) {
        super();
        this.tileSize = tileSize;
    }

    @Override
    public boolean add(ControllableSprite obj){
        obj.getSize().set(this.tileSize);
        obj.getPosition().scale(this.tileSize);
        this.map.add(obj);
        return true;
    }

    @Override
    public boolean remove(ControllableSprite obj){
        return true;
    }


    @Override
    public List<ControllableSprite> getObjects() {
        return this.map;
    }
}
