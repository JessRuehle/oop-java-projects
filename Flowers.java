package edu.bloomu.homework3;

/**
 * Draws 5 randomly-colored flowers on a plain, black background.
 *
 * @author Jessica Ruehle
 */

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;
import java.util.concurrent.ThreadLocalRandom;

public class Flowers extends Application {


    @Override
    public void start(Stage stage) {

        // declare an int for the size of the scene. Make scene 300x300 and black
        final int size = 300;
        Pane root = new Pane();
        Scene scene = new Scene(root, size, size, Color.BLACK);

        // created 5 points to be the x and y coordinates of the flowers
        Point2D p1 = new Point2D(150, 150);
        Point2D p2 = new Point2D(75, 75);
        Point2D p3 = new Point2D(75, 225);
        Point2D p4 = new Point2D(225, 75);
        Point2D p5 = new Point2D(225, 225);

        // create 5 flowers, each with specified x and y coordinates and color
        root.getChildren().addAll(flower(p1), flower(p2), flower(p3), flower(p4),
                flower(p5));

        stage.setTitle("Flowers");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

    }

    /**
     * Creates four ellipses that combine to create one flower.
     * @return flower.
     */
    private static Shape flower(Point2D p)  {

        // make the 8 petals using 4 ellipses
        Ellipse e1 = new Ellipse(p.getX(), p.getY(), 50, 15);
        Ellipse e2 = new Ellipse(p.getX(), p.getY(), 50, 15);
        Ellipse e3 = new Ellipse(p.getX(), p.getY(), 50, 15);
        Ellipse e4 = new Ellipse(p.getX(), p.getY(), 50, 15);

        // rotate each of the petals
        e2.setRotate(45);
        e3.setRotate(-45);
        e4.setRotate(90);

        // using Shape.union method, combine ellipses into one flower
        Shape s1 = Shape.union(e1, e2);
        Shape s2 = Shape.union(e3, e4);
        Shape s3 = Shape.union(s1, s2);

        s3.setFill(randColor());
        // return the final flower
        return s3;
    }

    /**
     * Generates a random color made from random RGB values.
     *
     * @return a random color,
     */
    private static Color randColor() {

        // call on a random number generator to generate three random numbers for the
        // RGB values
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        double r = rand.nextDouble();
        double g = rand.nextDouble();
        double b = rand.nextDouble();

        // create new color object using RGB values
        Color color = new Color(r, g, b, 1);
        return color;

    }

    public static void main(String[] args) {
        launch(args);
    }
}
