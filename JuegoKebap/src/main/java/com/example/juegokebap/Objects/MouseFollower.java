package com.example.juegokebap.Objects;

import com.GameEngine.Objects.MouseReaderSprite;
import com.GameEngine.Vectors.Vector;
import javafx.scene.input.MouseEvent;

public class MouseFollower extends MouseReaderSprite {
    public MouseFollower(Vector position, Vector size) {
        super(position, size);
    }

    public MouseFollower(String url, Vector position, Vector size) {
        super(url, position, size);
    }

    public MouseFollower(String url, Vector position) {
        super(url, position);
    }

    public MouseFollower(Vector position) {
        super(position);
    }

    public MouseFollower(String url) {
        super(url);
    }

    public MouseFollower() {
    }

    @Override
    public void mouseMoved(MouseEvent mouse){
        this.getPosition().set(mouse.getX()-(size.getX()/2), mouse.getY()-(size.getY()/2));
    }
}
