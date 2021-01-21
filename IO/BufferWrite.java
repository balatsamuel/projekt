package lubos.sukup.main.skupinaB.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWrite {

    public static void main(String[] args) throws IOException {


        bufferWriter();

    }

    public static void bufferWriter() throws IOException{
FileWriter fileWriter = new FileWriter
        ("novy_dokukent",true);

        BufferedWriter writer = new BufferedWriter(fileWriter);
        writer.newLine();
        writer.write("test dalsi");
        writer.close();
    }

}
