package ed.bloomu.homework4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

/**
 * Draws a diagonal bar with a thick border around the parameter of the shape.
 *
 * @author Jessica Ruehle
 */

public class DiagonalLine extends Application {

    @Override
    public void start(Stage stage) {

        //make a new scene and declare its size and color
        Pane root = new Pane();
        final int width = 500;
        final int height = 400;
        Scene scene = new Scene(root, width, height, Color.PLUM.brighter());

        stage.setTitle("Diagonal Line");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

        //these are a series of points that draw the outline of the polygon
        final int x1 = 30; //top left corner
        final int y1 = 30; //top left corner

        final int x2 = 100; //top left, right of corner
        final int y2 = 30; //top left, right of corner

        final int x3 = 470; //bottom right, above corner
        final int y3 = 300; //bottom right, above corner

        final int x4 = 470; //bottom right corner
        final int y4 = 370; //bottom right corner

        final int x5 = 400; //bottom right, left of corner
        final int y5 = 370; //bottom right, left of corner

        final int x6 = 30; //top left, below corner
        final int y6 = 100; //top left, below corner


        //using the polygon method, create a new object and enter all the points in the
        // order they should be drawn. Add polygon to the scene using .getChildren()
        Polygon line = new Polygon(x1, y1, x2, y2, x3, y3, x4, y4, x5, y5, x6,y6);
        root.getChildren().add(line);

        //add color to the inside of the line as well as add a thick, dark marron
        // border. Final line sets the width of the border
        line.setFill(Color.DARKRED);
        line.setStroke(Color.MAROON.darker());
        line.setStrokeWidth(20);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
