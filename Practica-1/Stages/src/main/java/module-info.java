module com.example.stages {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.stages to javafx.fxml;
    exports practica_01;
}