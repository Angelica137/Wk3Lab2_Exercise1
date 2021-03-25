import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Triangle extends Application {
	@Override
	public void start(Stage stage) {

		// create the lines
		Line line1, line2, line3;
		line1 = new Line(100, 70, 400, 250);
		line2 = new Line(100, 70, 100, 250);
		line3 = new Line(100, 250, 400, 250);
	}

}
