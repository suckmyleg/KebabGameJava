package com.GameEngine.Controllers;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.Sprite;

/**
 * Runs every frame, makes the changes based on the game situation
 * @author suckmyleg
 * @version 1.0
 */
public interface Controller {

    /**
     * Runs every frame, makes the changes based on the game situation
     * @author suckmyleg
     */
    public void Run(GameContent content);


    /**
     * Runs when the controller has been added to the stage
     * @author suckmyleg
     */
    public void Start(Sprite o);
}
