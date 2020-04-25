package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.SignInPage;

import static org.junit.jupiter.api.Assertions.*;

public class LegionWebStepsDefinition {

    private MainPage mainPage;
    private SignInPage signInPage;

    public LegionWebStepsDefinition(){
       mainPage = new MainPage();
    }


    @Given("User navigates to {string} page")
    public void userNavigatesToHttpsWwwLegionQaComPage(String url) {
        mainPage.navigateToMainPage(url);
    }

    @Then("Verify that legion logo is displayed")
    public void verifyThatLegionLogoIsDisplayed() {
        assertTrue(mainPage.isLogoDisplayed());
    }

    @And("Verify the title is visible")
    public void verifyTheTitleIsVisible() {
        assertTrue(mainPage.isMainPageTitleDisplayed());

    }

    @When("User clicks Sign In")
    public void userClicksSignIn() {
       signInPage = mainPage.clickSignIn();
    }

    @Then("Verify that email box is displayed")
    public void verifyThatEmailBoxIsDisplayed() {
        assertTrue(signInPage.isEmailInputBoxDisplayed());
    }

    @And("Verify that password box is displayed")
    public void verifyThatPasswordBoxIsDisplayed() {
        assertTrue(signInPage.isPasswordInputBoxDisplayed());

    }

}
