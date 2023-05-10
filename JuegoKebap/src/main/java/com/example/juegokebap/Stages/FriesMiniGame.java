package com.example.juegokebap.Stages;

import com.GameEngine.Stages.Stage;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Backgrounds.FriesFalling;
import com.example.juegokebap.Objects.MouseFollower;

public class FriesMiniGame extends Stage {
    public FriesMiniGame() {
        super("FriesMiniGame", "MiniGames/backFries.png");
        addBackground(new FriesFalling());
    }
}
