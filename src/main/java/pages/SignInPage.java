package pages;

import org.openqa.selenium.By;

public class SignInPage extends BasePage {

    public static final String EMAIL_INPUT = "//input[@placeholder = 'Email']";
    public static final String PASSWORD_INPUT = "//input[@placeholder = 'Password']";
    public static final String SIGN_IN_BTN = "//input[@value = 'Sign in']";


    public boolean isEmailInputBoxDisplayed(){
        return isElementDisplayed(EMAIL_INPUT);
    }
    public boolean isPasswordInputBoxDisplayed(){
        return isElementDisplayed(PASSWORD_INPUT);
    }

    public void populateEmail(String text){
        driver.findElement(By.xpath(EMAIL_INPUT)).sendKeys(text);
    }


    public void populatePassword(String text){
        driver.findElement(By.xpath(PASSWORD_INPUT)).sendKeys(text);
    }

    public void clickSignInBtn(){
        clickElementByXpath(SIGN_IN_BTN);
    }

}
