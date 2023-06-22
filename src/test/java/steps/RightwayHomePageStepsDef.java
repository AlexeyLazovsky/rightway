package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.RightwayHomePage;

import static org.junit.jupiter.api.Assertions.*;

public class RightwayHomePageStepsDef {

    RightwayHomePage homePage;

    public RightwayHomePageStepsDef() {
        homePage = new RightwayHomePage();
    }

    @Given("User navigates to {string} home page")
    public void userNavigatesToHomePage(String url) {
        homePage.navigateToHomePage(url);
    }

    @When("User clicks on About Us link")
    public void userClicksOnAboutUsLink() {
        homePage.clickAboutUsLink();
    }

    @Then("Verify that user is on About Us page")
    public void verifyThatUserIsOnAboutUsPage() {
        assertTrue(homePage.isAboutUsPageDisplayed());
    }

    @When("User clicks on Contact Us link")
    public void userClicksOnContactUsLink() {
        homePage.clickContactUsLink();
    }

    @Then("Verify that user is on Contact Us page")
    public void verifyThatUserIsOnContactUsPage() {
        assertTrue(homePage.isContactUsPageDisplayed());
    }

    @Then("Verify that user is on home page")
    public void verifyThatUserIsOnHomePage() {
        assertTrue(homePage.isHomePageDisplayed());
    }
}
