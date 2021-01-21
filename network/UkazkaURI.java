package lubos.sukup.main.skupinaB.network;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class UkazkaURI {

    public static void main(String[] args) {

        try {
            URI uri = new URI("file://username:password@myserver.com:5000/catalouge/phones?os=android#samsung");

            URL url = new URL("http://username:password@myserver.com:5000/catalouge/phones?os=android#samsung");

            URL uriToURL = uri.toURL();

            URI urlToURI = url.toURI();

            System.out.println("Scheme = " + uri.getScheme());
            System.out.println("Scheme-specific part :" + uri.getSchemeSpecificPart());
            System.out.println("authority :" +uri.getAuthority());
            System.out.println("user info "+ uri.getUserInfo());
            System.out.println("host " + uri.getHost());
            System.out.println("Port " + uri.getPort());
            System.out.println("path " + uri.getPath() );
            System.out.println("qurey " +uri.getQuery());
            System.out.println("fragment " + uri.getFragment());
            System.out.println("apsolute path :" + uri.getRawPath());


        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


    }

}
