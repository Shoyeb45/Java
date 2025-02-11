package choicebox;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

public class Controller implements Initializable {
	
//	We don't have onAction field in scene builder for choice box so we have do it manually and implement initializable and to populate the choice box
	@FXML
	private Label myLabel;
	
	@FXML
	private ChoiceBox<String> myChoiceBox;
	
	private String[] food = {"Biryani", "Shawrama", "Chicken"};
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		myChoiceBox.getItems().addAll(food);  // Populating choice box
//		myChoiceBox.setOnAction(this:: getFood); // set the label to food name when selected
		
//		Second way by using lambda expression :-
		myChoiceBox.setOnAction(event -> {
			String foodLabel = myChoiceBox.getValue();
			System.out.println(foodLabel);
			myLabel.setText(foodLabel);
		});
	}
	
	public void getFood(ActionEvent event) {
		String foodLabel = myChoiceBox.getValue();
		myLabel.setText(foodLabel);
	}
}
