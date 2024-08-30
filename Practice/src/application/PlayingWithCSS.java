package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PlayingWithCSS extends Application {
	public void start(Stage stage) {
		try {
//			First Link FXML file
			FXMLLoader loader = new FXMLLoader(getClass().getResource("CSSStyling.fxml"));
			Parent root = loader.load();
			Scene scene = new Scene(root); // Create scene
			
//			Linking CSS file
			String cssPath = this.getClass().getResource("application.css").toExternalForm();
			scene.getStylesheets().add(cssPath);
			
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
