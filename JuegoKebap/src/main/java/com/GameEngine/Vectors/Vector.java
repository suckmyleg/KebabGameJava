package com.GameEngine.Vectors;


/**
 * Save position x, y, z, add, set, values and scale them.
 * @author suckmyleg
 * @version 1.0
 */
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


    /**
     * Set vector data from another vector
     */
    public void set(Vector v){
        this.x = v.getX();
        this.y = v.getY();
        this.z = v.getZ();
    }

    /**
     * Set vector data from x, y, z
     */
    public void set(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    /**
     * Set vector data from x, y
     */
    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Set vector data from x, y
     */
    public void set(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Set vector data from x
     */
    public void set(double x){
        this.x = x;
    }

    /**
     * Set vector data from x
     */
    public void set(int x){
        this.x = x;
    }

    /**
     * Add x2, y2, z2 to x1, y1, z1
     */
    public void add(double x, double y, double z){
        this.x += x;
        this.y += y;
        this.z += z;
    }

    /**
     * Add x2, y2, z2 to x1, y1, z1
     */
    public void add(int x, int y, int z){
        this.x += x;
        this.y += y;
        this.z += z;
    }

    /**
     * Add x2, y2 to x1, y1
     */
    public void add(double x, double y){
        this.x += x;
        this.y += y;
    }

    /**
     * Add x2, y2 to x1, y1
     */
    public void add(int x, int y){
        this.x += x;
        this.y += y;
    }

    /**
     * Add x2 to x1
     */
    public void add(double x){
        this.x += x;
    }

    /**
     * Add x2 to x1
     */
    public void add(int x){
        this.x += x;
    }


    /**
     * Get x value
     */
    public double getX(){return this.x;}

    /**
     * Get y value
     */
    public double getY(){return this.y;}

    /**
     * Get z value
     */
    public double getZ(){return this.z;}


    /**
     * Scale vector with another vector
     */
    public void scale(Vector vector){
        this.x*=vector.getX();
        this.y*=vector.getY();
        this.z*=vector.getZ();
    }

    /**
     * return scaled vector with another vector without changing its values
     */
    public Vector getScaled(Vector vector){
        return new Vector(this.getX()*vector.getX(), this.getY()*vector.getY(), this.getZ()*vector.getZ());
    }

    @Override
    public String toString(){
        return "(x:"+this.x+",y:"+this.y+",z:"+this.z+")";
    }
}
