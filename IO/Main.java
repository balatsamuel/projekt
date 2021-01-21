package lubos.sukup.main.skupinaB.IO;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello world");
       // System.in.read();
       // System.err.println();
        System.out.println("mapist text: ");
        Scanner scanner = new Scanner(System.in);

        String out = scanner.nextLine();
        int pocet = pocetZnakov(out);
        //vytvorte metodu ktora spocita pocet znakov v zadamom texte
        System.out.println("vystupny text: "+out);
        System.out.println("pocet znakov je: "+ pocet);

    }
    public static int pocetZnakov(String vstup) {
        return vstup.length();
    }

    //komentar na demostraciu git-u
    // vstupna premenna metody bude String a vystup bude int

}
