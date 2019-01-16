package marioTempMaker1.views;

import marioTempMaker1.models.dto.WeatherDto;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

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
    
    public void printWeather(Future<WeatherDto> weatherDto){
        while ( !weatherDto.isDone() ) {
            System.out.println("Pobieram pogodę:");
        }
        try {
            System.out.println((weatherDto.get().getTempDto().getTemp())-273.15 + " C ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
    public void printAvg(double avg){
        printString("średnia temp to : " + avg + " C ");
    }
}
