import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Triangle extends Application {
	@Override
	public void start(Stage stage) {

		// create the lines
		Line line1, line2, line3;
		line1 = new Line(100, 70, 400, 250);
		line1.setStroke(Color.BLUE);
		line2 = new Line(100, 70, 100, 250);
		line2.setStroke(Color.BLUE);
		line3 = new Line(100, 250, 400, 250);
		line3.setStroke(Color.BLUE);

		// create a group that holds th triangle
		Group root = new Group(line1, line2, line3);

		// create and config a scene
		Scene scene = new Scene(root, 500, 500);

	}

}
