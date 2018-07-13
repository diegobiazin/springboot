package br.com.dbs.awesome.javaclient;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.apache.tomcat.util.codec.binary.Base64.encodeBase64;

public class JavaClientTest {
    public static void main(String[] args) {
        HttpURLConnection connection = null;
        BufferedReader reader = null;
        String user = "diego";
        String password = "123";

        try {
            URL url = new URL("http://localhost:8080/v1/protected/students");
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.addRequestProperty("Authorization", "Basic " + encodeUsernamePassWord(user, password));
            System.out.println(encodeUsernamePassWord(user, password));
            reader = new BufferedReader((new InputStreamReader(connection.getInputStream())));
            StringBuilder jsonSB = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                jsonSB.append(line);
            }
            System.out.println(jsonSB.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            IOUtils.closeQuietly(reader);
            if (connection != null)
                connection.disconnect();
        }
    }

    private static String encodeUsernamePassWord(String user, String password) {
        String userPassword = user + ":" + password;
        return new String(encodeBase64(userPassword.getBytes()));
    }
}
