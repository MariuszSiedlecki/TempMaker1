package marioTempMaker1.models.dto;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ForecastWeatherDto {
    @SerializedName("list")
    private List<WeatherDto>forecastWeatherDto;

    public List<WeatherDto> getForecastWeatherDto() {
        return forecastWeatherDto;
    }
}
