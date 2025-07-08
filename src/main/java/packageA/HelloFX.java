package packageA;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.canvas.Canvas;


public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello JavaFX");

        Canvas canvas = new Canvas(600, 400);
        root.getChildren().add(canvas);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

