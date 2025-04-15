package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UKBANationalityPage {
    WebDriver driver;
    By country = By.id("response");
    By continueButton = By.xpath("(//button[@type='submit'])[4]");








    public UKBANationalityPage(WebDriver driver){
        this.driver = driver;

    }
    public void enterCountryName(String counName){
        Select countryName = new Select(driver.findElement(country));
        countryName.selectByVisibleText(counName);
    }
    public void clickOnContinueBtn(){
        driver.findElement(continueButton).click();
    }
}
