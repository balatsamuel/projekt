package lubos.sukup.main.skupinaB.IO;

import java.io.FileWriter;
import java.io.IOException;

import static lubos.sukup.main.skupinaB.IO.BufferWrite.bufferWriter;
import static lubos.sukup.main.skupinaB.IO.MyFile.myFile;

public class OutputDemo {

    public static void main(String[] args) {


        try {
            bufferWriter();
            fileWriter();
            myFile();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileWriter() {
        try {
            //writer zmenime cely subor
            FileWriter writer = new FileWriter("otazky_odpovede");
            writer.write("nas novy riadok");
            writer.close();

            //writer pridavanie na konci suboru
            FileWriter writer1 = new FileWriter("novy_dokument",
                    true);
            writer1.write("\nDalsi riadok");
            writer1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    int x = 1;
    int y = 2;

    {
        while (x >0){
            System.out.println();
        }
    }


}


