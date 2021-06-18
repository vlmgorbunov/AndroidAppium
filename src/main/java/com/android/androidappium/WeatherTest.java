package com.android.androidappium;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import Page.Menu;
import Page.SearchElement;
import io.appium.java_client.android.AndroidDriver;

public class WeatherTest{

    @Test
    public void chooseLocationWeather() throws MalformedURLException, InterruptedException {
        Inspector inspector = new Inspector();
        AndroidDriver driver = inspector.getDriver("ru.rp5.rp5weatherhorizontal", "ru.rp5.rp5weatherhorizontal.screen.StartUp");
        SearchElement search = new SearchElement(driver);
        Menu menu = new Menu(driver);

        search.searchCity("Kazan");
        search.textView();
        search.sixDays();
        search.sixDaysInDetail();
        search.weatherNow();
        menu.Area();
        menu.Background();
        menu.setSolidColor();
        menu.Background();
        menu.UnitsOfMeasurement();
        menu.UnitsTemperature();
        menu.TemperaFahrenheit();
        menu.UnitsOfMeasurement();
        menu.Notifications();
        menu.showNotifications();

        driver.quit();
    }

}
