package com.example.supermonsterz;

import javafx.scene.paint.Color;

public class player extends livingThings{
    Color userColor;
    public player(String name, int health, Color playerColor){
        super(name, health);
        this.userColor = playerColor;
    }
}
