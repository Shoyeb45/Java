package menubar;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Controller implements Initializable {
	@FXML
	private Canvas myCanvas;
	
	private GraphicsContext gc;
	@FXML
	private TextField myTextField;
	@FXML
	private Button createNodeBtn;
	private Stage stage;
	
	
	public void drawNode() {
		try {
			int value = Integer.parseInt(myTextField.getText());
			createNode(value);
		} catch(NumberFormatException e) {
			showAlert("InvalidInput", "Please Enter a number between 1 and 100");
		}
	}
	
	public void showAlert(String title, String msg) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.setTitle(title);
		alert.setContentText(msg);
		alert.setHeaderText(null);
		alert.showAndWait();
	}
	
	public void createNode(int value) {
			gc.clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
		 	double centerX = 100;
		    double centerY = 100;
		    double radius = 50;
		    
		    // Draw a circle
		    gc.setFill(Color.LIGHTBLUE);
		    gc.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);

		    // Create a Text object to calculate text size
		    Text text = new Text(String.valueOf(value));
		    text.setFont(new Font(20));
		    double textWidth = text.getBoundsInLocal().getWidth();
		    double textHeight = text.getBoundsInLocal().getHeight();

		    // Draw the value inside the circle, centered
		    gc.setFill(Color.BLACK);
		    gc.setFont(new Font(20));
		    gc.fillText(text.getText(), centerX - textWidth / 2, centerY + textHeight / 4);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		gc = myCanvas.getGraphicsContext2D();	
	}
	
	public void saveNodeImage() {
		FileChooser fileChooser = new FileChooser();
		fileChooser.getExtensionFilters().addAll(
				new FileChooser.ExtensionFilter("PNG Files (*.png)", "*.png"),
				new FileChooser.ExtensionFilter("JPEG Files (*.jpeg)", "*.jpeg"),
				new FileChooser.ExtensionFilter("jpg Files (*.jpg)", "*.jpg")
		);
		
		File file = fileChooser.showSaveDialog(stage);
		
		if(file != null) {
			saveImage(file);
		}
	}
	
	public void saveImage(File file) {
		WritableImage img = myCanvas.snapshot(new SnapshotParameters(), null);
		try {
			ImageIO.write(SwingFXUtils.fromFXImage(img, null), getFileExtension(file), file);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private String getFileExtension(File file) {
		String name = file.getName();
        int index = name.lastIndexOf('.');
        return index > 0 ? name.substring(index + 1) : "";
	}
}
