package com.example.juegokebap.Objects.MiniGames.FriesFalling;

import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Objects.ControllableSprite;
import com.GameEngine.Objects.Sprite;
import com.GameEngine.Vectors.Vector;

public class Frie extends CollisionableSprite {
    public Frie(Vector position, Vector size) {
        super("MiniGames/FallingFrie.png", position, size);
    }

    public Frie(Vector position) {
        super("MiniGames/FallingFrie.png", position);
    }

    public Frie() {
        super("MiniGames/FallingFrie.png");
    }
}
