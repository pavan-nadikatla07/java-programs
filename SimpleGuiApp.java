import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class SimpleGuiApp extends Application
{
public void start(Stage primaryStage)
{
Label label = new Label("Welcome to JavaFX..!!");
Image image = new Image("file:D:\24A81A0542/owl.jpg");
ImageView imageView = new ImageView(image);
imageView.setFitWidth(275);
imageView.setPreserveRatio(true);
VBox vbox = new VBox(10);
vbox.getChildren().addAll(label, imageView);
Scene scene = new Scene(vbox, 400, 400);
primaryStage.setTitle("JavaFX GUI Example");
primaryStage.setScene(scene);
primaryStage.show();
}
public static void main(String[] args)
{
launch(args);
}
}