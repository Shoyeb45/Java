package imageviewEx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	@FXML
	ImageView myImageView;
	Button myBtn;
	Image myImage = new Image(getClass().getResourceAsStream("luffy2.jpeg"));
	
	public void changeImage() {
		Image currImage = myImageView.getImage();
		if(currImage == myImage) {
			Image luffy1 = new Image(getClass().getResourceAsStream("luffy1.jpg"));
			myImageView.setImage(luffy1);
		} else {
			myImageView.setImage(myImage);			
		}
	}
}
