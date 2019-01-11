package marioTemomaker1.controlers;

import marioTemomaker1.models.LoadWeatherServices;
import marioTemomaker1.views.MenuView;

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
        loadWeatherServices.loadWeatherFor(city);

    }
}
