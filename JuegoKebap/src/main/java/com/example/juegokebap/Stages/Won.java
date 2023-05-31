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
public class Won extends Stage {
    public Won() {
        super("Won", "Backgrounds/Won.png");
    }

    /**
     * When the stage its started
     */
    @Override
    public void Start(StageBridge bridge)
    {
        addObject(new GoToButton("Buttons/PlayAgain.png", new Vector(420, 160), "FriesMiniGame", new Vector(150, 50)));
        addObject(new GoToButton("Buttons/MainMenu.png", new Vector(420, 220), "StartMenu", new Vector(150, 50)));
        addObject(new QuitButton(new Vector(420, 280), new Vector(150, 50)));
    }
}
