package ed.bloomu.homework4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

/**
 * Prints an image to the screen of four rectangles overlapping circles. Each rectangle
 * has a different opacity by inputting different Alpha Values.
 *
 * @author Jessica Ruehle
 */
public class AlphaValues extends Application {


    @Override
    public void start(Stage stage) {

        //make a new scene and declare its size and color
        final int height = 300;
        final int width = 500;
        Pane root = new Pane();
        Scene scene = new Scene(root, width, height, Color.LAVENDER);

        stage.setTitle("Alpha Values");
        stage.setAlwaysOnTop(true);
        stage.setScene(scene);
        stage.show();

        //make the circles using an x and y coordinate as well as the radius
        //I got the x coordinates by taking the width of each rectangle, dividing it by
        // 2, and then adding the x coordinate pixel value. x + width/2. The final
        // value (x,y of the circle's center) was found by diving the rectangle's width
        // by 2 and adding half of the stroke width to that.
        Circle c1 = new Circle(100, 60, 51);
        Circle c2 = new Circle(250, 60, 51);
        Circle c3 = new Circle(400, 60, 51);

        //add color to all three circles and have them added to the scene using
        // .getChildren method
        c1.setFill(Color.SLATEGRAY);
        c2.setFill(Color.SLATEGRAY);
        c3.setFill(Color.SLATEGRAY);
        root.getChildren().add(c1);
        root.getChildren().add(c2);
        root.getChildren().add(c3);

        //declare rectangle height and width
        final int rectWidth = 100;
        final int rectHeight = 200;

        //declare three variables for the locations of the top left corners of the
        // rectangles
        final int x1 = 50;
        final int x2 = 200;
        final int x3 = 350;
        final int y = 60;

        //create three Rectangle objects named rect1, rect2, and rect3
        Rectangle rect1 = new Rectangle(x1, y, rectWidth, rectHeight);
        Rectangle rect2 = new Rectangle(x2, y, rectWidth, rectHeight);
        Rectangle rect3 = new Rectangle(x3, y, rectWidth, rectHeight);
        Color rect1Color = new Color(0, 0, 0, 0.20);
        Color rect2Color = new Color(0, 0, 0, 0.50);
        Color rect3Color = new Color(0, 0, 0, 0.80);

        //add color and stroke to all three rectangles
        rect1.setFill(rect1Color);
        rect2.setFill(rect2Color);
        rect3.setFill(rect3Color);
        rect1.setStroke(Color.BLACK);
        rect2.setStroke(Color.BLACK);
        rect3.setStroke(Color.BLACK);
        rect1.setStrokeWidth(2);
        rect2.setStrokeWidth(2);
        rect3.setStrokeWidth(2);

        //add rectangles to the scene using .getChildren method
        root.getChildren().add(rect1);
        root.getChildren().add(rect2);
        root.getChildren().add(rect3);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
