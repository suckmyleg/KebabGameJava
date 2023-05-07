package com.example.juegokebap.Objects;
import com.GameEngine.Objects.IsometricObject;
import com.GameEngine.Vectors.Vector;
import com.example.juegokebap.Controllers.Random;

public class BoxIsometric extends IsometricObject {
    public BoxIsometric() {
        super("kebab", new Vector(), new Vector());
        this.controller = new Random();
    }
    public BoxIsometric(Vector position) {
        super("kebab", position);
        this.controller = new Random();
    }
    public BoxIsometric(Vector position, Vector size) {
        super("kebab", position, size);
        this.controller = new Random();
    }
}
