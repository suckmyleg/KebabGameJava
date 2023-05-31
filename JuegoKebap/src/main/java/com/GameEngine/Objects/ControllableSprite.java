package com.GameEngine.Objects;

import com.GameEngine.Controllers.Controller;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Vectors.Vector;

import java.util.ArrayList;
import java.util.List;

/**
 * Sprite that every frame runs all the controllers inside and passes them the gameContent as parameter,
 * an example of use of this sprite would be a Bot that checks gameContent data every frame to react to it
 * @author suckmyleg
 * @version 1.0
 */
public class ControllableSprite extends Sprite{
    protected final List<Controller> controllers;

    public ControllableSprite(Vector position, Vector size) {
        super(position, size);
        this.controllers = new ArrayList<>();
    }

    public ControllableSprite(String url, Vector position, Vector size) {
        super(url, position, size);
        this.controllers = new ArrayList<>();
    }

    public ControllableSprite(String url, Vector position) {
        super(url, position);
        this.controllers = new ArrayList<>();
    }

    public ControllableSprite(Vector position) {
        super(position);
        this.controllers = new ArrayList<>();
    }

    public ControllableSprite(String url) {
        super(url);
        this.controllers = new ArrayList<>();
    }

    public ControllableSprite() {
        this.controllers = new ArrayList<>();
    }

    /**
     * Its runned every frame, gets the gameContent data, then it runs every controller it has passing the gameContent as parameter
     */
    @Override
    public void Run(GameContent content){try{for (Controller c:this.controllers){c.Run(content);}}catch (Exception ignored){}}

    /**
     * When the Sprite its added to the world
     */
    @Override
    public void Start(Sprite o){try{for (Controller c:this.controllers){c.Start(o);}}catch (Exception ignored){}}


    /**
     * Add a class type controller to be runned every frame
     */
    public void addController(Controller c){
        this.controllers.add(c);
    }

    /**
     * Remove all controllers from the sprite
     */
    public void clearControllers(){
        this.controllers.clear();}
}
