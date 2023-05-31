package com.example.juegokebap.Objects.MiniGames.FriesFalling;

import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Vectors.Vector;

/**
 * Falling sprite with img of frie
 * @author suckmyleg
 * @version 1.0
 */
public class Frie extends CollisionableSprite {
    public Frie(Vector position, Vector size) {
        super("MiniGames/FallingFrie.png", position, size);
    }
}
