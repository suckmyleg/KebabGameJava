package com.example.juegokebap.Controllers;

import com.GameEngine.Controllers.Controller;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.IsometricObject;
import com.GameEngine.Objects.Sprite;

public class Random implements Controller {
    private int bound;
    @Override
    public void Run(GameContent content) {
        IsometricObject controlling = (IsometricObject) content.getControlling();
        if(new java.util.Random().nextInt(this.bound) == 0) controlling.rotate();
    }

    @Override
    public void Start(Sprite o ) {
        this.bound = new java.util.Random().nextInt(50)+1;
    }
}
