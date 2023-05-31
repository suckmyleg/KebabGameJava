package com.example.juegokebap.Stages;

import com.GameEngine.Management.StageBridge;
import com.GameEngine.Objects.GoToButton;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.Buttons.QuitButton;

/**
 * Class extending Scene that shows that the game has been won
 * @author suckmyleg
 * @version 1.0
 */
public class Lost extends Stage {
    public Lost() { super("Lost", "Backgrounds/Lost.png");}

    /**
     * When the stage its started
     */
    @Override
    public void Start(StageBridge bridge)
    {
        addObject(new GoToButton("Buttons/Retry.png", new Vector(420, 170), "FriesMiniGame", new Vector(150, 50)));
        addObject(new GoToButton("Buttons/MainMenu.png", new Vector(420, 230), "StartMenu", new Vector(150, 50)));
        addObject(new QuitButton(new Vector(420, 290), new Vector(150, 50)));
    }
}
