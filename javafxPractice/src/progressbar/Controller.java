package progressbar;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class Controller implements Initializable {
	
	@FXML
	private Label myLabel;
	
	@FXML
	private ProgressBar healthBar;
	
	@FXML
	private Button attackBtn, gainHealthBtn;
	
	BigDecimal currHealth = new BigDecimal(String.format("%.2f", 1.0));
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myLabel.setText("100%");
		healthBar.setStyle("-fx-accent: #00ff00;");
	}
	
	public void attack() {
		if(currHealth.doubleValue() > 0) {
			currHealth = new BigDecimal(String.format("%.2f", currHealth.doubleValue() - 0.1));
			System.out.println(currHealth.doubleValue());
			healthBar.setProgress(currHealth.doubleValue());
			myLabel.setText(Integer.toString((int) (currHealth.doubleValue() * 100)) + "%");
		}
	}
	
	public void regenrate() {
		System.out.print(currHealth.doubleValue());
		if(currHealth.doubleValue() < 1) {
			currHealth = new BigDecimal(String.format("%.2f", currHealth.doubleValue() + 0.1));
			System.out.println(currHealth.doubleValue());
			healthBar.setProgress(currHealth.doubleValue());
			myLabel.setText(Integer.toString((int) (currHealth.doubleValue() * 100)) + "%");
		}
	}

}
