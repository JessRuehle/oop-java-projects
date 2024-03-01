package edu.bloomu.exam2pp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.concurrent.ThreadLocalRandom;

public class RainbowCircles extends Application {


    @Override
    public void start(Stage stage) {
        final int size = 300;
        Pane root = new Pane();
        Scene scene = new Scene(root, size, size, Color.BLACK);

        stage.setTitle("Rainbow Circles");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

        int circles = 7;
        int radius = size - 20;

        for (int i = 0; i <= circles; i++) {
            Circle ring = drawRing(size, radius - 20);
            root.getChildren().add(ring);
        }

    }

    /**
     * Draws a ring of the bullseye with a random color.
     */
    private static Circle drawRing(int size, int radius) {
        Circle ring = new Circle(size / 2, size / 2, radius);

//        ThreadLocalRandom rand  = ThreadLocalRandom.current();
//        double r = rand.nextDouble();
//        double g = rand.nextDouble();
//        double b = rand.nextDouble();
        //Color randColor = new Color(r, g, b);
        //ring.setFill(randColor);

         return ring;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
