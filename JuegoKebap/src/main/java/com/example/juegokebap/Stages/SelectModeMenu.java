package com.example.juegokebap.Stages;

import com.GameEngine.Management.StageBridge;
import com.GameEngine.Objects.GoToButton;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.Buttons.ModeButton;

/**
 * Stage menu with button to select the game mode
 * @author suckmyleg
 * @version 1.0
 */
public class SelectModeMenu extends Stage {
    public SelectModeMenu() {
        super("SelectModeMenu", "Backgrounds/SelectGamemode.png");
    }

    /**
     * When the stage its started
     */
    @Override
    public void Start(StageBridge bridge)
    {
        addObject(new ModeButton("Plate", new Vector(50, 80), "SelectDifficulty", new Vector(150, 50)));
        addObject(new ModeButton("Box", new Vector(50, 140), "SelectDifficulty", new Vector(150, 50)));
        addObject(new GoToButton("Buttons/Return.png", new Vector(50, 200), "StartMenu", new Vector(150, 50)));
    }
}
