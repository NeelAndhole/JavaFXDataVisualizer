
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
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
    createOuterBottomStructure(pane);
    showStartScreen(pane);


    Scene scene = new Scene(pane, 800, 600);
    stage.setScene(scene);
    stage.setTitle("JavaFXGame");
    stage.show();
  }

  private void showStartScreen(BorderPane pane) {
    VBox startLabelandButton = new VBox();
    pane.setCenter(startLabelandButton);
    Label startLabel = new Label("JavaFXGame");
    Button startButton = new Button("Start");
    startLabelandButton.getChildren().addAll(new Node[] {startButton, startLabel});
    startLabelandButton.setAlignment(Pos.CENTER);
    startButton.setOnAction(e -> {
      showPlayScreen(pane);
    });


  }

  private void showPlayScreen(BorderPane pane) {
    pane.setCenter(new Label("remove later"));

  }

  /**
   * this method creates the
   * 
   * @param pane
   */
  private void createOuterBottomStructure(BorderPane pane) {
    // setting up the outermost strucutre of the bottom controls
    HBox quitAndAboutBox = new HBox(2);
    VBox bottomAligner = new VBox(2);
    bottomAligner.setAlignment(Pos.CENTER);
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
        aboutLabel.setAlignment(Pos.CENTER);
      } else
        aboutLabel.setText("");
    });
    aboutLabel.setAlignment(Pos.CENTER);
    aboutButton.setAlignment(Pos.CENTER);
    quitAndAboutBox.getChildren().add(aboutButton);

  }

}
