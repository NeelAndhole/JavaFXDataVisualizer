
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
// import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Frontend extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    BorderPane pane = new BorderPane();
    createOuterStructures(pane);



    Scene scene = new Scene(pane, 800, 600);
    stage.setScene(scene);
    stage.setTitle("JavaFXGame");
    stage.show();
  }

  /**
   * this method creates the
   * 
   * @param pane
   */
  private void createOuterStructures(BorderPane pane) {
    // setting up the outermost strucutre of the bottom controls
    HBox quitAndAboutBox = new HBox(2);
    VBox bottomAligner = new VBox(2);
    pane.setBottom(bottomAligner);
    // quitAndAboutBox.setPadding(new Insets(4d));
    quitAndAboutBox.setAlignment(Pos.CENTER);

    // quitButton controls and setup
    Button quitButton = new Button("Quit");
    quitButton.setPadding(new Insets(4));
    quitButton.setOnAction(e -> Platform.exit());
    quitButton.setId("quitButton");
    quitAndAboutBox.getChildren().add(quitButton);
    quitButton.setAlignment(Pos.CENTER);

    // about label and button controls and setup
    Label aboutLabel = new Label("");
    bottomAligner.getChildren().add(aboutLabel);
    bottomAligner.getChildren().add(quitAndAboutBox);
    Button aboutButton = new Button("About");
    aboutButton.setOnAction(e -> {
      if (aboutLabel.getText().equals("")) {
        aboutLabel.setText(
            "This is a game that is meant to showcase the JavaFX Framework and its testing Capabilities");
      } else
        aboutLabel.setText("");
    });
    aboutLabel.setAlignment(Pos.CENTER);
    aboutButton.setAlignment(Pos.CENTER);
    quitAndAboutBox.getChildren().add(aboutButton);

  }

}
