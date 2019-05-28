package ro.control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ro.main.Main;

import java.io.IOException;

public class Login {
    public Controller controller = new Controller();

    @FXML
    private TextField textUser;
    @FXML
    private PasswordField password;
    @FXML
    private Button check;
    @FXML
    private Label errors;

    @FXML
    private Button closeWin;

    public void checkHome() {
        check.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if ((textUser.getText().equals("Sami") && (password.getText().equals("Sami"))) == true) {

                    controller.setGradina();
                } else if ((textUser.getText().isEmpty() && (password.getText().isEmpty())) == true) {
                    errors.setText("Te rog introdu datele de logare");
                }
                else {
                    errors.setText("Nu ai introdus ce trebuie ");
                }

            }
        });

    }
    public void close(){
        Main.instantClose();
    }

}
