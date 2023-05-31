package com.GameEngine.Controllers;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.CollisionableSprite;

/**
 * Controlls the way the objects react when a collition is made
 * @author suckmyleg
 * @version 1.0 (Obsolete)
 */
public interface CollisionController {
    /**
     * Runs when a collition has been made, its the code that tells the object how to react to the collition
     * @author suckmyleg
     */
    public void Run(GameContent content, CollisionableSprite collisionTo);

    /**
     * Runs when the controller has been added to the object
     * @author suckmyleg
     */
    public void Start(CollisionableSprite o);
}
