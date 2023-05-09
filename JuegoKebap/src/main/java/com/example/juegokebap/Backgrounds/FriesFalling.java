package com.example.juegokebap.Backgrounds;

import com.GameEngine.Backgrounds.Background;
import com.GameEngine.Backgrounds.Tasks;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Controllers.MiniGames.FallingFrie;
import com.example.juegokebap.Objects.MiniGames.Frie;

import java.util.List;
import java.util.Random;

public class FriesFalling implements Background {
    private final int potatoesToFall = new Random().nextInt(20);
    private int potatoesFollen = 0;
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage s) {
        Random r = new java.util.Random();
        if(r.nextInt(20) == 1 && potatoesToFall > potatoesFollen){
            Frie f = new Frie(new Vector(r.nextInt((int)gameStats.getSize().getX()-200), -300), new Vector(300, 300));
            f.addController(new FallingFrie());
            s.addObject(f);
            potatoesFollen++;
        }

        return tasks;
    }
}
