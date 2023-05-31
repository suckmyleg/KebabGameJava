package com.GameEngine.Objects;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Vectors.Vector;

/**
 * Sprite that works as button, when the mouse clicks on this sprite it starts a scene
 * @author suckmyleg
 * @version 1.0
 */
public class GoToButton extends ClickableSprite {
    private final String scene;
    public GoToButton(String url, Vector position, String scene, Vector size){
        super(url, position, size);
        this.scene = scene;
    }
    public GoToButton(String url, Vector position, String scene){
        super(url, position,  new Vector(150, 50));
        this.scene = scene;
    }


    /**
     * On clicked, start scene
     */
    @Override
    public void onClicked(GameContent content){
        content.getMouse().setClick(null);
        content.getTasks().startScene(scene);
    }
}
