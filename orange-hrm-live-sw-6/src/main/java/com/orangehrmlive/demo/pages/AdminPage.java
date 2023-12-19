package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends Utility {
    private static final Logger log = LogManager.getLogger(AdminPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//a[@id='menu_admin_UserManagement']")
    WebElement clickOnUserManagement;

    @CacheLookup
    @FindBy(xpath = "//a[@id='menu_admin_Job']")
    WebElement clickOnJob;

    @CacheLookup
    @FindBy(xpath = "//a[@id='menu_admin_Organization']")
    WebElement clickOnOrganizationLink;

    public void clickOnUserManagement() {
        clickOnElement(clickOnUserManagement);
        log.info("click On User Management : " + clickOnUserManagement.toString());
    }

    public void clickOnJob() {
        clickOnElement(clickOnJob);
        log.info("click On Job : " + clickOnJob.toString());
    }

    public void clickOnOrganizationLink() {
        clickOnElement(clickOnOrganizationLink);
        log.info("click On Organization Link : " + clickOnOrganizationLink.toString());
    }
}
