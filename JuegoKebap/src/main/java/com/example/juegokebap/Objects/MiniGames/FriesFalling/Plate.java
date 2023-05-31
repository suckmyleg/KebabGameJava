package com.example.juegokebap.Objects.MiniGames.FriesFalling;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Utils.SuperImage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.MouseFollower;

/**
 * MouseFollower with img of plate
 * @author suckmyleg
 * @version 1.0
 */
public class Plate extends MouseFollower {
    public Plate(Vector position, Vector size) {
        super(position, size);
        this.img = new SuperImage("Plate/0.png", this.size.getX(), this.size.getY());
        this.img.add("Plate/1.png", this.size.getX(), this.size.getY());
        this.img.add("Plate/2.png", this.size.getX(), this.size.getY());
        this.img.add("Plate/3.png", this.size.getX(), this.size.getY());
        this.img.add("Plate/4.png", this.size.getX(), this.size.getY());
        this.img.add("Plate/5.png", this.size.getX(), this.size.getY());
    }

    /**
     * When plate make a collision with food
     */
    @Override
    public void onCollision(GameContent content, CollisionableSprite obj) {
        obj.clearControllers();
    }
}
