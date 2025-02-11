package radiobutton;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
	@FXML
	private Label myLabel;
	@FXML
	private RadioButton btnChicken, btnBiryani, btnShawrama;
	
	@FXML
	private ImageView myImageView;
	
	Image biryani = new Image(getClass().getResourceAsStream("biryani.jpg"));
	Image butterChicken = new Image(getClass().getResourceAsStream("butterChicken.jpg"));
	Image shawrama = new Image(getClass().getResourceAsStream("shawrama.jpg"));
	
	public void getFood(ActionEvent event) {
		String foodLabel = "";
		
		if(btnBiryani.isSelected()) {
			foodLabel = btnBiryani.getText();
			myImageView.setImage(biryani);
		} else if(btnChicken.isSelected()) {
			foodLabel = btnChicken.getText();
			myImageView.setImage(butterChicken);
		} else if(btnShawrama.isSelected()) {
			foodLabel = btnShawrama.getText();
			myImageView.setImage(shawrama);
		}
		myLabel.setText("You have selected " + foodLabel + "!!");
	}
	
}
