package com.example.juegokebap.Backgrounds;

import com.GameEngine.Backgrounds.Background;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Controllers.MiniGames.FallingFrie;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Frie;
import com.example.juegokebap.Objects.MouseFollower;

import java.util.List;
import java.util.Random;

public class FriesFalling implements Background {
    private final int potatoesToFall = new Random().nextInt(20)+200;
    private final MouseFollower plate = new MouseFollower("opened.png", new Vector(), new Vector(150, 150));
    private int potatoesFollen = 0;
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage s) {
        Random r = new java.util.Random();
        if(r.nextInt(4) == 1 && potatoesToFall > potatoesFollen){
            Frie f = new Frie(new Vector(r.nextInt((int)gameStats.getSize().getX()-200), -300), new Vector(300, 300));
            f.addController(new FallingFrie());
            s.addObject(f);
            potatoesFollen++;
        }



        objects.forEach((x)->{
            if(x!=plate && x instanceof CollisionableSprite && ((CollisionableSprite) x).intersect(plate)){
                tasks.queueTask("removeObject", x.toString());
            }});



        return tasks;
    }

    @Override
    public void Start(Stage stage){
        stage.addObject(plate);
    }
}
