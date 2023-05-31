package com.GameEngine.Objects;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Vectors.Vector;
import javafx.geometry.Rectangle2D;
import javafx.scene.input.MouseEvent;

/**
 * Sprite that reacts when it has been clicked, reacts when has collision and has its controllers
 * @author suckmyleg
 * @version 1.0
 */
public class ClickableSprite extends CollisionableSprite{
    public ClickableSprite(Vector position, Vector size) {
        super(position, size);
    }

    public ClickableSprite(String url, Vector position, Vector size) {
        super(url, position, size);
    }

    public ClickableSprite(String url, Vector position) {
        super(url, position);
    }

    public ClickableSprite(Vector position) {
        super(position);
    }

    public ClickableSprite(String url) {
        super(url);
    }

    public ClickableSprite() {}


    /**
     * Check if the mouse click intersects with the sprite
     */
    public boolean clickCollision(MouseEvent mouse){
        return new Rectangle2D(mouse.getX(), mouse.getY(), 2, 2).intersects(this.getBoundary());
    }

    /**
     * When mouse clickes the object
     */
    public void onClicked(GameContent content){
        content.getMouse().setClick(null);
    }


    /**
     * Runs every frame checking if the mouse click the sprite
     */
    public void Run(GameContent content){
        super.Run(content);
        MouseEvent mouse = content.getMouse().getClick();
        if(mouse!=null && this.clickCollision(mouse)){
            this.onClicked(content);
        }
    }


}
