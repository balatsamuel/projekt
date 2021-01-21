package lubos.sukup.main.skupinaB.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLCitat {

    public static void main(String[] args) {

        try {
            //URL url = new URL("file:///C:/Users/lubossukup/git/skolarepo/otazky_odpovede");
            URL url = new URL("https://official-joke-api.appspot.com/random_ten");


            BufferedReader  reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String output;
            while ((output= reader.readLine()) != null){

                System.out.println(output);
            }

            //System.out.println("test");




        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
