package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

// This file is event method handler for EventHandling class
public class Controller {
	@FXML
	private Circle circle;
	private double x;
	private double y;
	
	public void up(ActionEvent e) {
		System.out.println("Up");
		circle.setCenterY(y -= 1);
		System.out.println("New Coordinate : " + y);
		circle.setFill(Color.BLACK);
	}
	
	public void down(ActionEvent e) {
		System.out.println("Down");
		circle.setCenterY(y += 1);
		System.out.println("New Coordinate : " + y);
		circle.setFill(Color.GREEN);
	}
	
	public void left(ActionEvent e) {
		System.out.println("Left");
		circle.setCenterX(x -= 1);
		System.out.println("New Coordinate : " + x);
		circle.setFill(Color.BLUE);
	}
	
	public void right(ActionEvent e) {
		System.out.println("Right");
		circle.setCenterX(x += 1);
		System.out.println("New Coordinate : " + x);
		circle.setFill(Color.VIOLET);
	}
}
