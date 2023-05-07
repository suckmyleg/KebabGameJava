package com.example.juegokebap.Stages;

import com.GameEngine.Backgrounds.AutomaticSwitch;
import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.Box;

/**
 * Class extending Scene that setups the needed objects for the Work scene
 * @author suckmyleg
 * @version 1.0
 */
public class Work extends Stage {
    public Work() {
        super("Work", "work.png");
    }

    @Override
    public void Start(){
        this.clearObjects();
        for(int i=0; i<10; i++)
        {
            addObject(new Box(new Vector(0, i, 0), new Vector(10, 10, 0)));
        }
        addBackground(new AutomaticSwitch(20000, "Home"));
    }
}
