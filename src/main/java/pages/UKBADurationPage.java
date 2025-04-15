package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UKBADurationPage {
    WebDriver driver;
    By duration = By.id("response-1");









    public UKBADurationPage(WebDriver driver){
        this.driver = driver;

    }

    public void clickOnLongerThan6Months(){

        driver.findElement(duration).click();
    }
}
