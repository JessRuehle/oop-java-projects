package ed.bloomu.homework4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Draws a green arrow on a yellow scene using a triangle and a rectangle.
 *
 * @author Jessica Ruehle
 */

public class UpArrow extends Application {

    @Override
    public void start(Stage stage) {

        //make a new scene and declare its size and color
        final int width = 300;
        final int height = 300;
        Pane root = new Pane();
        Scene scene = new Scene(root, width, height, Color.LIGHTGOLDENRODYELLOW);

        stage.setTitle("Up Arrow");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

        //Make the size of the rectangle
        final int rectangleWidth = 150;
        final int rectangleHeight = 125;


        //x and y coordinates of the top left corner
        final int x = 75;
        final int y = 150;

        //create the rectangle add color. Add a thin, black border using .setStroke and
        // .setStrokeWidth methods. Finally, use .getChildren to add it to the scene
        Rectangle rectangle = new Rectangle(x, y, rectangleWidth, rectangleHeight);
        rectangle.setFill(Color.DARKGREEN);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(3);
        root.getChildren().add(rectangle);

        //declare 3 points on the triangle by creating numerous x and y coordinates
        final int x1 = 150; //top point of triangle
        final int y1 = 25; //top point of triangle
        final int x2 = 275; //bottom right corner of triangle
        final int y2 = 150; //bottom right corner of triangle
        final int x3 = 25; //bottom left corner of triangle
        final int y3 = 150; //bottom left corner of triangle

        //create the triangle by invoking new Polygon method. Add x and y coordinates
        // of 3 triangle points
        Polygon triangle = new Polygon(x1, y1, x2, y2, x3, y3);

        //add a thin, black border to triangle and add it to scene using .getChildren
        triangle.setStroke(Color.BLACK);
        triangle.setStrokeWidth(3);
        triangle.setFill(Color.DARKGREEN);
        root.getChildren().add(triangle);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
