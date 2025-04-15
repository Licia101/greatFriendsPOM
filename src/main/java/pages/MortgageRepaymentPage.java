package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MortgageRepaymentPage {
    WebDriver driver;
    private By totalMonthlyPmt = By.xpath("(//div[@class='repayment-block']/div/div/h3)[1]");
    private By downPaymentAmount = By.xpath("(//div[@class='repayment-block']/div/div/h3)[3]");
    private By downPaymentPercentage = By.xpath("(//div[@class='repayment-block']/div/div/h3)[4]");
    private By loanPayoffDate = By.xpath("(//div[@class='repayment-block']/div/div/h3)[5]");
    private By totalIntrestPaid = By.xpath("(//div[@class='repayment-block']/div/div/h3)[6]");
    private By monthlyTaxPaid = By.xpath("(//div[@class='repayment-block']/div/div/h3)[7]");
    private By totalTaxPaid = By.xpath("(//div[@class='repayment-block']/div/div/h3)[8]");

    private By monthlyHomeInsurance = By.xpath("(//div[@class='repayment-block']/div/div/h3)[9]");

    private By totalHomeInsurance = By.xpath("(//div[@class='repayment-block']/div/div/h3)[10]");

    private By annualPaymentAmount = By.xpath("(//div[@class='repayment-block']/div/div/h3)[11]");

    private By totalof360Payments = By.xpath("(//div[@class='repayment-block']/div/div/h3)[12]");



    public MortgageRepaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getTotalMonthlyPmt() {
        return driver.findElement(totalMonthlyPmt).getText();

    }

    public String getDownPaymentAmount() {
        return driver.findElement(downPaymentAmount).getText();

    }

    public String getDownPaymentPercentage() {
        return driver.findElement(downPaymentPercentage).getText();

    }

    public String getLoanPayoffDate() {
        return driver.findElement(loanPayoffDate).getText();

    }
    public String getTotalIntrestPaid() {
        return driver.findElement(totalIntrestPaid).getText();

    }
    public String getMonthlyTaxPaid() {
        return driver.findElement(monthlyTaxPaid).getText();

    }
    public String getTotalTaxPaid() {
        return driver.findElement(totalTaxPaid).getText();

    }
    public String getMonthlyHomeInsurance() {
        return driver.findElement(monthlyHomeInsurance).getText();

    }
    public String getTotalHomeInsurance() {
        return driver.findElement(totalHomeInsurance).getText();

    }
    public String getAnnualPaymentAmount() {
        return driver.findElement(annualPaymentAmount).getText();

    }
    public String getTotalof360Payments() {
        return driver.findElement(totalof360Payments).getText();

    }

    }
