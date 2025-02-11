package logoutbutton;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {
	public void start(Stage stage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			stage.setOnCloseRequest(event -> {
				event.consume(); // To not close the window upon cancel
				logout(stage);   // Calling logout method to show the alert window on pressing cancel button
			});
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void logout(Stage stage) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Logout");
		alert.setHeaderText("You are about to log out");
		alert.setContentText("Do you want to save before exiting?: ");  
		
		if(alert.showAndWait().get() == ButtonType.OK) {
			System.out.println("You succefuly logged out");
			stage.close();			
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
