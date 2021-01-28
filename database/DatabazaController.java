package database;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

public class DatabazaController {
    @FXML
    TextField meno;

    @FXML
    TextField priezvisko;

    @FXML
    TextField vek;

    @FXML
    TextArea vysledok;


    @FXML
    public void save(){
        System.out.println("save ");

        String guiMeno ;
        String guiPriezvisko;
        String guiVek;
        String url =  "jdbc:h2:tcp://localhost/C:/databaza/db.db";
        String name = "samo";
        String pass = "samo";

        guiMeno = meno.getText();
        guiPriezvisko = priezvisko.getText();
        guiVek = vek.getText();


        try {

            Connection spojenieDatabaze = DriverManager.getConnection(url,name,pass);

            Statement statementDatabaze = spojenieDatabaze.createStatement();

            String sqlinsert = "INSERT INTO Uzivatelia VALUES (" + generator() + ", '"+ guiMeno +"','"+ guiPriezvisko +"','"+ guiVek + "');";
            boolean test = statementDatabaze.execute(sqlinsert);
            spojenieDatabaze.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }




    }

    private int  generator() {
        Random random = new Random();
        return (random.nextInt(500));
    }





}
