package ro.control;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
    Controller controller = new Controller();
    @FXML
    private TextField textUser;
    @FXML
    private PasswordField password;
    @FXML
    private Button check;
    @FXML
    private Label errors;

    public void close(){
        controller.setClose();
    }


    public void checkHome(){
    check.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
        if ((textUser.getText().equals("Sami")&&(password.getText().equals("Sami")))==true){
            if (true){
                errors.setText("Ai introdus ce trebuie");
                // STOPSHIP: 5/27/2019

            }
            controller.setGradina();
        }
        else if ((textUser.getText().isEmpty()&&(password.getText().isEmpty()))==true) {
            errors.setText("Te rog introdu datele de logare");
        }
        else {
            errors.setText("Nu ai introdus ce trebuie");
        }
        }
        });
    }

}
