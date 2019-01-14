package marioTempMaker1.controlers;

import marioTempMaker1.models.LoadWeatherServices;
import marioTempMaker1.models.dto.WeatherDto;
import marioTempMaker1.views.MenuView;

public class MainController {
    private MenuView menuView;
    private LoadWeatherServices loadWeatherServices;

    public MainController(){
        menuView = new MenuView();
        loadWeatherServices = new LoadWeatherServices();
    }
    public void startApp(){
        do{
            getWeather(menuView.getCity());

        }while(true);
    }
    private void getWeather(String city) {
        WeatherDto weatherDto = loadWeatherServices.loadWeatherFor(city);
        menuView.printWeather(weatherDto);
    }
}
