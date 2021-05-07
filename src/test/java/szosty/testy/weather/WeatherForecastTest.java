package szosty.testy.weather;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class WeatherForecastTest {

    @Test
    public void testCalculateForecastWithMock() {
        //given
        Temperatures temperaturesMock = mock(Temperatures.class);
        HashMap<Integer, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put(0,25.5);
        temperaturesMap.put(1, 26.4);
        temperaturesMap.put(2, 24.8);
        temperaturesMap.put(3, 25.2);
        temperaturesMap.put(4, 26.1);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //when
        int numberOfSensors = weatherForecast.calculateForecast().size();
        //then
        Assert.assertEquals(5, numberOfSensors);

    }

}