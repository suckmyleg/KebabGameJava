package com.GameEngine.Backgrounds;

import com.GameEngine.Management.Stadistics;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Stages.Stage;

import java.util.List;

/**
 * Runs every frame, makes the changes based on the game situation
 * @author suckmyleg
 * @version 1.0 (Abandoned)
 */
public class HudStats implements Background {
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage stage) {

        return tasks;
    }

    @Override
    public void Start(Stage stage) {

    }
}
