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

    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage stage);

    public void Start(Stage stage);
    public String toString();
}
