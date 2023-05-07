package com.example.juegokebap.Stages;

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
        super("Home", "roomexample.png", new Vector(10, 10, 10), new Vector(100, 100, 100));
    }

    @Override
    public void Start(){
        clearObjects();
        for(int i=0; i<10; i++)
        {
            addObject(new BoxIsometric(new Vector(i, i, 0)));
        }
        //addBackground(new AutomaticSwitch(5000, "Work"));
    }
}
