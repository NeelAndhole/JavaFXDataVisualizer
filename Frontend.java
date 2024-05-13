import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Frontend extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    BorderPane pane = new BorderPane();

    Scene scene = new Scene(pane, 800, 600);
    stage.setScene(scene);
    stage.setTitle("JavaFXGame");
    stage.show();
  }

}
