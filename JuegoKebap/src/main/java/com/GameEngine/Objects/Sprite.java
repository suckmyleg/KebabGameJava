package com.GameEngine.Objects;

import com.GameEngine.Controllers.Controller;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Management.PlayerStats;
import com.GameEngine.Utils.*;
import com.GameEngine.Vectors.Vector;
import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Object that has an image, position and size, it can be seen in the canvas and can run code itself
 * @author suckmyleg
 * @version 1.0
 */
public class Sprite {
    protected SuperImage img;
    protected Vector position;
    protected Vector size;
    protected PlayerStats stats;

    public Sprite(Vector position, Vector size){
        this.position = position;
        this.size = size;
        this.stats = new PlayerStats();
        this.img = new SuperImage();
    }

    public Sprite(String url, Vector position, Vector size){
        this.position = position;
        this.size = size;
        this.stats = new PlayerStats();
        this.img = new SuperImage(url, this.size.getX(), this.size.getY());
    }

    public Sprite(String url, Vector position){
        this.position = position;
        this.size = new Vector();
        this.stats = new PlayerStats();
        this.img = new SuperImage(url, this.size.getX(), this.size.getY());
    }

    public Sprite(Vector position){
        this.position = position;
        this.size = new Vector();
        this.stats = new PlayerStats();
        this.img = new SuperImage();
    }

    public Sprite(String url){
        this.position = new Vector();
        this.size = new Vector();
        this.stats = new PlayerStats();
        this.img = new SuperImage(url, this.size.getX(), this.size.getY());
    }

    public Sprite(){
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

    /**
     * Get x position
     */
    public double getX(){
        return this.position.getX();
    }

    /**
     * Get y position
     */
    public double getY(){
        return this.position.getY();
    }


    /**
     * Get z position
     */
    public double getZ(){
        return this.position.getZ();
    }



    /**
     * Get width
     */
    public double getWidth(){
        return this.size.getX();
    }


    /**
     * Get height
     */
    public double getHeight(){
        return this.size.getY();
    }


    /**
     * Get vector size
     */
    public Vector getSize(){return this.size;}


    /**
     * Get vector position
     */
    public Vector getPosition(){
        return this.position;
    }


    /**
     * Get image
     */
    public Image getImage(){
        return this.img.get();
    }

    /**
     * Get superImage class
     */
    public SuperImage getSuperImage(){return this.img;}


    /**
     * Runs every frame
     */
    public void Run(GameContent content){}


    /**
     * When the sprite has been added to the world
     */
    public void Start(Sprite o){}

    /**
     * Transform it as a key reference
     */
    public String toKey(){
        return this.getClass().getName() + "-P:" + this.position + "-S:"+this.size+"-I:"+this.getImage()+
                "-S:"+this.stats;
    }


    /**
     * Get object info
     */
    @Override
    public String toString(){
        return this.getClass().getName() + "\n  -Pos: " + this.position + "\n  -Size: "+this.size+"\n  -Img: "+this.getImage()+
                "\n  -Stats:\n    -"+this.stats;
    }
}
