package marioTempMaker1.views;

import marioTempMaker1.models.dto.WeatherDto;

import java.util.Scanner;

public class MenuView {
    private Scanner scanner;

    public MenuView(){
        scanner = new Scanner(System.in);
    }
    public String getCity(){
        printString("podaj nazwę miasta:");
        return scanner.nextLine();
    }

    private void printString(String s) {
        System.out.println(s);
    }
    
    public void printWeather(WeatherDto weatherDto){
        printString(weatherDto.getTempDto().getTemp()+"");
    }
}
