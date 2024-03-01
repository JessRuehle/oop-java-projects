package edu.bloomu.hw4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Draws a picture of randomly-colored bars with randomly chosen heights on a black
 * background.
 *
 * @author Jessica Ruehle
 */
public class ColorBars extends Application {


    @Override
    public void start(Stage stage) {

        // declare dimensions of scene
        final int length = 520;
        final int height = 300;
        Pane root = new Pane();
        Scene scene = new Scene(root, length, height, Color.BLACK);

        stage.setTitle("Color Bars");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

        // declare width of bar and distance between each one
        final int barWidth = 20;
        final int gap = 10;

        // create a for loop that will print bars to screen until distance from edge of
        // screen reaches edge of gap. every loop, move bar 30 pixels on x-axis
        for (int i = gap; i < length - gap; i += 30) {
            // random number generator to determine random bar height
            ThreadLocalRandom rand  = ThreadLocalRandom.current();
            int barHeight = rand.nextInt(50, height);

            // create a new rectangle object with dimensions specified previously
            Rectangle bar = new Rectangle(i, height - barHeight, barWidth, barHeight);

            // call on helper method to generate a random color for each bar and add to
            // scene using .getChildren method
            bar.setFill(randColor());
            root.getChildren().add(bar);

        }


    }
    /**
     * Generates a random color.
     *
     * @return a random color.
     */
    private static Color randColor() {

        //call on a random number generator to choose three random numbers to be the
        // RGB values
        ThreadLocalRandom rand  = ThreadLocalRandom.current();
        double r = rand.nextDouble();
        double g = rand.nextDouble();
        double b = rand.nextDouble();

        // return the new, random color
        return new Color(r, g, b, 1);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
