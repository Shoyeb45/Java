package checkbox;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	@FXML
	private ImageView myImageView;
	
	@FXML
	private Label myLabel;
	
	@FXML
	private CheckBox myCheckBox;
	
	Image imageOn = new Image(getClass().getResourceAsStream("luffyHappy.jpg"));
	Image imageOff = new Image(getClass().getResourceAsStream("luffySad.jpg"));
	
	public void change(ActionEvent event) {
		if(myCheckBox.isSelected()) {
			myLabel.setText("CheckBox is on");
			myImageView.setImage(imageOn);
		} else {
			myLabel.setText("CheckBox is off");
			myImageView.setImage(imageOff);
		}
	}
}
