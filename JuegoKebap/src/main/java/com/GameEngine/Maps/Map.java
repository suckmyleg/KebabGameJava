package com.GameEngine.Maps;

import com.GameEngine.Objects.Object2d;
import com.GameEngine.Vectors.Vector;

import java.util.List;

public interface Map {
    final Vector size = null;
    final Object2d[][][] map = new Object2d[0][][];
    public void initializeMap();
    public boolean occupied(double x, double y, double z);
    public boolean add(Object2d obj);
    public boolean remove(Object2d obj);
    public List<Object2d> getObjects();
    public int count();
    public void removeAll();
}
