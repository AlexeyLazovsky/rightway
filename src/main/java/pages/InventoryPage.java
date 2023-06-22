package pages;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class InventoryPage extends RightwayAutoBasePage {

    public static final String YEAR_FILTER_BUTTON = "(//button[contains(@class,'btn btn-link')])[3]";

    public static final String YEAR_2015_FILTER = "//input[@value='2015']/following-sibling::span[1]";
    public static final String CAR_LIST = "//*[@id=\"car-list\"]";
    public static final String CAR_YEAR = ".//span[@class='car-year']";

    public static final String BODY_TYPE_FILTER_BUTTON = "button.btn.btn-link:nth-of-type(3)";


    public static final String BODY_TYPE_MINIVAN_FILTER = "//input[@value='Minivan']/following-sibling::span[1]";

    public static final String MAKE_FILTER ="div#sidebars>div:nth-of-type(2)>div:nth-of-type(4)>div>button";

    public InventoryPage navigateToPage(String url) {
        driver.get(url);
        return this;
    }



    public void clickYearFilter() {
        clickElementByXpath(YEAR_FILTER_BUTTON);
    }


    public void selectYear2015() {
        clickElementByXpath(YEAR_2015_FILTER);
    }

    public boolean areOnly2015CarsDisplayed() {
        List<WebElement> displayedCars = driver.findElements(By.xpath( CAR_YEAR));
        return displayedCars.stream().allMatch(car -> car.getText().equals("2015"));
    }

    public void clickBodyTypeFilter() {
        driver.findElement(By.cssSelector("div#sidebars>div:nth-of-type(2)>div:nth-of-type(8)>div>button")).click();

    }



    public void selectMinivan() {
        clickElementByXpath(BODY_TYPE_MINIVAN_FILTER);
    }

    public boolean areOnlyMinivansDisplayed() {
        List<WebElement> displayedCars = driver.findElements(By.xpath(CAR_LIST));
        // Add a condition to check for 'Minivan' in the car's body type information
        return displayedCars.stream().allMatch(car -> car.getText().contains("Minivan"));
    }

    public boolean areOnlyDodgeCarsDisplayed() {
        List<WebElement> displayedCars = driver.findElements(By.xpath(CAR_LIST));
        // Add a condition to check for 'Dodge' in the car's make information
        return displayedCars.stream().allMatch(car -> car.getText().contains("Dodge"));
    }


    public void clickMakeFilter() {
        driver.findElement(By.xpath("//div[@id='sidebars']/div[2]/div[8]/div[1]/button[1]")).click();

    }

    public void clickDodgeButton(){
        driver.findElement(By.xpath("//input[@value='Dodge']/following-sibling::span[1]")).click();
    }





}
