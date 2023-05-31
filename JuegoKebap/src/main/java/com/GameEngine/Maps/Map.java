package com.GameEngine.Maps;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Vectors.Vector;

import java.util.List;


/**
 * Interface for maps, maps lets you manage objects inside of it, remove objects, count total objects, etc
 * @author suckmyleg
 * @version 1.0
 */
public interface Map {
    Vector size = null;
    ControllableSprite[][][] map = new ControllableSprite[0][][];


    /**
     * Make the needed operations to create the map
     */
    void initializeMap();


    /**
     * Return true if an object is already in that location
     */
    boolean occupied(double x, double y, double z);

    /**
     * Add object to the world
     */
    boolean add(ControllableSprite obj);

    /**
     * Remove object with the Object as reference
     */
    boolean remove(ControllableSprite obj);


    /**
     * Remove object with the Key as reference
     */
    boolean remove(String obj);


    /**
     * Get all objects
     */
    List<ControllableSprite> getObjects();


    /**
     * Number of objects inside the world
     */
    int count();


    /**
     * Remove all the objects
     */
    void removeAll();
}
