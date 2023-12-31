package pages;

import app.WebdriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public abstract class RightwayAutoBasePage {

    protected WebDriver driver = WebdriverSetup.getWebDriver();
    protected WebDriverWait wait = new WebDriverWait(driver, 5);

    public boolean isElementDisplayed(String xpath) {
        List<WebElement> webElementList = driver.findElements(By.xpath(xpath));
        return webElementList.size() > 0;
    }

    public void clickElementByXpath(String xpath) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public void clickElementByCSS(String css) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css)));
        driver.findElement(By.cssSelector(css)).click();
    }



}
