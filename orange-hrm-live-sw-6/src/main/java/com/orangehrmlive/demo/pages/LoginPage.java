package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameField;

    @CacheLookup
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = ("//button[normalize-space()='Login']"))
    WebElement loginButton;


    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Username : Admin']")
    WebElement verifyUsernameAdminText;

    @CacheLookup
    @FindBy(xpath = "//p[normalize-space()='Password : admin123']")
    WebElement verifyPasswordAdmin123Text;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    WebElement logout;
    @CacheLookup
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement verifyLoginPanel;
    @CacheLookup
    @FindBy(xpath = "//a[@id='welcome']")
    WebElement userProfileLogo;

    @CacheLookup
    @FindBy(xpath = ("(//img[@alt='orangehrm-logo'])[2]"))
    WebElement logoElement;
    @CacheLookup
    @FindBy(xpath = ("(//button[normalize-space()='Login'])[1]"))
    WebElement loginPanel;

    @CacheLookup
    @FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    WebElement errorMessage;

    public String getTextForLoginPanel() {
        log.info("Get Text For Login Panel : " + loginPanel.toString());
        return getTextFromElement(loginPanel);
    }

    public String getErrorMessage(String username, String password, String errorMessage) {
        log.info("Get Error Message : " + errorMessage.toString());
        return getTextFromElement(this.errorMessage);
    }

    public String getLogoElement() {
        log.info("Get Logo Element : " + logoElement.toString());
        return getTextFromElement(logoElement);
    }

    public void enterUserName(String username) {
        sendTextToElement(usernameField, username);
        log.info("Enter UserName : " + usernameField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("Enter password : " + passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("click On Login Button : " + loginButton.toString());
    }


    public void mouseHoverAndClickOnLogout() {
        mouseHoverToElement(logout);
        mouseHoverToElementAndClick(logout);
        log.info("click On Logout Button : " + logout.toString());
    }

    public String verifyUsernameAdminText() {
        log.info("Verify Username Admin Text : " + verifyUsernameAdminText.toString());
        return getTextFromElement(verifyUsernameAdminText);

    }

    public String verifyPasswordAdmin123Text() {
        log.info("Verify Password Admin123 Text : " + verifyPasswordAdmin123Text.toString());
        return getTextFromElement(verifyPasswordAdmin123Text);
    }

    public String verifyLoginPanel() {
        log.info("Verify Login Panel : " + verifyLoginPanel.toString());
        return getTextFromElement(verifyLoginPanel);
    }

    public void clickOnUserProfileLogo() {
        clickOnElement(userProfileLogo);
        log.info("click On User Profile Logo : " + userProfileLogo.toString());
    }
}
