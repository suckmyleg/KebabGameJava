package com.example.juegokebap.Stages;

import com.GameEngine.Management.StageBridge;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.Buttons.QuitButton;
import com.GameEngine.Objects.GoToButton;

/**
 * Menu stage that shows 2 buttons: StartGame and Quit
 * @author suckmyleg
 * @version 1.0
 */
public class StartMenuStage extends Stage {
    public StartMenuStage() {
        super("StartMenu", "Backgrounds/StartMenu.png");
    }

    /**
     * When the stage its started
     */
    @Override
    public void Start(StageBridge bridge)
    {
        addObject(new GoToButton("Buttons/StartGame.png", new Vector(50, 100), "SelectModeMenu", new Vector(150, 50)));
        addObject(new QuitButton(new Vector(50, 170), new Vector(150, 50)));
    }
}
