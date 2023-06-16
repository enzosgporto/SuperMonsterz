package com.example.supermonsterz;

public class livingThings {
    final String name;
    int speed;
    int health;

    public livingThings(String name, int speed){
        this.name = name;
        this.health = health;
    }

    public livingThings(String name, int speed, int health){
        this.name = name;
        this.health = health;
        this.speed = speed;
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
