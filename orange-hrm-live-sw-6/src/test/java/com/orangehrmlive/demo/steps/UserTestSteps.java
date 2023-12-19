package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.AddUserPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.ViewSystemUsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class UserTestSteps {
    @And("User click on Admin tab")
    public void userClickOnAdminTab() {
        new HomePage().clickOnAdminLink();
    }

    @Then("User should able to see the System Users text {string}")
    public void userShouldAbleToSeeTheSystemUsersText(String systemUsers) {
        Assert.assertEquals(new ViewSystemUsersPage().verifySystemUsersText(),
                systemUsers, "Error Message");
    }

    @And("User click on add button")
    public void userClickOnAddButton() {
        new AddUserPage().clickOnAddButton();
    }

    @Then("User should able to see the Add User text {string}")
    public void userShouldAbleToSeeTheAddUserText(String errorMessage) {
        Assert.assertEquals(new AddUserPage().verifyAddUserText(),
                errorMessage, "Incorrect error message displayed!");
    }

    @And("User select User Role as {string}")
    public void userSelectUserRoleAs(String admin) {
        new AddUserPage().mouseHoverOnUserRole();
        new AddUserPage().selectOnUserRoleDropDown();
    }

    @And("User enter Employee Name as {string}")
    public void userEnterEmployeeNameAs(String employeeName) {
        new AddUserPage().addEmployeeName(employeeName);
        new AddUserPage().employeeName();

    }

    @And("User enter UserName as {string}")
    public void userEnterUserNameAs(String userName) {
        new AddUserPage().enterUsername(userName);
    }

    @And("User select the status as {string}")
    public void userSelectTheStatusAs(String status) {
        new AddUserPage().dropDownSelectStatus();
        new AddUserPage().statusDropdownOnAddUserPage();
    }

    @And("User enter password {string}")
    public void userEnterPassword(String passWord) {
        new AddUserPage().enterPassword(passWord);
    }

    @And("User enter Confirm password {string}")
    public void userEnterConfirmPassword(String confirmPassWord) {
        new AddUserPage().enterPassword(confirmPassWord);
    }

    @And("User click on Save Button")
    public void userClickOnSaveButton() {
        new AddUserPage().clickOnSaveButton();
    }

    @Then("User should see the message {string}")
    public void userShouldSeeTheMessage(String successfullySaved) {
        Assert.assertEquals(new AddUserPage().getTextForSuccessfullyMessageAfterSavedAddedUser(),
                successfullySaved, "User not saved successfully");
    }

    @And("User enter username {string} in system users page")
    public void userEnterUsernameInSystemUsersPage(String testUser1) {
        new ViewSystemUsersPage().enterUsername(testUser1);
    }

    @And("User select User role as Admin in system users page")
    public void userSelectUserRoleAsAdminInSystemUsersPage() {
        new ViewSystemUsersPage().clickOnDropdownUserRoleButton();
        new ViewSystemUsersPage().mouseHoverAndClickOnAdminOptionInUserRoleDropDownInSystemUsers();
    }

    @And("User select status as disable in system users page")
    public void userSelectStatusAsDisableInSystemUsersPage() {
        new ViewSystemUsersPage().clickOnStatusDropDownButton();
        new ViewSystemUsersPage().mouseHoverAndCLickOndDisableStatusOptionInSystemUsers();
    }

    @And("User click on search button")
    public void userClickOnSearchButton() {
        new ViewSystemUsersPage().clickOnSearchButton();
    }

    @Then("User should able to see the user name {string} in result list")
    public void userShouldAbleToSeeTheUserNameInResultList(String expectedUserName) {
        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(),
                expectedUserName, "Incorrect message");
    }

    @And("User click on check box")
    public void userClickOnCheckBox() {
        new ViewSystemUsersPage().clickOnCheckBoxButton();
    }

    @And("User click on delete button")
    public void userClickOnDeleteButton() {
        new ViewSystemUsersPage().clickOnDeleteButton();
    }

    @Then("User see Popup display and User click on yes for popup display")
    public void userSeePopupDisplayAndUserClickOnYesForPopupDisplay() {
        new ViewSystemUsersPage().clickOnYesDeleteButton();
    }

    @And("User should able to verify the message {string}")
    public void userShouldAbleToVerifyTheMessage(String successfullyDeleted) {
        Assert.assertEquals(new AddUserPage().getTextForSuccessfullyMessageAfterDeletedAddedUser(),
                successfullyDeleted, "User not saved successfully");
    }

    @And("User enter user name {string} in system users page")
    public void userEnterUserNameInSystemUsersPage(String username) {
        new AddUserPage().enterUsername(username);
    }

    @And("User select user role {string} in system users page")
    public void userSelectUserRoleInSystemUsersPage(String userRole) {
        new AddUserPage().mouseHoverOnUserRole();
        new AddUserPage().selectOnUserRoleDropDown();
    }

    @And("User select employee name {string} in system users page")
    public void userSelectEmployeeNameInSystemUsersPage(String employeeName) {
        new AddUserPage().addEmployeeName(employeeName);
        new AddUserPage().employeeName();
    }

    @And("User select status {string} in system users page")
    public void userSelectStatusInSystemUsersPage(String status) {
        new AddUserPage().dropDownSelectStatus();
        new AddUserPage().statusDropdownOnAddUserPage();
    }

    @And("User should see the one record found {string} message")
    public void userShouldSeeTheOneRecordFoundMessage(String message) {
        Assert.assertEquals(new ViewSystemUsersPage().getOneRecordFoundMessage(),
                message, "Incorrect message displayed!");
    }

    @And("User should verify the username {string}")
    public void userShouldVerifyTheUsername(String username1) {
        Assert.assertEquals(new ViewSystemUsersPage().getDataFromUserNameInRecord(),
                username1, "Incorrect username displayed!");
    }

    @Then("User click on reset tab")
    public void userClickOnResetTab() {
        new ViewSystemUsersPage().clickOnResetButton();
    }
}