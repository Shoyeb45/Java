package application;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ScenePractice extends Application {
	
	public void start(Stage stage) throws Exception {
		Group root = new Group();
		Scene scene = new Scene(root, 700, 600, Color.BLACK);
		
//		Add Text to the Scene
		Text text = new Text("We are going to learn Scene");  // We can pass string in constructor or
//		We can use setText() method of Text class
		text.setFill(Color.WHITE);  // Change the color of text
		text.setText("Whoaaa!!!");
        // Set X and Y coordinate
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 30));
	
//		Making line
		Line line = new Line();
		line.setStartX(30);  
		line.setStartY(100);
		line.setEndX(300);
		line.setEndY(100);
		line.setStrokeWidth(5);  // To set the width
		line.setStroke(Color.WHITE); // T0 set the color
		line.setOpacity(0.2); // To control the opacity
//		line.setRotate(-45);  // Rotate the line
		
		
//		Rectangle
		Rectangle rect = new Rectangle();
		rect.setX(200);  // X coordinate
		rect.setY(200);  // Y coordinate
		rect.setHeight(120); // Height of rectangle
		rect.setWidth(200);
		rect.setFill(Color.WHITE);
		rect.setStroke(Color.GREEN);
		rect.setStrokeWidth(5);
		
//		Add Triangle in scene
		Polygon triangle = new Polygon();
		triangle.getPoints().setAll(
				250.0, 400.0,
				500.0, 500.0,
				300.0, 600.0);   // Give all points (x1, y1, x2, y2, x3, y3)
		triangle.setFill(Color.WHITE);
		triangle.setStroke(Color.GREEN);
		triangle.setStrokeWidth(5);
		
//		Circle
		Circle circle = new  Circle();
		circle.setCenterX(100);
		circle.setCenterY(450);
		circle.setRadius(90);
		circle.setFill(Color.YELLOW);
		circle.setStrokeWidth(5);
		circle.setStroke(Color.WHITE);
		Text txt = new Text("7");
		txt.setFont(Font.font("Serif", 30));
//        txt.setX(circle.getCenterX());
//        txt.setY(circle.getCenterY());
        txt.setX(100);
        txt.setY(450);
		txt.setFill(Color.BLACK);
		
//		Add Image
		Image luffy = new Image("luffy.png");
//		Make ImageView object of Image object
		ImageView image = new  ImageView(luffy);
		image.setX(400); 
		image.setY(10);
		image.setFitHeight(300); // Adjust height of an image
		image.setFitWidth(300); // Adjust width of an image
		
		root.getChildren().add(text); // add Text type of object as a children node of root 
		root.getChildren().add(line); // add Line 
		root.getChildren().add(rect); // Add rectangle
		root.getChildren().add(triangle); // Add Triangle to scene
		root.getChildren().add(circle);
		root.getChildren().add(image);
		root.getChildren().add(txt);
		
		stage.setTitle("Scene Practice App");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
