package communicationBetweenControllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Greetings {
	@FXML
	TextField nameTextField;
	private Stage stage;
	private Scene scene;
	private Parent root;
	Label nameLabel;
	public void enter(ActionEvent event) throws IOException {
		String userName = nameTextField.getText();
		FXMLLoader loader = new FXMLLoader(getClass().getResource("GreetingScene.fxml"));
		root = loader.load();
		
		Scene2Controller sc2 = loader.getController();
		sc2.displayName(userName);
		
		stage = (Stage)(((Node)event.getSource()).getScene().getWindow());
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
