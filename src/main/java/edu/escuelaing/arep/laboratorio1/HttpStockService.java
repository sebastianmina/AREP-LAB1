
package edu.escuelaing.arep.laboratorio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/** 
 * Clase extendida que se encarga de procesar la información que se consulta y extrae de las APIs.
 * @author Sebastián Mina
*/


public abstract class HttpStockService {

    private static final String USER_AGENT = "Mozilla/5.0";

    public String TimeSeriesDaily() throws IOException {

        String responseStr = "None";
        URL obj = new URL(getURL());
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        // The following invocation perform the connection implicitly before getting the
        // code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code : " + responseCode);

        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            responseStr = response.toString();
            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return responseStr;
    }

    abstract public String getURL();

    abstract public void setStock(String stock);

}
