package pages;

public class RightwayHomePage extends RightwayAutoBasePage {

    public static final String ABOUT_US_LINK = "//*[@id=\"menu-main-menu\"]/li[6]/a";
    public static final String CONTACT_US_LINK = "//*[@id=\"menu-main-menu\"]/li[7]/a";

    public static final String INVENTORY_LINK = "//*[@id=\"menu-main-menu\"]/li[2]/a";
    public RightwayHomePage navigateToHomePage(String url) {
        driver.get(url);
        return this;
    }

    public void clickAboutUsLink() {
        clickElementByXpath(ABOUT_US_LINK);
    }

    public void clickContactUsLink() {
        clickElementByXpath(CONTACT_US_LINK);
    }

    public void clickInventoryLink(){
        clickElementByXpath(INVENTORY_LINK);
    }

    public boolean isAboutUsPageDisplayed() {

        String ABOUT_US_PAGE_INDICATOR = "//*[@id=\"post-364\"]/div/div/div/div[1]/div/div[2]/h1";
        return isElementDisplayed(ABOUT_US_PAGE_INDICATOR);
    }

    public boolean isContactUsPageDisplayed() {

        String CONTACT_US_PAGE_INDICATOR = "//*[@id=\"post-351\"]/div/div/div/div[1]/div/div[2]/h1";
        return isElementDisplayed(CONTACT_US_PAGE_INDICATOR);
    }
    public boolean isHomePageDisplayed() {

        String HOME_PAGE_INDICATOR = "//*[@id=\"post-49\"]/div/div/div/div[2]/div[1]/div/div/div/h2";
        return isElementDisplayed(HOME_PAGE_INDICATOR);
    }



}
