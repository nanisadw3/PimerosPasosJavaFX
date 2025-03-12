module com.example.builder {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.builder to javafx.fxml;
    exports com.example.builder;
}