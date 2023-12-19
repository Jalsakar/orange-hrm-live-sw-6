package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import dev.failsafe.internal.util.Assert;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//img[@alt='client brand banner']")
    WebElement orangeHrmLogo;
    @CacheLookup
    @FindBy(xpath = "(//img[@alt='orangehrm-logo'])[2]")
    WebElement orangeHrmLogo2;
    @CacheLookup
    @FindBy(xpath = "(//img[@alt='client brand banner'])[1]")
    WebElement orangeHrmLogo1;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement clickOnAdminLink;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='PIM']")
    WebElement clickOnPimLink;

    @CacheLookup
    @FindBy(xpath = "//b[contains(text(),'Leave')]")
    WebElement clickOnLeaveLink;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    WebElement clickOnDashboardLink;

    @CacheLookup
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement verifyWelcomePaul;

    @CacheLookup
    @FindBy(xpath = ("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"))
    WebElement userProfileLogo;

    public void clickOnUserProfileLogo() {
        mouseHoverToElementAndClick(userProfileLogo);
        log.info("click On User Profile Logo : " + userProfileLogo.toString());
    }


    public String orangeHrmLogo() {
        log.info("orange HRM Logo : " + orangeHrmLogo.toString());
        return getTextFromElement(orangeHrmLogo);

    }

    public void clickOnAdminLink() {
        clickOnElement(clickOnAdminLink);
        log.info("click On Admin Link : " + clickOnAdminLink.toString());
    }

    public void clickOnPimLink() {
        clickOnElement(clickOnPimLink);
        log.info("click On PIM Link : " + clickOnPimLink.toString());
    }

    public void clickOnLeaveLink() {
        clickOnElement(clickOnLeaveLink);
        log.info("click On Leave Link : " + clickOnLeaveLink.toString());
    }

    public void clickOnDashboardLink() {
        clickOnElement(clickOnDashboardLink);
        log.info("click On Dashboard Link : " + clickOnDashboardLink.toString());
    }

    public String verifyWelcomePaul() {
        log.info("verify Welcome Paul : " + verifyWelcomePaul.toString());
        return getTextFromElement(verifyWelcomePaul);
    }

    public void verifyOrangeHrmLogo() {
        boolean logoPresent = orangeHrmLogo.isDisplayed();
        Assert.isTrue(true, "Error", logoPresent);
        log.info("Get logo : " + orangeHrmLogo.toString());
    }
}
