package com.GameEngine.Maps;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;

import java.util.ArrayList;
import java.util.List;

public class Map2D implements Map{
    protected List<ControllableSprite> map;

    public Map2D(){
        initializeMap();
    }

    @Override
    public void initializeMap() {
        this.map = new ArrayList<>();
    }

    @Override
    public boolean occupied(double x, double y, double z) {
        return false;
    }

    @Override
    public boolean add(ControllableSprite obj) {
        this.map.add(this.map.size(), obj);
        return true;
    }

    @Override
    public boolean remove(ControllableSprite obj) {
        this.map.remove(obj);
        return true;
    }

    @Override
    public List<ControllableSprite> getObjects() {
        return this.map;
    }

    @Override
    public int count() {
        return this.map.size();
    }

    @Override
    public void removeAll() {
        initializeMap();
    }
}
