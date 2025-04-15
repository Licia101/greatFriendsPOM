package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.UKBAConfirmationPage;
import pages.UKBADurationPage;
import pages.UKBANationalityPage;
import pages.UKBAReasonPage;
import utilities.PropertyReaders;

import java.io.IOException;

import static stepDefinition.Hook.driver;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class UKBAStepDefs {
    UKBANationalityPage ukbaNationalityPage = new UKBANationalityPage(driver);
    UKBAReasonPage ukbaReasonPage = new UKBAReasonPage(driver);
    UKBADurationPage ukbaDurationPage = new UKBADurationPage(driver);
    UKBAConfirmationPage ukbaConfirmationPage = new UKBAConfirmationPage(driver);


    @Given("I am on the UKBA website")
    public void i_am_on_the_ukba_website() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        PropertyReaders proptReaders = new PropertyReaders();
        driver.get(proptReaders.getUKBA_Url());

    }
    @When("I choose {string} nationality")
    public void i_choose_nationality(String counName) {
        // Write code here that turns the phrase above into concrete actions
        ukbaNationalityPage.enterCountryName(counName);

    }
    @When("I press on Continue button")
    public void i_press_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        ukbaNationalityPage.clickOnContinueBtn();

    }
    @When("I select {string} as for coming to the Uk")
    public void i_select_as_for_coming_to_the_uk(String string) {
        // Write code here that turns the phrase above into concrete actions
        ukbaReasonPage.clickOnStudy();

    }
    @When("I choose option of Longer than {int} months")
    public void i_choose_option_of_longer_than_months(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        ukbaDurationPage.clickOnLongerThan6Months();

    }

    @Then("I should be informed that {string}")
    public void i_should_be_informed_that(String confMessage) {
        // Write code here that turns the phrase above into concrete actions
        assertThat(ukbaConfirmationPage.getConfirmation(),is(equalTo(confMessage)));


    }

}
