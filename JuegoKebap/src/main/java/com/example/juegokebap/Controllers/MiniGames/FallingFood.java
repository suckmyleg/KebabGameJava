package com.example.juegokebap.Controllers.MiniGames;

import com.GameEngine.Controllers.Controller;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Plate;
import com.example.juegokebap.Objects.MouseFollower;
import javafx.application.Platform;

import java.util.Random;

/**
 * Object controller that sets a speed for the object and moves the object to the floor
 * @author suckmyleg
 * @version 1.0
 */
public class FallingFood implements Controller {
    private final Vector speed;

    /**
     * Sets random speed with minimum value, maximum value for the x and y
     * @author suckmyleg
     */
    public FallingFood(Vector configX, Vector configY){
        this.speed = new Vector(new Random().nextInt((int)configX.getY())+configX.getX(), new Random().nextInt((int)configY.getY())+configY.getX());
    }

    /**
     * Moves the object by the speed of the object
     */
    @Override
    public void Run(GameContent content) {
        ControllableSprite f = content.getControlling();
        f.getPosition().add(speed.getX() * content.getGameStats().deltaTime(), speed.getY() * content.getGameStats().deltaTime());
        if(f.getPosition().getY() > (content.getGameStats().getSize().getY()+f.getSize().getY())) Platform.runLater(f::clearControllers);
    }


    /**
     * When the object is added
     */
    @Override
    public void Start(Sprite o) {

    }
}
