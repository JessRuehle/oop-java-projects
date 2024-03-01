package edu.bloomu.exam2pp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Wheel extends Application {


    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root);

        stage.setTitle("");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
