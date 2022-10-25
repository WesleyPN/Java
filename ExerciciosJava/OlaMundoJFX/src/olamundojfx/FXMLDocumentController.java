package olamundojfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class FXMLDocumentController {

    @FXML
    private Button btnclick;

    @FXML
    private Label lblmensagem;

    @FXML
    private void clicouBotao(ActionEvent event) {
        if (lblmensagem.getText().equals("Olá, Mundo!")) {
            lblmensagem.setText("Olá, JavaFX " + System.getProperty("javafx.version") + "!");
            lblmensagem.setTextFill(Color.MEDIUMBLUE);
        } else {
            lblmensagem.setText("Olá, Mundo!");
            lblmensagem.setTextFill(Color.GREEN);
        }
    }

}
