package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class EventHandling extends Application {
	
	public void start(Stage stage) {
		try {
//			 Link FXML Document to java file
			 FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
			 Parent root = loader.load();
			 Scene scene = new Scene(root);
			 
			 stage.setScene(scene);
			 stage.show();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	public static void main(String[] args) {
		launch(args);
	}

}
