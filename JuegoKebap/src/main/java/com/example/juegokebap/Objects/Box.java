package com.example.juegokebap.Objects;
import com.GameEngine.Objects.WalkableObject;
import com.GameEngine.Vectors.Vector;

public class Box extends WalkableObject {
    public Box() {
        super("kebab.png", new Vector(), new Vector());
        img.add("kebab2.png");
    }
    public Box( Vector position, Vector size) {
        super("kebab.png", position, size, 100, 100);
        img.add("kebab2.png");
    }
}
