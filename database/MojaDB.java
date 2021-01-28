package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MojaDB {

     /*
        Vytvorite si novy balicek a  triedu

        a vytvorime si spojenie s nasou DB:
       nainstalujeme si H2 console a vytvorime si databazu H2

       stiahneme si driver a importijeme do projektu

        1. Vytvorime si Connection objekt

        2. vytvorime si objekt Statement

        3. vytvorimse si String dotaz z SQL

        4 vytvorime si tabulku

       5. vlozime jeden alebo viac riadkov zaznamu

        */


    public static void main(String[] args) {

        String url = "jdbc:h2:tcp://localhost/C:/databaza/db.db";
        String meno = "samo";
        String heslo ="mojenko123";


        try {
            Connection spojene = DriverManager.getConnection(url,meno,heslo);

            Statement statement = spojene.createStatement();

            String sql =  "CREATE TABLE  Uzivatelia " +
                    "(id INTEGER not NULL, " +
                    " meno VARCHAR(255), " +
                    " priezvisko VARCHAR(255), " +
                    " vek INTEGER, " +
                    " PRIMARY KEY ( id ))";

            statement.execute(sql);

           // System.out.println("tabulka vytvorena");

            String sqlinsert = "INSERT INTO Uzivatelia VALUES (200, 'Lubos',32,25); ";

          boolean test = statement.execute(sqlinsert);

            //System.out.println(test);

            System.out.println("data vlozene");

            spojene.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
