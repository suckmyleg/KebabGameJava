package com.GameEngine.Objects;

import com.GameEngine.Vectors.Vector;

public class Player extends WalkableObject{
    public Player(String url, Vector position, Vector size) {
        super(url, position, size);
    }

    public Player(String url, Vector position) {
        super(url, position);
    }

    public Player(String url) {
        super(url);
    }

    public Player() {
    }
}
