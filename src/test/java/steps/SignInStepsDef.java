package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignInPage;
import static org.junit.jupiter.api.Assertions.*;

public class SignInStepsDef {

    SignInPage signInPage;

    public SignInStepsDef(){
        signInPage = new SignInPage();
    }


    @When("User populates {string} in the email input box")
    public void userPopulatesEmailInTheEmailInputBox(String txt) {
        signInPage.populateEmail(txt);
    }

    @And("User populates {string} in the password input box")
    public void userPopulatesPasswordInThePasswordInputBox(String txt) {
        signInPage.populatePassword(txt);

    }

    @Then("Verify that sign in failed")
    public void verifyThatSignInFailed() {
        assertTrue(signInPage.isEmailInputBoxDisplayed());
        assertTrue(signInPage.isPasswordInputBoxDisplayed());
    }

    @When("User submits username and password")
    public void userSubmitsUsernameAndPassword() {
        signInPage.clickSignInBtn();
    }
}
