package com.example.juegokebap.Stages;

import com.GameEngine.Management.StageBridge;
import com.example.juegokebap.Objects.Buttons.DifficultyButton;
import com.GameEngine.Objects.GoToButton;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;

/**
 * Stage menu with button to select the difficulty of the game
 * @author suckmyleg
 * @version 1.0
 */
public class SelectDifficultyMenu extends Stage {
    public SelectDifficultyMenu() {
        super("SelectDifficulty", "Backgrounds/SelectDifficulty.png");
    }

    /**
     * When the stage its started
     */
    @Override
    public void Start(StageBridge bridge)
    {
        addObject(new DifficultyButton("Easy", new Vector(50, 80), "FriesMiniGame", new Vector(150, 50)));
        addObject(new DifficultyButton("Normal", new Vector(50, 140), "FriesMiniGame", new Vector(150, 50)));
        addObject(new DifficultyButton("Hard", new Vector(50, 200), "FriesMiniGame", new Vector(150, 50)));
        addObject(new GoToButton("Buttons/Return.png", new Vector(50, 260), "SelectModeMenu", new Vector(150, 50)));
    }
}
