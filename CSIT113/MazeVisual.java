
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.text.Text;

public class MazeVisual extends Application {

    //Basic Animation and Scene set up
    private int width = 10;
    private int length = 10;
    private static Maze setUp;
    private Cell[][] maze = setUp.getMaze();

    public static void main(String... args) {
        setUp = new Maze(10, 10);
        launch(args);
    }

    public void start(Stage stage) {
        Group g = new Group();
        Scene scene = new Scene(g, (width + 1) * 50, (length + 1) * 50, Color.BLACK);
        stage.setTitle("Prim's Maze Generator");
        stage.show();

        //Draws the remaining walls of every cell - decided in Maze.java
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                if (maze[i][j] != null && maze[i][j].getTop()) {
                    g.getChildren().add(drawTop(i, j));
                }
                if (maze[i][j] != null && maze[i][j].getBottom()) {
                    g.getChildren().add(drawBottom(i, j));
                }
                if (maze[i][j] != null && maze[i][j].getLeft()) {
                    g.getChildren().add(drawLeft(i, j));
                }
                if (maze[i][j] != null && maze[i][j].getRight()) {
                    g.getChildren().add(drawRight(i, j));
                }

            }
        }
        Text text = new Text(62, 80, "Start");
        Ellipse ellipse = new Ellipse(75, 75, 20, 20);
        ellipse.setFill(Color.BLUE);
        g.getChildren().add(ellipse);
        g.getChildren().add(text);

        stage.setScene(scene);
        stage.show(); //Makes the window visible to the user
    }

//*****************************************Wall Line Drawing Methods***********************************************
    //Draws top wall as a line
    private Line drawTop(int x, int y) {
        Cell cell = maze[x][y];
        if (cell.getTop()) {
            Line top = new Line(50 * x, y * 50, (50 * x + 50), 50 * y);
            top.setStroke(Color.WHITE);
            return top;
        }
        return null;
    }

    //Draws right wall as a line
    private Line drawBottom(int x, int y) {
        Cell cell = maze[x][y];
        if (cell.getBottom()) {
            Line bottom = new Line(50 * x, (50 * y + 50), (50 * x + 50), (50 * y + 50));
            bottom.setStroke(Color.WHITE);
            return bottom;
        }
        return null;
    }

    //Draws left wall as a line
    private Line drawLeft(int x, int y) {
        Cell cell = maze[x][y];
        if (cell.getLeft()) {
            Line left = new Line(x * 50, y * 50, x * 50, (50 * y + 50));
            left.setStroke(Color.WHITE);
            return left;
        }
        return null;
    }

    //Draws right wall as a line
    private Line drawRight(int x, int y) {
        Cell cell = maze[x][y];
        if (cell.getRight()) {
            Line right = new Line((50 * x + 50), y * 50, (50 * x + 50), (50 * y + 50));
            right.setStroke(Color.WHITE);
            return right;
        }
        return null;
    }
}