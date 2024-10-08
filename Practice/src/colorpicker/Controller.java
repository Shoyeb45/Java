package colorpicker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;

public class Controller {
	@FXML
	private AnchorPane myPane;
	
	@FXML
	private ColorPicker myColorPicker;
	
	public void changeBackgroundColor(ActionEvent event) {
		Color newColor = myColorPicker.getValue();
		myPane.setBackground(new Background(new BackgroundFill(newColor, null, null)));
	}
}
