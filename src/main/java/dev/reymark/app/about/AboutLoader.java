package dev.reymark.app.about;

import java.io.IOException;

import dev.reymark.App;
import dev.reymark.core.loader.Loader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutLoader extends Loader {

  public AboutLoader(App app) {
    super("about/ABOUT", app);

  }

  @Override
  public void load() {
    try {
      StackPane root = loader.load();
      Scene scene = new Scene(root);

      AboutController controller = loader.getController();
      controller.load(app);

      Stage abouStage = new Stage();
      abouStage.setTitle("Address App - About");
      abouStage.getIcons().add(new Image(
          getClass().getResource("/dev/reymark/assets/img/favicon.png")
              .toExternalForm()));

      abouStage.initOwner(app.getApplicationStage());
      abouStage.initModality(Modality.APPLICATION_MODAL);
      abouStage.setResizable(false);
      abouStage.setScene(scene);
      abouStage.showAndWait();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
