package packageA;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.stage.Stage;


public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hello JavaFX");

        Canvas canvas = new Canvas(600, 400);
        root.getChildren().add(canvas);
        System.out.println("hello");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

