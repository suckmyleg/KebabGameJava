package com.example.juegokebap.Controllers.MiniGames;

import com.GameEngine.Controllers.Controller;
import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.MiniGames.FriesFalling.Plate;
import com.example.juegokebap.Objects.MouseFollower;
import javafx.application.Platform;

import java.util.Random;

public class FallingFrie implements Controller {
    private final Vector speed = new Vector(-5+new Random().nextInt(10), new Random().nextInt(100)+150);

    @Override
    public void Run(GameContent content) {
        ControllableSprite f = content.getControlling();
        f.getPosition().add(speed.getX() * content.getGameStats().deltaTime(), speed.getY() * content.getGameStats().deltaTime());
        if(f.getPosition().getY() > (content.getGameStats().getSize().getY()+f.getSize().getY())) Platform.runLater(f::clearControllers);
    }

    @Override
    public void Start(Sprite o) {

    }
}
