package ro.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import ro.main.Main;


public class Controller {
    static final String EXCEPTION = "Este o exceptie";
    Main main = new Main();
    @FXML
    private Button porumb;

    @FXML
    private Button cartofi;

    @FXML
    private Button rosii;

    @FXML
    private Button close;

    @FXML
    public void setClose(){
        System.exit(0);
    }

    @FXML
    public void setRosii (ActionEvent event) {
        try {
            main.parcelaRosi();
        }catch (Exception e){
            System.out.println(EXCEPTION);
        }
    }
    @FXML
    public void setGradina(){
        try {
            main.gradina();
        } catch (Exception e) {
            System.out.println(EXCEPTION);
        }
    }
    @FXML
    public void setPorumb(){
        try {
            main.parcelaPorumb();
        }catch (Exception e){
            System.out.println(EXCEPTION);
        }
    }
    @FXML
    public void setCartofi(){
        try {
            main.parcelaCartofi();
        }catch (Exception e){
            System.out.println(EXCEPTION);
        }
    }
}
