package com.example.juegokebap.Backgrounds;

import com.GameEngine.Backgrounds.Background;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Controllers.MiniGames.FallingFood;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Frie;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Plate;

import java.util.List;
import java.util.Random;

/**
 * Adds x objects Fry every x ms and a MouseFollower that when collides with a Fry it removes the Fry and the count of fries removed increments
 * @author suckmyleg
 * @version 1.0
 */
public class FriesFalling implements Background {
    private final int potatoesToFall;
    private final Plate plate;

    private int potatoesGenerated = 0;
    private int potatoesGotten = 0;
    private int potatoesRemoved = 0;

    private int toFail = 0;

    private final int probability;

    private final Vector friesSize;
    private final Vector friesSpeedConfX;
    private final Vector friesSpeedConfY;

    public FriesFalling( String difficulty){
        switch(difficulty){
            case"Hard":
                plate = new Plate(new Vector(), new Vector(100, 50));


                this.potatoesToFall = new Random().nextInt(20)+200;
                this.friesSize = new Vector(70, 100);
                this.friesSpeedConfX = new Vector(10, 5);
                this.friesSpeedConfY = new Vector(350, 400);
                this.probability = 4;

                toFail = 3;
                break;
            case "Normal":
                plate = new Plate(new Vector(), new Vector(120, 30));

                this.potatoesToFall = new Random().nextInt(20)+200;
                this.friesSize = new Vector(90, 140);
                this.friesSpeedConfX = new Vector(10, 50);
                this.friesSpeedConfY = new Vector(300, 350);
                this.probability = 6;

                toFail = 5;
                break;
            case "Easy":
            default:
                plate = new Plate(new Vector(), new Vector(240, 60));


                this.potatoesToFall = new Random().nextInt(20)+50;
                this.friesSize = new Vector(200, 200);
                this.friesSpeedConfX = new Vector(10, 5);
                this.friesSpeedConfY = new Vector(250, 300);
                this.probability = 8;


                toFail = 15;
                break;
        }

        plate.getSuperImage().set(0);
    }


    /**
     * Add new objects, count removed, left, if player has lost more that he can, the game end in lost
     * if the player lasts until the end, the game finishes as won
     */
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage s) {
        Random r = new Random();
        if(r.nextInt(this.probability) == 1 && potatoesToFall > potatoesGenerated){
            Frie f = new Frie(
                    new Vector(r.nextInt((int)gameStats.getSize().getX()-200), -300),
                    this.friesSize);

            f.addController(new FallingFood(this.friesSpeedConfX, this.friesSpeedConfY));
            s.addObject(f);
            potatoesGenerated++;
        }

        objects.forEach((x)->{
            if(x!=plate) {
                if(x instanceof CollisionableSprite && ((CollisionableSprite) x).intersect(plate)){
                    tasks.add("removeObject", x.toKey());
                    potatoesGotten++;
                    potatoesRemoved++;
                }else{
                    if((x.getY()+x.getHeight()) > 800){
                        tasks.add("removeObject", x.toKey());
                        potatoesRemoved++;
                    }
                }
            }
        });

        int status = (int)(((int)(potatoesToFall==0?0:(potatoesGotten/(float)potatoesToFall)*5))*(float)1.2);
        if(status<=5) plate.getSuperImage().set(status);

        if(potatoesRemoved == potatoesToFall){
            tasks.startScene("Won");
        }else{
            if(((potatoesRemoved - potatoesGotten)) > toFail){
                tasks.startScene("Lost");
            }
        }

        return tasks;
    }

    /**
     * Add the player object when the controller is started
     */
    @Override
    public void Start(Stage stage){
        stage.addObject(plate);
    }
}
