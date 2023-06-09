package com.GameEngine.Objects;

import com.GameEngine.Controllers.CollisionController;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Vectors.Vector;
import javafx.geometry.Rectangle2D;

import java.util.ArrayList;
import java.util.List;

/**
 * Sprite that reacts when has collision and has its controllers
 * @author suckmyleg
 * @version 1.0
 */
public class CollisionableSprite extends ControllableSprite{
    protected final List<CollisionController> onCollisionControllers;

    public CollisionableSprite(Vector position, Vector size) {
        super(position, size);
        onCollisionControllers = new ArrayList<>();
    }

    public CollisionableSprite(String url, Vector position, Vector size) {
        super(url, position, size);
        onCollisionControllers = new ArrayList<>();
    }

    public CollisionableSprite(String url, Vector position) {
        super(url, position);
        onCollisionControllers = new ArrayList<>();
    }

    public CollisionableSprite(Vector position) {
        super(position);
        onCollisionControllers = new ArrayList<>();
    }

    public CollisionableSprite(String url) {
        super(url);
        onCollisionControllers = new ArrayList<>();
    }

    public CollisionableSprite() {
        onCollisionControllers = new ArrayList<>();
    }


    /**
     * Get class that contains the vertices from the rectangle of the sprite
     */
    public Rectangle2D getBoundary(){
        return new Rectangle2D(this.position.getX(), this.position.getY(), this.size.getX(), this.size.getY());
    }

    /**
     * Check if an object rectangle intersects with its own rectangle
     */
    public boolean intersect(CollisionableSprite spr){
        return spr.getBoundary().intersects(this.getBoundary());
    }


    /**
     * Add controller that runs when an collition is made
     */
    public void addOnCollisionController(CollisionController controller){
        this.onCollisionControllers.add(controller);
    }

    /**
     * Run all controllers when an collission has been made,
     * (by default the code run onCollision has been disabled)
     */
    public void onCollision(GameContent content, CollisionableSprite obj){
        this.onCollisionControllers.stream().peek(x->{x.Run(content, obj);});
    }

    /**
     * Runs every frame
     */
    public void Run(GameContent content){
        super.Run(content);

        /**content.getObjects().stream().peek((x)->{
            if(x instanceof CollisionableSprite j && this.intersect(j)){
                j.onCollision(content, this);
                this.onCollision(content, j);
            }
        });**/
    }

}
