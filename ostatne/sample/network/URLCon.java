package lubos.sukup.main.skupinaB.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLCon {

    public static void main(String[] args)  {

        try {
            URL url = new URL("http://example.org");


        URLConnection urlConnection = url.openConnection();

        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();


        BufferedReader imputStream = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

        String line = "";

        while ( line != null){
                line = imputStream.readLine();
                System.out.println(line);
        }


            imputStream.close();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
