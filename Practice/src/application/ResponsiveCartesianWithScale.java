package application;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ResponsiveCartesianWithScale extends Application {

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        // Create x-axis
        Line xAxis = new Line();
        xAxis.setStroke(Color.BLACK);
        
        // Bind x-axis start and end points to pane dimensions
        xAxis.startXProperty().bind(Bindings.multiply(pane.widthProperty(), 0));
        xAxis.endXProperty().bind(pane.widthProperty());
        xAxis.startYProperty().bind(Bindings.divide(pane.heightProperty(), 2));
        xAxis.endYProperty().bind(Bindings.divide(pane.heightProperty(), 2));

        // Create y-axis
        Line yAxis = new Line();
        yAxis.setStroke(Color.BLACK);
        
        // Bind y-axis start and end points to pane dimensions
        yAxis.startXProperty().bind(Bindings.divide(pane.widthProperty(), 2));
        yAxis.endXProperty().bind(Bindings.divide(pane.widthProperty(), 2));
        yAxis.startYProperty().bind(Bindings.multiply(pane.heightProperty(), 0));
        yAxis.endYProperty().bind(pane.heightProperty());

        // Add grid lines and tick marks dynamically based on pane dimensions
        pane.widthProperty().addListener((obs, oldWidth, newWidth) -> {
            drawGridLines(pane, newWidth.doubleValue(), pane.getHeight());
            drawTickMarks(pane, newWidth.doubleValue(), pane.getHeight());
        });
        pane.heightProperty().addListener((obs, oldHeight, newHeight) -> {
            drawGridLines(pane, pane.getWidth(), newHeight.doubleValue());
            drawTickMarks(pane, pane.getWidth(), newHeight.doubleValue());
        });

        // Add axis labels
        Text xLabel = new Text("X");
        xLabel.setFont(new Font(12));
        xLabel.xProperty().bind(Bindings.divide(pane.widthProperty(), 2).add(5));
        xLabel.yProperty().bind(Bindings.divide(pane.heightProperty(), 2).subtract(5));

        Text yLabel = new Text("Y");
        yLabel.setFont(new Font(12));
        yLabel.xProperty().bind(Bindings.divide(pane.widthProperty(), 2).add(5));
        yLabel.yProperty().set(10);

        // Add all elements to the pane
        pane.getChildren().addAll(xAxis, yAxis, xLabel, yLabel);

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Responsive Cartesian Coordinate System with Scale");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawGridLines(Pane pane, double width, double height) {
        pane.getChildren().removeIf(node -> node instanceof Line && ((Line) node).getStroke() == Color.LIGHTGRAY);

        int gridSpacing = 20; // Adjust grid spacing as needed
        for (int i = 0; i < width; i += gridSpacing) {
            // Vertical grid lines
            Line vLine = new Line(i, 0, i, height);
            vLine.setStroke(Color.LIGHTGRAY);
            vLine.setStrokeWidth(0.5);
            pane.getChildren().add(vLine);
        }
        for (int i = 0; i < height; i += gridSpacing) {
            // Horizontal grid lines
            Line hLine = new Line(0, i, width, i);
            hLine.setStroke(Color.LIGHTGRAY);
            hLine.setStrokeWidth(0.5);
            pane.getChildren().add(hLine);
        }
    }

    private void drawTickMarks(Pane pane, double width, double height) {
        // Remove previous tick marks and labels
        pane.getChildren().removeIf(node -> node instanceof Line && ((Line) node).getStroke() == Color.BLACK && node != pane.getChildren().get(0) && node != pane.getChildren().get(1));
        pane.getChildren().removeIf(node -> node instanceof Text && ((Text) node).getFont().getSize() == 10);

        int tickSpacing = 20; // Pixel scale interval

        // Draw x-axis tick marks and labels
        for (int i = 0; i < width; i += tickSpacing) {
            Line tick = new Line(i, height / 2 - 5, i, height / 2 + 5);
            tick.setStroke(Color.BLACK);
            pane.getChildren().add(tick);

            Text label = new Text(String.valueOf((int) (i - width / 2)));
            label.setFont(new Font(10));
            label.setX(i - label.getLayoutBounds().getWidth() / 2);
            label.yProperty().bind(Bindings.divide(pane.heightProperty(), 2).add(15));
            pane.getChildren().add(label);
        }

        // Draw y-axis tick marks and labels
        for (int i = 0; i < height; i += tickSpacing) {
            Line tick = new Line(width / 2 - 5, i, width / 2 + 5, i);
            tick.setStroke(Color.BLACK);
            pane.getChildren().add(tick);

            if (i != height / 2) { // Avoid overlapping 0 label
                Text label = new Text(String.valueOf((int) ((height / 2) - i)));
                label.setFont(new Font(10));
                label.xProperty().bind(Bindings.divide(pane.widthProperty(), 2).add(10));
                label.setY(i + label.getLayoutBounds().getHeight() / 4);
                pane.getChildren().add(label);
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
