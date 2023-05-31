package com.GameEngine.Objects;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Vectors.Vector;
import javafx.scene.input.MouseEvent;


/**
 * Sprite that every frame runs all the controllers inside and passes them the gameContent as parameter,
 * an example of use of this sprite would be a Bot that checks gameContent data every frame to react to it
 * @author suckmyleg
 * @version 1.0
 */
public class MouseReaderSprite extends ClickableSprite {
    public MouseReaderSprite(Vector position, Vector size) {
        super(position, size);
    }

    /**
     * When mouse has been moved
     */
    public void mouseMoved(MouseEvent mouse){}

    /**
     * Check clicks and if the mouse has moved
     */
    public void Run(GameContent content){
        super.Run(content);
        MouseEvent mouse = content.getMouse().getClick();
        if(mouse!=null && this.clickCollision(mouse)){
            this.onClicked(content);
        }
        mouse = content.getMouse().getMove();
        if(mouse != null) this.mouseMoved(mouse);

    }
}
