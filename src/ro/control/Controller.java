package ro.control;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ro.main.Main;

import java.io.IOException;

import static com.sun.deploy.security.ruleset.DRSResult.Type.EXCEPTION;


public class Controller {
    Main main = new Main();



    @FXML
    private Button porumb;
    @FXML
    private Button cartofi;
    @FXML
    private Button rosii;
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
    public void close(){
        Main.instantClose();
    }









}
