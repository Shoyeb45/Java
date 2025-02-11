package keyevent;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	@FXML
	private Circle myCircle;
	
	public void moveUp() {
		myCircle.setCenterY(myCircle.getCenterY() - 10);
	}
	
	public void moveDown() {
		myCircle.setCenterY(myCircle.getCenterY() + 10);
	}
	
	public void moveLeft() {
		myCircle.setCenterX(myCircle.getCenterX() - 10);
	}
	
	public void moveRight() {
		myCircle.setCenterX(myCircle.getCenterX() + 10);
	}
}
