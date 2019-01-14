package marioTempMaker1.models;

import com.google.gson.Gson;
import marioTempMaker1.models.dto.WeatherDto;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoadWeatherServices {
    private Gson gson;
    public LoadWeatherServices(){
        gson = new Gson();
    }

    public WeatherDto loadWeatherFor(String cityName){
        WeatherDto weatherDto = convertJsonToWeather(readWebsite("https://api.openweathermap.org/data/2.5/weather?q="
                + cityName
                + "&appid="
                + Config.API_KEY));
        return weatherDto;
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
        private WeatherDto convertJsonToWeather(String json){
        return gson.fromJson(json,WeatherDto.class);
        }
    }
