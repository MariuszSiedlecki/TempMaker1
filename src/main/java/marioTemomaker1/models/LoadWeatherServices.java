package marioTemomaker1.models;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoadWeatherServices {

    public void loadWeatherFor(String cityName){

    }
    private String readWebsite(String url){
        StringBuilder content = new StringBuilder();

            try {
                HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
                InputStream inputStream = http.getInputStream();

                int data;
                while ( (data = inputStream.read()) != -1 ) {
                    content.append((char) data);
                }
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content.toString();
        }
    }
