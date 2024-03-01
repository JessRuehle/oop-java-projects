package edu.bloomu.exam2pp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.util.concurrent.ThreadLocalRandom;

public class RandomTower extends Application {


    @Override
    public void start(Stage stage) {
        final int size = 300;
        Pane root = new Pane();
        Scene scene = new Scene(root, size, size, Color.BLACK);

        stage.setTitle("Random Tower");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

        for (int i = 0; i < size - 10; i++) {
            ThreadLocalRandom rand  = ThreadLocalRandom.current();
            int barWidth = rand.nextInt(50 , size);
            int barHeight = 27;
            int x = (size / 2) - (barWidth / 2);
            
            Rectangle bar = new Rectangle(x, i, barWidth, barHeight);
            bar.setFill(null);
            bar.setStroke(Color.ORANGE);
            bar.setStrokeWidth(1);

            root.getChildren().add(bar);
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
stroke = 1 pixel
gap = 1 pixel
bars = 27 pixels

10 gaps
10 bars
 */