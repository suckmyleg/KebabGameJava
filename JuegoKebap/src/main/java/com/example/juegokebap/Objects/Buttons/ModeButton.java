package com.example.juegokebap.Objects.Buttons;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.ClickableSprite;
import com.GameEngine.Vectors.Vector;

/**
 * SpriteButton that select the game mode
 * @author suckmyleg
 * @version 1.0
 */
public class ModeButton extends ClickableSprite {
    private final String scene;
    private final String mode;
    public ModeButton(String mode, Vector position, String scene, Vector size){
        super("Buttons/"+mode+".png", position, size);
        this.scene = scene;
        this.mode = mode;
    }

    /**
     * When button is clicked save mode to bridgeData and start scene
     */
    @Override
    public void onClicked(GameContent content){
        content.getMouse().setClick(null);
        content.getTasks().startScene(scene);
        content.getBridge().removeData("mode");
        content.getBridge().addData("mode", this.mode);
    }
}
