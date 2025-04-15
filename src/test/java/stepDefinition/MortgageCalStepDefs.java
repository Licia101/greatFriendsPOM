package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MortgageLoanBreakdownPage;
import pages.MortgageRepaymentPage;
import utilities.PropertyReaders;

import java.io.IOException;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static stepDefinition.Hook.driver;
public class MortgageCalStepDefs {
    MortgageLoanBreakdownPage mortgageLoanBreakdownPage = new MortgageLoanBreakdownPage(driver);
    MortgageRepaymentPage mortgageRepaymentPage = new MortgageRepaymentPage(driver);
    @Given("I am on the Mortgage calculator website")
    public void i_am_on_the_mortgage_calculator_website() throws IOException {
        // Write code here that turns the phrase above into concrete actions
 //      driver.get("https://www.mortgagecalculator.org/");
        PropertyReaders proptReaders = new PropertyReaders();
        driver.get(proptReaders.getMortgageCal_Url());

    }

    @When("I enter the following")
    public void i_enter_the_following(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        mortgageLoanBreakdownPage.setHomeValue(dataTable.get(1).get(1));
        mortgageLoanBreakdownPage.setdownpayment(dataTable.get(2).get(1));
        mortgageLoanBreakdownPage.setInterestRate(dataTable.get(3).get(1));
        mortgageLoanBreakdownPage.setLoanTerm(dataTable.get(4).get(1));
        mortgageLoanBreakdownPage.setStartMonth(dataTable.get(5).get(1));
        mortgageLoanBreakdownPage.setStartYear(dataTable.get(6).get(1));


    }

    @When("accept default value for all the remaining values")
    public void accept_default_value_for_all_the_remaining_values() {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("I click on calculate link")
    public void i_click_on_calculate_link() {
        // Write code here that turns the phrase above into concrete actions
        mortgageLoanBreakdownPage.clickOnCalculator();
    }
//@Mortgage2
    @Then("I should get mortgage offer with {string}, {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String tMPmt, String dPmt, String dPmtPer, String lPayOff, String tIntPay, String mTaxPaid) {
        // Write code here that turns the phrase above into concrete actions
       assertThat(mortgageRepaymentPage.getTotalMonthlyPmt(),is(equalTo(tMPmt)));
        System.out.println(tMPmt);
       assertThat(mortgageRepaymentPage.getDownPaymentAmount(),is(equalTo(dPmt)));
        System.out.println(dPmt);
       assertThat(mortgageRepaymentPage.getDownPaymentPercentage(),is(equalTo(dPmtPer)));
        System.out.println(dPmtPer);
       assertThat(mortgageRepaymentPage.getLoanPayoffDate(),is(equalTo(lPayOff)));
        System.out.println(lPayOff);
       assertThat(mortgageRepaymentPage.getTotalIntrestPaid(),is(equalTo(tIntPay)));
        System.out.println(tIntPay);
       assertThat(mortgageRepaymentPage.getMonthlyTaxPaid(),is(equalTo(mTaxPaid)));
        System.out.println(mTaxPaid);
    }

    @When("I enter the following data")
    public void i_enter_the_following_data(List<List<String>> dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        mortgageLoanBreakdownPage.enterPropertyTax(dataTable.get(1).get(1));
        mortgageLoanBreakdownPage.enterPMI(dataTable.get(2).get(1));
        mortgageLoanBreakdownPage.enterHomeIns(dataTable.get(3).get(1));
        mortgageLoanBreakdownPage.enterMonthlyHOA(dataTable.get(4).get(1));
        mortgageLoanBreakdownPage.enterLoanType(dataTable.get(5).get(1));

    }
    @Then("I should get mortgage offer with {string}, {string}, {string}, {string} and {string}")
    public void i_should_get_mortgage_offer_with_and(String tTPaid, String mHIns, String tHins, String aPmtAmt, String t360Pmt) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(mortgageRepaymentPage.getTotalTaxPaid(),is(equalTo(tTPaid)));
        System.out.println(tTPaid);
        assertThat(mortgageRepaymentPage.getMonthlyHomeInsurance(),is(equalTo(mHIns)));
        System.out.println(mHIns);
        assertThat(mortgageRepaymentPage.getTotalHomeInsurance(),is(equalTo(tHins)));
        System.out.println(tHins);
        assertThat(mortgageRepaymentPage.getAnnualPaymentAmount(),is(equalTo(aPmtAmt)));
        System.out.println(aPmtAmt);
        assertThat(mortgageRepaymentPage.getTotalof360Payments(),is(equalTo(t360Pmt)));
        System.out.println(t360Pmt);


    }
//Mortgage3
@When("I with the following data")
public void iWithTheFollowingData(List<String> dataTable){
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        mortgageLoanBreakdownPage.enterPropertyTax();
        mortgageLoanBreakdownPage.enterPMI();
        mortgageLoanBreakdownPage.enterHomeIns();
        mortgageLoanBreakdownPage.enterMonthlyHOA();
        mortgageLoanBreakdownPage.enterLoanType();

    }


}
