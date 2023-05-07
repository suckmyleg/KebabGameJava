package com.GameEngine.Objects;

import com.GameEngine.Vectors.Vector;
import com.GameEngine.Vectors.VectorU;

public class IsometricObject extends Object2d{
    private final Vector orientation = new VectorU(0, 0, 1);

    private void initialize(String name){
        for (int i = 0; i<6; i++){
            img.add(name+"/"+i+".png", this.size.getX(), this.size.getY());
        }
        img.set(5);
    }

    private int orientationToNumber(){
        if(orientation.getX() == -1) return 0;
        if(orientation.getY() == -1) return 1;
        if(orientation.getZ() == -1) return 2;
        if(orientation.getX() == 1) return 3;
        if(orientation.getY() == 1) return 4;
        return 5;
    }

    public IsometricObject(String name, Vector position, Vector size) {
        super(position, size);
        initialize(name);
    }

    public IsometricObject(String name, Vector position) {
        super(position);
        initialize(name);
    }

    public IsometricObject(String name) {
        super(name);
        initialize(name);
    }


    public void setOrientation(Vector orientation){
        this.orientation.set(orientation);
    }
    public void setOrientation(int x){
        this.orientation.set(x);
    }
    public void setOrientation(int x, int y){
        this.orientation.set(x, y);
    }
    public void setOrientation(int x, int y, int z){
        this.orientation.set(x, y, z);
    }

    public void rotate(){
        if(this.orientation.getX()==1) this.rotate(new Vector(0,0,1));
        else this.rotate(new Vector(1,0,0));
    }

    public void rotate(Vector or){
        this.orientation.set(or);
        this.img.set(this.orientationToNumber());
    }

    @Override
    public String toString(){
        return this.getClass().getName() + "\n  -Pos: " + this.position + "\n  -Size: "+this.size+"\n  -Orientation: "+this.orientation+"\n  -Img: "+this.getImage()+"\n  -Side: "+this.img.getIndex()+
                "\n  -Stats:\n    -"+this.stats;
    }
}
