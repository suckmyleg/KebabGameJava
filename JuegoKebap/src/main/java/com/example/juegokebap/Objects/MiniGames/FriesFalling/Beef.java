package com.example.juegokebap.Objects.MiniGames.FriesFalling;

import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Vectors.Vector;

/**
 * Falling sprite with img of beef
 * @author suckmyleg
 * @version 1.0
 */
public class Beef extends CollisionableSprite {
    public Beef(Vector position, Vector size) {
        super("MiniGames/Meat.png", position, size);
    }
}
