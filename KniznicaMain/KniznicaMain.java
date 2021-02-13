package KniznicaMain;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



    public class KniznicaMain extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("Kniznica.fxml"));
                    primaryStage.setTitle("Knižnica");
                            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.show();
        }


        public static void main(String[] args) {
            launch(args);
        }

    }

