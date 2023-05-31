package com.example.juegokebap.Objects.Buttons;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.ClickableSprite;
import com.GameEngine.Vectors.Vector;

/**
 * SpriteButton that select the game difficulty
 * @author suckmyleg
 * @version 1.0
 */
public class DifficultyButton extends ClickableSprite {
    private final String scene;
    private final String difficulty;
    public DifficultyButton(String diff, Vector position, String scene, Vector size){
        super("Buttons/"+diff+".png", position, size);
        this.scene = scene;
        this.difficulty = diff;
    }

    /**
     * When button is clicked, add difficulty to bridgeData and start scene
     */
    @Override
    public void onClicked(GameContent content){
        content.getMouse().setClick(null);
        content.getTasks().startScene(scene);
        content.getBridge().addData("difficulty", this.difficulty);
    }
}
