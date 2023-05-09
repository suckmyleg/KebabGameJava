package com.example.juegokebap.Backgrounds;

import com.GameEngine.Backgrounds.Background;
import com.GameEngine.Backgrounds.Tasks;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Stages.Stage;

import java.util.List;

public class Creditos implements Background {
    private float actualSpeed = 0;
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage stage) {

        if(sceneStats.getTotalLapsed() >= 5000)
        {
            actualSpeed = actualSpeed>=300?300:actualSpeed+((actualSpeed/10)+0.1f);
            for(ControllableSprite o: objects){
                if(o.getPosition().getY() < -o.getY()) o.clearControllers();
                else{
                    o.getPosition().add(0, -actualSpeed*gameStats.deltaTime());
                }
            }
        }

        return tasks;
    }
}
