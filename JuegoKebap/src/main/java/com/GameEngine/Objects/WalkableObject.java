package com.GameEngine.Objects;

import com.GameEngine.Vectors.Vector;

public class WalkableObject extends ControllableSprite {
    private final double speedX;
    private final double speedY;

    public WalkableObject(String url, Vector position, Vector size, double speed) {
        super(url, position, size);
        this.speedX = speed;
        this.speedY = speed;
    }

    public WalkableObject(String url, Vector position, double speed) {
        super(url, position);
        this.speedX = speed;
        this.speedY = speed;
    }

    public WalkableObject(String url, double speed) {
        super(url);
        this.speedX = speed;
        this.speedY = speed;
    }

    public WalkableObject(double speed) {
        this.speedX = speed;
        this.speedY = speed;
    }

    public WalkableObject(String url, Vector position, Vector size, double speedX, double speedY) {
        super(url, position, size);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public WalkableObject(String url, Vector position, double speedX, double speedY) {
        super(url, position);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public WalkableObject(String url, double speedX, double speedY) {
        super(url);
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public WalkableObject(double speedX, double speedY) {
        this.speedX = speedX;
        this.speedY = speedY;
    }

    public WalkableObject(String url, Vector position, Vector size) {
        super(url, position, size);
        this.speedX = 0;
        this.speedY = 0;
    }

    public WalkableObject(String url, Vector position) {
        super(url, position);
        this.speedX = 0;
        this.speedY = 0;
    }

    public WalkableObject(String url) {
        super(url);
        this.speedX = 0;
        this.speedY = 0;
    }

    public WalkableObject() {
        super();
        this.speedX = 0;
        this.speedY = 0;
    }

    public void move(double x, double y){
        this.position.add(x*this.speedX, y*this.speedY);
    }

    public void move(double x){
        this.position.add(x*this.speedX, 0);
    }
}
