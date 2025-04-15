package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UKBAReasonPage {
    WebDriver driver;
    By study = By.id("response-2");









    public UKBAReasonPage(WebDriver driver){
        this.driver = driver;

    }

    public void clickOnStudy(){

        driver.findElement(study).click();
    }
}
