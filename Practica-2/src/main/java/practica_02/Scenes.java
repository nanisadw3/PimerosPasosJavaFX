package practica_02;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Scenes extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setTitle("Practica 2");
        //stage.setResizable(false);
        Image icon = new Image(getClass().getResourceAsStream("/ICON.png"));
        stage.getIcons().add(icon);
        Scene scene = crearLamina();
        stage.setScene(scene);

        stage.show();
    }

    private Scene crearLamina(){
        Group root = new Group();
        //a la esena podemos pasar le por argumentos el tamano que tendra y el "stage"
        //tiene que adaptarse a esas dimenciones propuestas
        Scene scene = new Scene(root, 800, 600, Color.DARKSLATEGREY);
        Text texto = new Text("Practica (2)");//creamos un Label
        texto.setX(70);
        texto.setY(80);
        texto.setFill(Color.WHITE);//cambiamos el color
        texto.setFont(Font.font("Arial",50));//cambiamos la fuente

        Line linea = new Line();

        linea.setStartX(200);
        linea.setStartY(200);
        linea.setEndX(500);//inclinacion
        linea.setEndY(200);
        linea.setStroke(Color.WHITE);//color
        linea.setStrokeWidth(5);//anchura
        linea.setOpacity(0.5);//opasidad

        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.WHITE);
        rectangle.setX(100);
        rectangle.setY(100);

        rectangle.setWidth(100);
        rectangle.setHeight(100);

        rectangle.setStroke(Color.RED);
        rectangle.setStrokeWidth(5);

        rectangle.setArcWidth(30);  // Define el radio de las esquinas en X
        rectangle.setArcHeight(30); // Define el radio de las esquinas en Y

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.WHITE);

        Circle circle = new Circle();
        circle.setFill(Color.WHITE);
        circle.setRadius(50);//radio
        circle.setCenterX(350);//posiciones
        circle.setCenterY(350);

        Image icono = new Image(getClass().getResourceAsStream("/ICON.png"));
        ImageView imagen = new ImageView(icono);
        imagen.setX(370);
        imagen.setY(100);

        root.getChildren().add(imagen);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().addAll(rectangle);
        root.getChildren().addAll(linea);
        //Agregamos el texto a la esena
        root.getChildren().add(texto);
        return scene;
    }
}
