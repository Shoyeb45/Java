package keyevent;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
	
	public void start(Stage stage) throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Main.fxml"));
		Parent root = loader.load();
		Controller controller = loader.getController();
		Scene scene = new Scene(root);
		
		scene.setOnKeyPressed(event -> {
			switch(event.getCode()) {
				case W -> {
					controller.moveUp();
					System.out.println("Moving up"); 
				}
				case S -> {
					controller.moveDown();
					System.out.println("Moving down");
				}
				
				case A -> {
					controller.moveLeft();
					System.out.println("Moving Left");
				}
				
				case D -> {
					controller.moveRight();
					System.out.println("Moving right");
				}
				
				default -> 
					System.out.println("Nothing"); 
			}
		});
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
