package com.GameEngine.Backgrounds;

import com.GameEngine.Management.Stadistics;

import java.util.List;

/**
 * Class that runs code from background, no objects is needed,
 * it can run code from SceneManager
 * @author suckmyleg
 * @version 1.0
 */
public interface Background {

    public Tasks Run(List<Background> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks);

    public String toString();
}
