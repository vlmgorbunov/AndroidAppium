package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;

public class SearchElement {
    public WebDriver driver;

    public SearchElement(WebDriver driver) {
        this.driver = driver;
    }

    public void searchCity(String city) {
        WebElement link = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.elementToBeClickable(MobileBy.id("android:id/search_src_text")));
        link.sendKeys(city);
    }

    public void textView() {
        WebElement linkview = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[contains(@text, 'Kazan')]")));
        linkview.click();
    }

    public void sixDays() {
        WebElement linkSixDays = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='6 days']")));
        linkSixDays.click();
    }

    public void sixDaysInDetail() {
        WebElement linkSixDaysinDetail = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='6 days in detail']")));
        linkSixDaysinDetail.click();
    }

    public void weatherNow() {
        WebElement linkNow = (WebElement) new WebDriverWait(driver, 15).until(
                ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.TextView[@text='Now']")));
        //     ExpectedConditions.presenceOfElementLocated(MobileBy.id("android:id/sixDayMoreInfo")));
        linkNow.click();
    }

}