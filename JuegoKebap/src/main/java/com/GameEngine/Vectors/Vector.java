package com.GameEngine.Vectors;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }
    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public Vector(int x) {
        this.x = x;
        this.y = 0;
        this.z = 0;
    }
    public Vector(double x) {
        this.x = x;
        this.y = 0;
        this.z = 0;
    }


    public void set(Vector v){
        this.x = v.getX();
        this.y = v.getY();
        this.z = v.getZ();
    }


    public void set(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void set(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void set(double x){
        this.x = x;
    }
    public void set(int x){
        this.x = x;
    }

    public void add(double x, double y, double z){
        this.x += x;
        this.y += y;
        this.z += z;
    }
    public void add(int x, int y, int z){
        this.x += x;
        this.y += y;
        this.z += z;
    }
    public void add(double x, double y){
        this.x += x;
        this.y += y;
    }
    public void add(int x, int y){
        this.x += x;
        this.y += y;
    }

    public void add(double x){
        this.x += x;
    }
    public void add(int x){
        this.x += x;
    }

    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double getZ(){return this.z;}

    public void scale(Vector vector){
        this.x*=vector.getX();
        this.y*=vector.getY();
        this.z*=vector.getZ();
    }
    public Vector getScaled(Vector vector){
        return new Vector(this.getX()*vector.getX(), this.getY()*vector.getY(), this.getZ()*vector.getZ());
    }

    @Override
    public String toString(){
        return "(x:"+this.x+",y:"+this.y+",z:"+this.z+")";
    }
}
