package com.example.juegokebap.Stages;

import com.GameEngine.Stages.Stage;
import com.example.juegokebap.Backgrounds.FriesFalling;

public class FriesMiniGame extends Stage {
    public FriesMiniGame() {
        super("FriesMiniGame", "MiniGames/backFries.png");
        addBackground(new FriesFalling());
    }
}
