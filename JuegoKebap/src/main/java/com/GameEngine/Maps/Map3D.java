package com.GameEngine.Maps;

import com.GameEngine.Objects.Object2d;
import com.GameEngine.Vectors.Vector;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Map3D implements Map{
    protected final Vector mapSize;
    protected Object2d[][][] map;
    protected int count;

    public void initializeMap(){
        this.map = new Object2d[(int)this.mapSize.getZ()][(int)this.mapSize.getX()][(int)this.mapSize.getZ()];
        count = 0;
    }

    public Map3D(Vector size) {
        this.mapSize = size;
        initializeMap();
    }

    protected Object2d rawGetObject(double x, double y, double z){
        return this.map[(int)z][(int)(this.mapSize.getX()-x)][(int)y];
    }
    protected boolean outOfMap(double x, double y, double z){
        return x >= this.mapSize.getX() || y >= this.mapSize.getY() || z >= this.mapSize.getZ();
    }

    @Override
    public boolean occupied(double x, double y, double z){
        return !(this.outOfMap(x, y, z)
                || rawGetObject(x, y, z) == null);
    }

    @Override
    public boolean add(Object2d obj){
        if(this.outOfMap(obj.getX(), obj.getY(), obj.getZ())) return false;
        this.map[(int)obj.getZ()][(int)(this.mapSize.getX()-obj.getX())][(int)obj.getY()] = obj;
        count++;
        return true;
    }

    @Override
    public boolean remove(Object2d obj){
        if(this.outOfMap(obj.getX(), obj.getY(), obj.getZ())) return false;
        this.map[(int)obj.getZ()][(int)(this.mapSize.getX()-obj.getX())][(int)obj.getY()] = null;
        count--;
        return true;
    }

    @Override
    public List<Object2d> getObjects() {
        return Arrays.stream(this.map)
                .flatMap(Arrays::stream)
                .flatMap(Arrays::stream)
                .filter(Objects::nonNull).toList();
    }

    @Override
    public int count() {
        return count;
    }

    @Override
    public void removeAll() {
        initializeMap();
    }
}
