package com.example.juegokebap.Objects.Buttons;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.ClickableSprite;
import com.GameEngine.Vectors.Vector;
import javafx.application.Platform;

/**
 * ButtonSprite, when its clicked it closes the game
 * @author suckmyleg
 * @version 1.0
 */
public class QuitButton  extends ClickableSprite {
    public QuitButton(Vector position, Vector size){
        super("Buttons/Quit.png", position, size);
    }

    /**
     * When the button is clicked
     */
    @Override
    public void onClicked(GameContent content){
        Platform.exit();
    }
}
