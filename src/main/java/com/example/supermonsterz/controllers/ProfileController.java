package com.example.supermonsterz.controllers;

import com.example.supermonsterz.SuperMonsterzApplication;
import com.example.supermonsterz.characters.player;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ProfileController {

    public Button playButton;
    public ColorPicker colorSelector;
    public TextField nameField;

    public void playAction(ActionEvent actionEvent) throws IOException {
        SuperMonsterzApplication.Player = new player(nameField.getText(), 100, colorSelector.getValue());
        SuperMonsterzApplication.setScene("game-view");
    }
}