package com.example.juegokebap.Controllers;

import com.GameEngine.Controllers.Controller;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.IsometricObject;

public class Random implements Controller {
    @Override
    public void Run(GameContent content) {
        IsometricObject controlling = (IsometricObject)content.getControlling();
        controlling.rotate();
    }
}
