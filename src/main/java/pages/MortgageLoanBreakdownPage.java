package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class MortgageLoanBreakdownPage {
    WebDriver driver;
    private By homeValue = By.id("homeval");
    private By downpayment = By.id("downpayment");
    private By intrstsrate = By.id("intrstsrate");
    private By loanterm = By.id("loanterm");
    private By startMonth = By.xpath("//select[@name='param[start_month]']");
//    private By startMonth = By.xpath("//select[@name='param[start_month]']");
    private By startYear = By.id("start_year");
    private By clickOnCal = By.xpath("//*[@value='Calculate']");
    private By propertyTax = By.id("pptytax");
    private By PMI = By.id("pmi");
    private By homeIns  = By.id("hoi");
    private By monthlyHOA = By.id("hoa");
    private By loanType = By.xpath("//select[@name='param[milserve]']");






    public MortgageLoanBreakdownPage(WebDriver driver){
        this.driver = driver;
    }
    public void setHomeValue(String hVal) {
        driver.findElement(homeValue).sendKeys(hVal);
        System.out.println(hVal);
    }
    public void setdownpayment(String dPment) {
        driver.findElement(downpayment).sendKeys(dPment);
        System.out.println(dPment);
    }
    public void setInterestRate(String intRt) {
        driver.findElement(intrstsrate).sendKeys(intRt);
        System.out.println(intRt);
    }
    public void setLoanTerm(String lTerm) {
        driver.findElement(loanterm).sendKeys(lTerm);
        System.out.println(lTerm);
    }
    public void setStartMonth(String sMonth) {
        Select month = new Select(driver.findElement(startMonth));
        month.selectByVisibleText(sMonth);
        System.out.println(sMonth);

    }
    public void setStartYear(String sYear) {
        driver.findElement(startYear).sendKeys(sYear);
        System.out.println(sYear);


    }
    public void clickOnCalculator() {
        driver.findElement(clickOnCal).click();


    }
 //   @Mortgage2
    public void enterPropertyTax(String ptTax) {
        driver.findElement(propertyTax).sendKeys(ptTax);
        System.out.println(ptTax);


    }
    public void enterPMI(String pMI) {
        driver.findElement(PMI).sendKeys(pMI);
        System.out.println(pMI);


    }
    public void enterHomeIns(String hIns) {
        driver.findElement(homeIns).sendKeys(hIns);
        System.out.println(hIns);


    }
    public void enterMonthlyHOA(String mHOA) {
        driver.findElement(monthlyHOA).sendKeys(mHOA);
        System.out.println(mHOA);


    }
    public void enterLoanType(String lType) {
//        driver.findElement(loanType).sendKeys(lType);
        Select loanTp = new Select(driver.findElement(loanType));
        loanTp.selectByVisibleText(lType);
        System.out.println(lType);


    }
    //@Mortgage3

    public void enterPropertyTax() {
        driver.findElement(propertyTax).sendKeys("2400");
//        System.out.println(ptTax);


    }
    public void enterPMI() {
        driver.findElement(PMI).sendKeys("0.5");
//        System.out.println(pMI);


    }
    public void enterHomeIns() {
        driver.findElement(homeIns).sendKeys("1000");
//        System.out.println(hIns);


    }
    public void enterMonthlyHOA() {
        driver.findElement(monthlyHOA).sendKeys("0");
//        System.out.println(mHOA);


    }
    public void enterLoanType() {
//        driver.findElement(loanType).sendKeys(lType);
        Select loanTp = new Select(driver.findElement(loanType));
        loanTp.selectByVisibleText("Conventional");
//        System.out.println(lType);


    }
}
