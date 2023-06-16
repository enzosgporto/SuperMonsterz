module com.example.supermonsterz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supermonsterz to javafx.fxml;
    exports com.example.supermonsterz;
    exports com.example.supermonsterz.controllers;
    opens com.example.supermonsterz.controllers to javafx.fxml;
    exports com.example.supermonsterz.characters;
    opens com.example.supermonsterz.characters to javafx.fxml;
}