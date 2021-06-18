package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileBy;

public class Menu {
    public WebDriver driver;
    public Menu(WebDriver driver) {
        this.driver = driver;
    }

    public void Area() {
        WebElement linkMenu = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.id("ru.rp5.rp5weatherhorizontal:id/rp5Area")));
        linkMenu.click();
    }

   public void Location() {
        WebElement linkMenuLocation = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Location']")));
        linkMenuLocation.click();
    }

    public void Background() {
        WebElement linkMenuBackground = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Background']")));
        linkMenuBackground.click();
    }

        public void Language() {
            WebElement linkMenuLanguage = (WebElement) new WebDriverWait(driver, 15).until(
                    ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Language']")));
            linkMenuLanguage.click();
    }

    public void setRussianLanguage() {
        WebElement linkSetRussianLanguage = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.RadioButton[@text='Русский']")));
        linkSetRussianLanguage.click();
    }

    public void UnitsOfMeasurement() {
        WebElement linkUnitsOfMeasurement = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Units of measurement']")));
        linkUnitsOfMeasurement.click();
    }

    public void UnitsTemperature() {
        WebElement linkUnitsTemperature = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Temperature']")));
        linkUnitsTemperature.click();
    }

    public void TemperaFahrenheit() {
        WebElement linkahrenheit = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.RadioButton[@text='°F']")));
        linkahrenheit.click();
    }

    public void TemperatureCancel() {
        WebElement linkTemperatureCancel = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Button[@text='Cancel']")));
        linkTemperatureCancel.click();
    }

    public void Notifications() {
        WebElement linkNotifications = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Notifications']")));
        linkNotifications.click();
    }

    public void showNotifications() {
            WebElement linkShowNotifications = (WebElement) new WebDriverWait(driver, 15).until(
                    ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Show notifications']")));
        linkShowNotifications.click();
    }

    public void ContactUs() {
        WebElement linkContactUs = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Contact']")));
        linkContactUs.click();
    }

    public void About() {
        WebElement linkAbout = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='About']")));
        linkAbout.click();
    }

    public void GoToFullSize() {
        WebElement linkGotToFullSize = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Go to']")));
        linkGotToFullSize.click();
    }

    public void checkboxClick() {
        WebElement linkCheckbox= (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.id("ru.rp5.rp5weatherhorizontal:id/standard_check_box")));
        linkCheckbox.click();
    }

    public void chososeFromGallery() {
        WebElement linkchooseFromGallery = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.id("ru.rp5.rp5weatherhorizontal:id/choose_from_gallery")));
        linkchooseFromGallery.click();
    }

    public void setSolidColor() {
        WebElement linkSetSolidColor = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.id("ru.rp5.rp5weatherhorizontal:id/buttonLightBlue")));
        linkSetSolidColor.click();
    }
}

