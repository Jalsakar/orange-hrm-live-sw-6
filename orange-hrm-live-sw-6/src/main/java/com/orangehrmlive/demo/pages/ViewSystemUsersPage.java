package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ViewSystemUsersPage extends Utility {
    private static final Logger log = LogManager.getLogger(ViewSystemUsersPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//h5[normalize-space()='System Users']")
    WebElement verifySystemUsersText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    WebElement enterUsername;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
    WebElement clickOnDropdownUserRoleButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-select-text-input'][normalize-space()='Admin']")
    WebElement userRollDropdownButton;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement ananyaDash;

    @CacheLookup
    @FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    WebElement userName;

    @CacheLookup
    @FindBy(xpath = "//i[@class= 'oxd-icon bi-caret-down-fill oxd-select-text--arrow']")
    WebElement clickOnStatusDropDownButton;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Disabled']")
    WebElement disableStatusOptionInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Enable']")
    WebElement enableStatusOptionInSystemUsers;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Admin')]")
    WebElement adminOptionInUserRoleDropDownInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'ESS')]")
    WebElement ESSOptionInUserRoleDropDownInSystemUsers;

    @CacheLookup
    @FindBy(xpath = "//select[@id='searchSystemUser_status']")
    WebElement statusUserDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Search']")
    WebElement clickOnSearchButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    WebElement clickOnResetButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement clickOnAddButton;

    @CacheLookup
    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement clickOnDeleteButton;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Yes, Delete']" )
    WebElement clickOnYesDeleteButton;
    @CacheLookup
    @FindBy(xpath = "(//div[@data-v-6c07a142])[1]")
    WebElement userNameInRecord;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='(1) Record Found']")
    WebElement oneRecordFoundMessage;
    @CacheLookup
    @FindBy(xpath = "//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    WebElement checkBox;

    public void addEmployeeName(String name) {
        sendTextToElement(ananyaDash, name);
        log.info("add Employee name : " + ananyaDash.toString());
    }

    public void addUserName(String user) {
        sendTextToElement(userName, user);
        log.info("add UserName : " + userName.toString());
    }
    public String verifySystemUsersText() {
        log.info("verify System User Text : " + verifySystemUsersText.toString());
        return getTextFromElement(verifySystemUsersText);
    }

    public void enterUsername(String username) {
        sendTextToElement(enterUsername, username);
        log.info("Entering Username : " + enterUsername.toString());
    }
    public void clickOnDropdownUserRoleButton(){
        mouseHoverToElementAndClick(clickOnDropdownUserRoleButton);
        log.info("Clicking On Drop down User Role Button : " + clickOnDropdownUserRoleButton.toString());
    }
    public void selectSearchUserRole() {
        mouseHoverToElementAndClick(userRollDropdownButton);
        log.info("Clicking On select Search User Role : " + userRollDropdownButton.toString());
    }
    public void mouseHoverAndCLickOndDisableStatusOptionInSystemUsers() {
        mouseHoverToElementAndClick(disableStatusOptionInSystemUsers);
        log.info("Clicking on Disable option in Status drop-down : " + disableStatusOptionInSystemUsers.toString());
    }

    public void mouseHoverAndCLickOndEnableStatusOptionInSystemUsers() {
        mouseHoverToElementAndClick(enableStatusOptionInSystemUsers);
        log.info("Clicking on Enable option in Status drop-down : " + enableStatusOptionInSystemUsers.toString());
    }
    public void mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers() {
        log.info("Clicking on Admin option in UserRole drop-down : " + adminOptionInUserRoleDropDownInSystemUsers.toString());
        mouseHoverToElementAndClick(adminOptionInUserRoleDropDownInSystemUsers);
    }

    public void mouseHoverAndClickOnESSOptionInUserRoleDropDownInSystemUsers() {
        log.info("Clicking on ESS option in UserRole drop-down : " + ESSOptionInUserRoleDropDownInSystemUsers.toString());
        mouseHoverToElementAndClick(ESSOptionInUserRoleDropDownInSystemUsers);
    }

    public void clickOnStatusDropDownButton(){
        mouseHoverToElementAndClick(clickOnStatusDropDownButton);
        log.info("Clicking On status Dropdown Button: " + clickOnStatusDropDownButton.toString());
    }

    public void statusUserDropdown() {
        mouseHoverToElementAndClick(statusUserDropdown);
        log.info("Clicking On status User Dropdown : " + statusUserDropdown.toString());
    }

    public void clickOnSearchButton() {
        clickOnElement(clickOnSearchButton);
        log.info("Clicking On search Button : " + clickOnSearchButton.toString());
    }

    public void clickOnResetButton() {
        clickOnElement(clickOnResetButton);
        log.info("Clicking On reset Button : " + clickOnResetButton.toString());
    }

    public void clickOnAddButton() {
        clickOnElement(clickOnAddButton);
        log.info("Clicking On add Button : " + clickOnAddButton.toString());
    }
    public void clickOnDeleteButton() {
        clickOnElement(clickOnDeleteButton);
        log.info("Clicking On Delete Button : " + clickOnDeleteButton.toString());
    }
    public void clickOnCheckBoxButton() {
        clickOnElement(checkBox);
        log.info("Clicking on checkbox against User Name found : " + checkBox.toString());
    }
    public String getDataFromUserNameInRecord() {
        log.info("Getting UserName from record : " + userNameInRecord.toString());
        return getTextFromElement(userNameInRecord);
    }

    public void clickOnYesDeleteButton(){
        clickOnElement(clickOnYesDeleteButton);
    }
    public String getOneRecordFoundMessage () {
        log.info("Getting OneRecord Found message : " +oneRecordFoundMessage.toString());
        return getTextFromElement(oneRecordFoundMessage);
    }
}
