package com.example.builder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //mandamos llamar al archivo FXML
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //decimos que este archivo sera nuestra esena
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Builder");
        //agregamos al esena al estadio
        stage.setScene(scene);
        //mostramos el sesenario
        stage.show();
    }

    public static void main(String[] args) {
        //mandamos a llamar
        launch();
    }
}