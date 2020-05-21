import java.net.*;
import java.io.*;
import java.nio.charset.Charset;

public class URLReader {
    public static void main(String[] args) throws Exception {

        URL fajizhiCA = new URL("https://www.fajizhi.ca");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(fajizhiCA.openStream()));

        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            if (inputLine.contains("img")) {
            System.out.println(inputLine);};
        }
        in.close();

    }
}

