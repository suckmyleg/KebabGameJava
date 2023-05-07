package com.GameEngine.Maps;

import com.GameEngine.Objects.Object2d;
import com.GameEngine.Vectors.Vector;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class TitledMap extends Map3D{
    protected Vector tileSize;
    public TitledMap(Vector mapSize, Vector tileSize) {
        super(mapSize);
        this.tileSize = tileSize;
        initializeMapTitle();
    }

    public void initializeMapTitle(){
        this.map = new Object2d
                [(int)(this.mapSize.getZ())]
                [(int)(this.mapSize.getX())]
                [(int)(this.mapSize.getY())];
        count = 0;
    }
    @Override
    public void initializeMap(){
    }

    @Override
    public boolean add(Object2d obj){
        obj.getSize().set(this.tileSize);
        obj.getPosition().scale(this.tileSize);
        if(this.outOfMap(obj.getX(), obj.getY(), obj.getZ())) return false;
        this.map[(int)obj.getZ()][(int)((this.mapSize.getX()-1)-obj.getX())][(int)obj.getY()] = obj;
        count++;
        return true;
    }

    @Override
    public boolean remove(Object2d obj){
        obj.getPosition().scale(this.tileSize);
        if(this.outOfMap(obj.getX(), obj.getY(), obj.getZ())) return false;
        this.map[(int)obj.getZ()][(int)((this.mapSize.getX()-1)-obj.getX())][(int)obj.getY()] = null;
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
}
