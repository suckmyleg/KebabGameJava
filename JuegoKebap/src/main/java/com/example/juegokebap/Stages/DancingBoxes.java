package com.example.juegokebap.Stages;

import com.GameEngine.Stages.IsometricStage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Backgrounds.Creditos;
import com.example.juegokebap.Objects.BoxIsometric;

public class DancingBoxes extends IsometricStage {
    public DancingBoxes(String background, Vector tileSize) {
        super("DancingBoxes", background, tileSize);
    }

    public DancingBoxes(String background, int w, int h) {
        super("DancingBoxes", background, w, h);
    }

    public DancingBoxes( String background) {
        super("DancingBoxes", background);
    }

    public DancingBoxes() {
        super("DancingBoxes", "", new Vector(100, 100));
    }

    @Override
    public void Start() {
        for(int i=0; i<10; i++){

            for(int j=0; j<100; j++){
                addObject(new BoxIsometric(new Vector(i, j)));
            }
        }

        addBackground(new Creditos());
    }
}
