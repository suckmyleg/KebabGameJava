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
public class Box extends MouseFollower {
    public Box(Vector position, Vector size) {
        super(position, size);
        this.img = new SuperImage("Box/0.png", this.size.getX(), this.size.getY());
        this.img.add("Box/1.png", this.size.getX(), this.size.getY());
        this.img.add("Box/2.png", this.size.getX(), this.size.getY());
        this.img.add("Box/3.png", this.size.getX(), this.size.getY());
        this.img.add("Box/4.png", this.size.getX(), this.size.getY());
        this.img.add("Box/5.png", this.size.getX(), this.size.getY());
        this.img.add("Box/6.png", this.size.getX(), this.size.getY());
        this.img.add("Box/7.png", this.size.getX(), this.size.getY());
        this.img.add("Box/8.png", this.size.getX(), this.size.getY());
        this.img.add("Box/9.png", this.size.getX(), this.size.getY());
        this.img.add("Box/10.png", this.size.getX(), this.size.getY());
    }

    /**
     * When box make a collision with food
     */
    @Override
    public void onCollision(GameContent content, CollisionableSprite obj) {
        obj.clearControllers();
    }
}
