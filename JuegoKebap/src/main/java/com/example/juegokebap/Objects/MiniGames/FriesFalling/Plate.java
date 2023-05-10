package com.example.juegokebap.Objects.MiniGames.FriesFalling;

import com.GameEngine.Management.GameContent;
import com.GameEngine.Objects.CollisionableSprite;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Objects.MouseFollower;

public class Plate extends MouseFollower {
    public Plate(Vector position, Vector size) {
        super(position, size);
    }

    public Plate(String url, Vector position, Vector size) {
        super(url, position, size);
    }

    public Plate(String url, Vector position) {
        super(url, position);
    }

    public Plate(Vector position) {
        super(position);
    }

    public Plate(String url) {
        super(url);
    }

    public Plate() {
    }

    @Override
    public void onCollision(GameContent content, CollisionableSprite obj) {
        obj.clearControllers();
        System.out.println(obj);
    }
}
