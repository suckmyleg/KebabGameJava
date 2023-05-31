package com.example.juegokebap.Objects;

import com.GameEngine.Objects.MouseReaderSprite;
import com.GameEngine.Vectors.Vector;
import javafx.scene.input.MouseEvent;

/**
 * Sprite that its position its the same has the mouse on the gameScreen
 * @author suckmyleg
 * @version 1.0
 */
public class MouseFollower extends MouseReaderSprite {
    public MouseFollower(Vector position, Vector size) {
        super(position, size);
    }

    /**
     * Ween the mouse moves
     */
    @Override
    public void mouseMoved(MouseEvent mouse){
        this.getPosition().set(mouse.getX()-(size.getX()/2), mouse.getY()-(size.getY()/2));
    }
}
