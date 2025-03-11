package practica_01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Stages extends Application {
    public static void main(String[] args) {//Main
        launch(args);//launch es un metodo estatico de la clase Application
    }

    @Override
    public void start(Stage stage) throws Exception {//Metodo start "extends Application"
        //recibimos por parametros un stage
        stage.setTitle("Practica 01");//podemos podificar sus propiedades
        Image icono = new Image(getClass().getResource("/ICON.png").toExternalForm());//Etablecemos una imagen
        stage.getIcons().add(icono);//La incorporo com el icono de la aplicacion
        stage.setResizable(false);//hacemos que el usuario no modifique las diemnciones
        //establecemos ancho y largo
        stage.setWidth(800);
        stage.setHeight(600);
        //se podria cambiar la posicion de aparicion de la siguiente manera
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);//mostrar la aplicacion "full screen"
        //mensaje
        stage.setFullScreenExitHint("Para salir preciona q");
        //salir con q
        stage.setFullScreenExitKeyCombination(KeyCombination.keyCombination("q"));
        Scene esena = primerLamina();
        stage.setScene(esena);
        stage.show();

    }
    private Scene primerLamina(){//aqui se encontraran todos nuestros componentes
        Group root = new Group();
        Scene escena = new Scene(root, Color.DARKGRAY);
        return escena;
    }
}