module com.example.supermonsterz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supermonsterz to javafx.fxml;
    exports com.example.supermonsterz;
}