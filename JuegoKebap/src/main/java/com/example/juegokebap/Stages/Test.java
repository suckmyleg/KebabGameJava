package com.example.juegokebap.Stages;

import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.BoxIsometric;

/**
 * Class extending Scene that setups the needed objects for the home scene
 * @author suckmyleg
 * @version 1.0
 */
public class Test extends Stage {
    public Test() {
        super("Test", "opened.png");
    }

    @Override
    public void Start(){
        clearObjects();
        addObject(new BoxIsometric(new Vector(460, 300,0), new Vector(100, 100)));
    }
}
