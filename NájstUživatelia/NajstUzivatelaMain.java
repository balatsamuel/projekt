package NájstUživatelia;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import static javafx.application.Application.launch;

public class NajstUzivatelaMain {

    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("NajstUzivatela.fxml"));
        primaryStage.setTitle("Nájsť Užívatela");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


}




