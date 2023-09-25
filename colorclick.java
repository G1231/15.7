//15.7 Write a program that displays the color of a circle 
//as black when the mouse button is pressed, and as white when 
//the mouse button is released.
package application;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.layout.BorderPane;
import javafx.event.EventHandler;
import javafx.geometry.Pos;

public class colorclick extends Application 
{ 

@Override
public void start(Stage primaryStage) {
  //creating label, pane, and circle
  Label label; 
  BorderPane border = new BorderPane();
  Circle circ = new Circle(150,150, 50);
  //setting the background grey for better color visibility
  border.setStyle("-fx-background-color: grey;");
  //label for instructions
  label = new Label("Hold mouse for black and release for white");
  border.setBottom(label);
  //aligning label and circle to middle for looks
  BorderPane.setAlignment(label, Pos.CENTER);
  BorderPane.setAlignment(circ, Pos.CENTER);
  //setting circle in center and creating scene box
  border.setCenter(circ);
  Scene scene = new Scene(border, 300, 200);
  // actions taken for when mouse is pressed and released
  scene.setOnMousePressed(e -> circ.setFill(javafx.scene.paint.Color.BLACK));
  scene.setOnMouseReleased(e -> circ.setFill(javafx.scene.paint.Color.WHITE));

 
  // creating stage, title, and showing stage.
  primaryStage.setTitle("Hold or click anywhere on the screen to change circle color");
  primaryStage.setScene(scene);
  primaryStage.show();
} 
  
public static void main(String[] args) {
  launch(args);
}
} 

