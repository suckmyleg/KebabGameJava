package com.GameEngine.Objects;

import com.GameEngine.Controllers.Controller;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Management.PlayerStats;
import com.GameEngine.Utils.*;
import com.GameEngine.Vectors.Vector;
import javafx.scene.image.Image;

/**
 * Class Object that has an image, position and size, it can be seen in the canvas and can run code itself
 * @author suckmyleg
 * @version 1.0
 */
public class Object2d {
    protected SuperImage img;
    protected Vector position;
    protected Vector size;
    protected PlayerStats stats;
    protected Controller controller;

    public Object2d(Vector position, Vector size){
        this.position = position;
        this.size = size;
        this.stats = new PlayerStats();
        this.img = new SuperImage();
    }

    public Object2d(String url, Vector position, Vector size){
        this.position = position;
        this.size = size;
        this.stats = new PlayerStats();
        this.img = new SuperImage(url, this.size.getX(), this.size.getY());
    }

    public Object2d(String url, Vector position){
        this.position = position;
        this.size = new Vector();
        this.stats = new PlayerStats();
        this.img = new SuperImage(url, this.size.getX(), this.size.getY());
    }

    public Object2d(Vector position){
        this.position = position;
        this.size = new Vector();
        this.stats = new PlayerStats();
        this.img = new SuperImage();
    }

    public Object2d(String url){
        this.position = new Vector();
        this.size = new Vector();
        this.stats = new PlayerStats();
        this.img = new SuperImage(url, this.size.getX(), this.size.getY());
    }

    public Object2d(){
        this.position = new Vector();
        this.size = new Vector();
        this.stats = new PlayerStats();
        this.img = new SuperImage();
    }

    public boolean insideBox(double pX, double pY){
        double x = this.getX();
        double y = this.getY();
        return (pX >= x && pX <= (x+this.size.getX())) && (pY >= y && pY <= (y+this.size.getY()));
    }

    public double getX(){
        return this.position.getX();
    }
    public double getY(){
        return this.position.getY();
    }
    public double getZ(){
        return this.position.getZ();
    }

    public double getWidth(){
        return this.size.getX();
    }
    public double getHeight(){
        return this.size.getY();
    }

    public Vector getSize(){return this.size;}
    public Image getImage(){
        return this.img.get();
    }
    public Vector getPosition(){
        return this.position;
    }

    public void Run(GameContent content){
        if(this.controller!=null)this.controller.Run(content);
    }

    @Override
    public String toString(){
        return this.getClass().getName() + "\n  -Pos: " + this.position + "\n  -Size: "+this.size+"\n  -Img: "+this.getImage()+
                "\n  -Stats:\n    -"+this.stats;
    }
}
