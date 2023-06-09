package com.example.supermonsterz.characters;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class livingThings {
    final String name;
    int speed;
    int health;

    public livingThings(String name, int health, Color color, int size){
        this.name = name;
        this.health = health;

        Circle circle = new Circle(size);
        circle.setFill(color);
        circle.setStroke(color.darker());
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
