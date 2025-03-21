package com.example.eventos;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.shape.Circle;


public class Controller {

    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void arriba(ActionEvent event) {
        //System.out.println("arriba");
        circle.setCenterY(y -= 10);
    }
    public void abajo(ActionEvent event) {
        //System.out.println("abajo");
        circle.setCenterY(y += 10);
    }
    public void hizquierda(ActionEvent event) {
        circle.setCenterX(x -= 10);
    }
    public void derecha(ActionEvent event) {
        //System.out.println("derecha");
        circle.setCenterX(x += 10);

    }
}