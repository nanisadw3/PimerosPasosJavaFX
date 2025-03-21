module com.example.css {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.css to javafx.fxml;
    exports com.example.css;
}