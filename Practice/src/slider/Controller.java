package slider;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class Controller implements Initializable {
	
//	We don't have onAction field in scene builder for slider so we have do it manually and implement initializable and to populate the choice box
	@FXML
	private Label myLabel;
	
	@FXML
	private Slider mySlider;
	
	int myTemp;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		myTemp = (int) mySlider.getValue();
		myLabel.setText(Integer.toString(myTemp) + " °C");
		
		mySlider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
				
				myTemp = (int) mySlider.getValue();
				myLabel.setText(Integer.toString(myTemp) + " °C");
			}
			
		});
	}
	
	
}
