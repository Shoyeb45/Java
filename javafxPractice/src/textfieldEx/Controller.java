package textfieldEx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private Label myLabel;
	@FXML
	private TextField myTextField;
	@FXML
	private Button myBtn;
	
	int age;
	
	public void submit(ActionEvent event) {
		try {
			age = Integer.parseInt(myTextField.getText());
			
			if(age < 0) {
				myLabel.setText("Only Positive Intergers");
				return;
			}
			if(age >= 18) {
				myLabel.setText("Congratulations!! You are eligible");
				 System.out.println("You are eligible " + age);
			} else {
				myLabel.setText("You are not eligible");
				System.out.println("You are not eligible " + age);
			}
		} catch(NumberFormatException n) {
			myLabel.setText("Enter only number please");
			System.out.println("Please enter the numbers only");
		}
		catch(Exception e) {
			System.out.print(e);
		}
		
	}
}
