package marioTempMaker1.models.dto;

import com.google.gson.annotations.SerializedName;

public class WeatherDto {
    @SerializedName("main")
    private TempDto tempDto;

    @SerializedName("clouds")
    private CloudDto cloudDto;

    public CloudDto getCloudDto(){
        return cloudDto;
    }

    public TempDto getTempDto(){
        return tempDto;
    }


    public static class TempDto{
        private double temp;

        public double getTemp(){
            return temp;
        }

    }
    public static class CloudDto {

        @SerializedName("all")
        private double cloud;

        public double getCloud(){
            return cloud;
        }
    }
}
