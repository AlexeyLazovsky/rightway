package pages;



public class MainPage extends BasePage {

    public final static String LOGO = "//img[@title='LegionQA']";
    public final static String MAIN_PAGE_TITLE = "//h1[text() = 'LEGION IT SERVICES']";
    public final static String SIGN_IN_OPTION = "//a[contains(text(),'Sign In')]";


    public void navigateToMainPage(String url){
        driver.get(url);
    }

    public boolean isLogoDisplayed(){
       return isElementDisplayed(LOGO);
    }

    public boolean isMainPageTitleDisplayed(){
        return isElementDisplayed(MAIN_PAGE_TITLE);

    }

    public SignInPage clickSignIn(){
        clickElementByXpath(SIGN_IN_OPTION);
        return new SignInPage();
    }
}
