package com.example.juegokebap.Stages;

import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Stages.IsometricStage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.BoxIsometric;

/**
 * Class extending Scene that setups the needed objects for the home scene
 * @author suckmyleg
 * @version 1.0
 */
public class Home extends IsometricStage {
    public Home() {
        super("Home", "roomexample.png", new Vector(100, 100, 100));
    }
    @Override
    public void Start(){
        clearObjects();
        for(int j=0; j<10; j++){
            for(int i=0; i<5; i++)
            {
                addObject(new BoxIsometric(new Vector(j, -i, 0)));
            }
        }
        //addBackground(new AutomaticSwitch(5000, "Work"));
    }
}
