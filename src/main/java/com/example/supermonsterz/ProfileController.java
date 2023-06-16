package com.example.supermonsterz;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ProfileController {

    public Button playButton;
    public ColorPicker colorSelector;
    public TextField nameField;

    public void playAction(ActionEvent actionEvent) {
        SuperMonsterzApplication.Player = new player(nameField.getText(), 100, colorSelector.getValue());
    }
}