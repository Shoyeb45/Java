package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;


public class Main extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
//		Stage stage = new Stage();
		Group root = new Group(); // root node to be passed to scene
		Scene scene = new Scene(root, Color.PINK);  // Scene cannot be empty it should have parent
		
		Image icon = new Image("earth.png"); // Setting up logo in application
		stage.getIcons().add(icon);  // Set Icon
		stage.setTitle("Shoyeb's Java Application");  // Set the title of window
		
//		Set Height and Width
		stage.setHeight(500);
		stage.setWidth(500);
		
//		Disable resizable
		stage.setResizable(false);
		
//		Set the position of window upon running
//		stage.setX(100);
//		stage.setY(100);
		
//		Set the screen in fullscreen
		stage.setFullScreen(true);
		
//		Change the Full screen exit hint and key
		stage.setFullScreenExitHint("You can't escape until your press 'q'");
		stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
		
		stage.setScene(scene);
		stage.show();
	}
}
