package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryStepsDef {

    InventoryPage inventoryPage = new InventoryPage();

    @Given("User navigates to Inventory {string} page")
    public void userNavigatesToInventoryPage(String url) {
        inventoryPage.navigateToPage(url);
    }


    @When("User clicks on the Year filter")
    public void userClicksOnTheYearFilter() {
        inventoryPage.clickYearFilter();
    }

    @When("User selects the 2015 filter")
    public void userSelectsTheYearFilter() {
        inventoryPage.selectYear2015();
    }

    @Then("Verify that only cars from 2015 are displayed")
    public void verifyThatOnlyCarsFrom2015AreDisplayed() {
        assertTrue(inventoryPage.areOnly2015CarsDisplayed());
    }

    @When("User clicks on the Body Type filter")
    public void userClicksOnTheBodyTypeFilter() {
        inventoryPage.clickBodyTypeFilter();
    }

    @When("User selects the Minivan filter")
    public void userSelectsTheMinivanFilter() {
        inventoryPage.selectMinivan();
    }

    @Then("Verify that only Minivans are displayed")
    public void verifyThatOnlyMinivansAreDisplayed() {
        assertTrue(inventoryPage.areOnlyMinivansDisplayed());
    }


    @And("User clicks on the Make filter")
    public void userClicksOnTheMakeFilter() {
        inventoryPage.clickMakeFilter();
    }


    @And("User selects the Dodge filter")
    public void userSelectsTheDodgeFilter() {
        inventoryPage.clickDodgeButton();
    }

    @Then("Verify that only Dodge are displayed")
    public void verifyThatOnlyDodgeAreDisplayed() {
        assertTrue(inventoryPage.areOnlyDodgeCarsDisplayed());
    }




}


