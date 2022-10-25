package olamundojfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OlaMundoJFX extends Application {

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("FXMLDocument.fxml"));
        Parent root = fxmlloader.load();
        Scene scene = new Scene(root);

        stage.setTitle("Olá, Mundo!");
        stage.setScene(scene);
        stage.show();
    }
}
