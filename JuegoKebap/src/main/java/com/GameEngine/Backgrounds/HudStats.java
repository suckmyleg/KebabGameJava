package com.GameEngine.Backgrounds;

import com.GameEngine.Management.Stadistics;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Stages.Stage;

import java.util.List;

public class HudStats implements Background {
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage stage) {

        return tasks;
    }

    @Override
    public void Start(Stage stage) {

    }
}
