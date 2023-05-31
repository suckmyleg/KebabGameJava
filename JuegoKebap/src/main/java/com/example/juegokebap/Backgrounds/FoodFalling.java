package com.example.juegokebap.Backgrounds;

import com.GameEngine.Backgrounds.Background;
import com.GameEngine.Management.Stadistics;
import com.GameEngine.Management.Tasks;
import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Controllers.MiniGames.FallingFood;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Beef;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Box;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Frie;

import java.util.List;
import java.util.Random;

/**
 * Adds x objects Fry/Beef every x ms and a MouseFollower that when collides with a Fry/Beef it removes the Fry/Beef and the count of Fry/Beef removed increments
 * @author suckmyleg
 * @version 1.0
 */
public class FoodFalling implements Background {
    private int potatoesToFall;
    private int beefToFall;
    private Box box;

    private int potatoesGenerated = 0;
    private int potatoesGotten = 0;
    private int potatoesRemoved = 0;

    private int beefGenerated = 0;
    private int beefGotten = 0;
    private int beefRemoved = 0;

    private int toFail = 0;

    private final int probability;

    private int difficulty;

    private final Vector friesSize;
    private final Vector beefSize;
    private final Vector friesSpeedConfX;
    private final Vector friesSpeedConfY;
    private final Vector beefSpeedConfX;
    private final Vector beefSpeedConfY;

    public FoodFalling(String difficulty){
        System.out.println(difficulty);
        switch(difficulty){
            case"Hard":
                box = new Box(new Vector(), new Vector(150, 150));


                this.potatoesToFall = new Random().nextInt(20)+100;
                this.beefToFall = new Random().nextInt(20)+100;

                this.friesSize = new Vector(70, 100);
                this.friesSpeedConfX = new Vector(10, 5);
                this.friesSpeedConfY = new Vector(350, 400);


                this.beefSize = new Vector(30, 30);
                this.beefSpeedConfX = new Vector(10, 5);
                this.beefSpeedConfY = new Vector(350, 400);
                this.probability = 4;

                toFail = 3;
                break;
            case "Normal":
                box = new Box(new Vector(), new Vector(120, 120));

                this.potatoesToFall = new Random().nextInt(20)+200;
                this.beefToFall = new Random().nextInt(20)+200;

                this.friesSize = new Vector(90, 140);
                this.friesSpeedConfX = new Vector(10, 50);
                this.friesSpeedConfY = new Vector(300, 350);


                this.beefSize = new Vector(40, 60);
                this.beefSpeedConfX = new Vector(10, 5);
                this.beefSpeedConfY = new Vector(350, 400);
                this.probability = 6;

                toFail = 5;
                break;
            case "Easy":
            default:
                box = new Box(new Vector(), new Vector(70, 70));


                this.potatoesToFall = new Random().nextInt(20)+50;
                this.beefToFall = new Random().nextInt(20)+50;

                this.friesSize = new Vector(200, 200);
                this.friesSpeedConfX = new Vector(10, 5);
                this.friesSpeedConfY = new Vector(250, 300);


                this.beefSize = new Vector(70, 100);
                this.beefSpeedConfX = new Vector(10, 5);
                this.beefSpeedConfY = new Vector(350, 400);
                this.probability = 8;


                toFail = 15;
                break;
        }

        box.getSuperImage().set(0);
    }

    /**
     * Add new objects, count removed, left, if player has lost more that he can, the game end in lost
     * if the player lasts until the end, the game finishes as won
     */
    @Override
    public Tasks Run(List<ControllableSprite> objects, Stadistics gameStats, Stadistics sceneStats, Tasks tasks, Stage s) {
        Random r = new Random();
        int status = (int)(((potatoesToFall==0?0:(potatoesGotten/(float)potatoesToFall)) + (beefToFall==0?0:(beefGotten/(float)beefToFall)))*5);

        if(r.nextInt(this.probability) == 1){
            System.out.println(status);
            if(potatoesRemoved < potatoesToFall)
            {
                Frie f = new Frie(
                        new Vector(r.nextInt((int)gameStats.getSize().getX()-200), -300),
                        this.friesSize);
                f.addController(new FallingFood(this.friesSpeedConfX, this.friesSpeedConfY));
                s.addObject(f);
                potatoesGenerated++;
            }else{
                Beef f = new Beef(
                        new Vector(r.nextInt((int)gameStats.getSize().getX()-200), -300),
                        this.beefSize);
                f.addController(new FallingFood(this.beefSpeedConfX, this.beefSpeedConfY));
                s.addObject(f);
                beefGenerated++;
            }
        }



        objects.forEach((x)->{
            if(x!= box) {
                if(x instanceof CollisionableSprite && ((CollisionableSprite) x).intersect(box)){
                    tasks.add("removeObject", x.toKey());
                    if(status<=5){
                        potatoesGotten++;
                        potatoesRemoved++;
                    }else{
                        beefGotten++;
                        beefRemoved++;
                    }
                }else{
                    if((x.getPosition().getY()) > 600){
                        tasks.add("removeObject", x.toKey());
                        if(status<=5) {
                            potatoesRemoved++;
                        }else{
                            beefRemoved++;
                        }
                    }
                }
            }
        });



        if(status<=10) box.getSuperImage().set(status);

        if(beefRemoved >= beefToFall){
            tasks.startScene("Won");
        }else{
            if(((potatoesRemoved - potatoesGotten)+(beefRemoved - beefGotten)) > 3){
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
        stage.addObject(box);
    }
}
