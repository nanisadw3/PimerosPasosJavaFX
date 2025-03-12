module com.example.scenes_drawingstuff {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scenes_drawingstuff to javafx.fxml;
    exports practica_02;
}