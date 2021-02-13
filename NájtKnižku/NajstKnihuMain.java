package NájtKnižku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class NajstKnihuMain extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("NasjtKnihu.fxml"));
            primaryStage.setTitle("Vyhladať Knihu");
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }

    }


