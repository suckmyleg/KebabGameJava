package com.GameEngine.Backgrounds;

import com.GameEngine.Management.Stadistics;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Stages.Stage;

import java.util.List;

/**
 * Class that runs code from background, no objects is needed,
 * it can run code from SceneManager
 * @author suckmyleg
 * @version 1.0
 */
public interface Background {
    /**
     * Runs every frame, makes the changes based on the game situation
     * @author suckmyleg
     */
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage stage);

    /**
     * Runs when it has been added to the stage
     * It makes the changes needed so it can work
     * @author suckmyleg
     */
    public void Start(Stage stage);
    public String toString();
}
