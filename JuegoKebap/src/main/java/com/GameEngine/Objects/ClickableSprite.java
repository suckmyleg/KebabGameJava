package com.GameEngine.Objects;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Vectors.Vector;
import javafx.geometry.Rectangle2D;
import javafx.scene.input.MouseEvent;

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

    public boolean clickCollission(MouseEvent mouse){
        return new Rectangle2D(mouse.getX(), mouse.getY(), 1, 1).intersects(this.getBoundary());
    }

    public void onClicked(){}

    public void Run(GameContent content){
        super.Run(content);
        MouseEvent mouse = content.getMouse().getClick();
        if(mouse!=null && this.clickCollission(mouse)){
            this.onClicked();
        }
    }


}
