package com.GameEngine.Maps;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Map2D implements Map{
    protected List<ControllableSprite> map;

    public Map2D(){
        initializeMap();
    }

    /**
     * Make the needed operations to create the map
     */
    @Override
    public void initializeMap() {
        this.map = new ArrayList<>();
    }

    /**
     * Return true if an object is already in that location
     */
    @Override
    public boolean occupied(double x, double y, double z) {
        return false;
    }

    /**
     * Add object to the world
     */
    @Override
    public boolean add(ControllableSprite obj) {
        this.map.add(obj);
        return true;
    }

    /**
     * Remove object with the Object as reference
     */
    @Override
    public boolean remove(ControllableSprite obj) {
        this.map.remove(obj);
        return true;
    }

    /**
     * Remove object with the Key as reference
     */
    @Override
    public boolean remove(String obj) {
        this.map.removeIf((x)-> x.toKey().equals(obj));
        return true;
    }

    /**
     * Get all objects
     */
    @Override
    public List<ControllableSprite> getObjects() {
        return this.map;
    }

    /**
     * Number of objects inside the world
     */
    @Override
    public int count() {
        return this.map.size();
    }

    /**
     * Remove all the objects
     */
    @Override
    public void removeAll() {
        initializeMap();
    }
}
