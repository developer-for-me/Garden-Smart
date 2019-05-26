package ro.main;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import ro.abstractPerson.Person;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage = new Stage();
        Parent startRoot = FXMLLoader.load(Main.class.getResource("/ro/interfaces/Login.fxml"));
        primaryStage.setTitle("Login");
        setStage(primaryStage,startRoot);
    }
    public void gradina() throws Exception{
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(Main.class.getResource("/ro/interfaces/Home.fxml"));
        primaryStage.setTitle("Main");
        setStage(primaryStage,root);
    }
    public void parcelaRosi() throws Exception{
        Stage rosii = new Stage();
        Parent rosiiWin = FXMLLoader.load(Main.class.getResource("/ro/interfaces/Rosii.fxml"));
        rosii.setTitle("Rosii");
        setStage(rosii, rosiiWin);
    }
    public void parcelaPorumb()throws Exception{
        Stage porumb = new Stage();
        Parent porumbWin = FXMLLoader.load(Main.class.getResource("/ro/interfaces/Porumb.fxml"));
        porumb.setTitle("Porumb");
        setStage(porumb,porumbWin);
    }
    public void parcelaCartofi()throws Exception{
        Stage cartofi = new Stage();
        Parent cartofiWin = FXMLLoader.load(Main.class.getResource("/ro/interfaces/Cartofi.fxml"));
        cartofi.setTitle("Cartofi");
        setStage(cartofi,cartofiWin);
    }





    private void setStage(Stage stage, Parent parent) {
        Scene scene1 = new Scene(parent);
        stage.setMaxHeight(600);
        stage.setMaxWidth(600);
        stage.setMaximized(false);
        stage.setMinHeight(600);
        stage.setMinWidth(600);
        scene1.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene1);
        stage.show();
    }


    public static void main(String[] args) {
        Person person = new Person("Nechiforel david ","197080900800");
        Person person1 = new Person("Nechiforel david ","197080900800");

        System.out.println(person.compareTo(person1));
        launch(args);
    }
}
