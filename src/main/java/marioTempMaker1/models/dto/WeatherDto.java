package marioTempMaker1.models.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDto {
    @SerializedName("main")
    private TempDto tempDto;

    public TempDto getTempDto(){
        return tempDto;
    }


    public static class TempDto{
        private double temp;

        public double getTemp(){
            return temp;
        }

    }
}
