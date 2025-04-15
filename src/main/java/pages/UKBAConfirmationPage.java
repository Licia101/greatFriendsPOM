package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UKBAConfirmationPage {
    WebDriver driver;
    By confirmationMessage = By.xpath("//h2[contains(text(),'You’ll need a visa to study in the UK')]");









    public UKBAConfirmationPage(WebDriver driver){
        this.driver = driver;

    }

    public String getConfirmation(){
        return driver.findElement(confirmationMessage).getText();
    }
}
