package lubos.sukup.main.skupinaB.IO;

import java.io.*;

public class InputDemo {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("otazky_odpovede");
            int znak = reader.read();
            while(znak != -1){
                System.out.println((char)znak);
                znak = reader.read();
            }


            FileReader fileReader = new FileReader("otazky_odpovede");

            BufferedReader bufferedReader =
                    new BufferedReader(fileReader);
            String riadok=   bufferedReader.readLine();
            while (riadok != null) {

                System.out.println(riadok);
                riadok=   bufferedReader.readLine();

            }

        } catch (FileNotFoundException e) {

            System.out.println("chyba sa nasla ");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
