package lubos.sukup.main.skupinaB.IO;

import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class MyFile {

    public static void main(String[] args) {

        System.out.println("skupinaA\nskupinaB");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
       myFile();

    }

    public static void myFile(){

        File myFile = new File("src/lubos/sukup/main/SkupinaA");


        System.out.println(myFile.getAbsolutePath());
        System.out.println(myFile.canRead());
        System.out.println(myFile.exists());
        System.out.println(myFile.getName());
        System.out.println(myFile.isDirectory());

        if(myFile.isDirectory()){
//tuuuuuuuuuuuuuuuuuuuu ->>>
     //---->//
             String[] mojZoznam=  myFile.list();

            System.out.println(mojZoznam.length);



         for (int i = 0; i < mojZoznam.length ;i++ ){

              System.out.println("element cislo : " + i + " obsah pola : " +mojZoznam[i]);
          }

            System.out.println("----------------------------------------------------------------------------------");
         // File[]  zoznamSuborov = myFile.listFiles();
          //  Arrays.asList(zoznamSuborov).forEach(System.out::println);
            Arrays.asList(myFile.list()).forEach(System.out::println);


        }


    }

}
