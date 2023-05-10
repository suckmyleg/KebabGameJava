package com.GameEngine.Maps;

import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Vectors.Vector;

import java.util.List;

public interface Map {
    final Vector size = null;
    final ControllableSprite[][][] map = new ControllableSprite[0][][];
    public void initializeMap();
    public boolean occupied(double x, double y, double z);
    public boolean add(ControllableSprite obj);
    public boolean remove(ControllableSprite obj);
    public boolean remove(String obj);
    public List<ControllableSprite> getObjects();
    public int count();
    public void removeAll();
}
