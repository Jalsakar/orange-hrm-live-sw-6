package com.orangehrmlive.demo.steps;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
    @When("User Enter Username {string}")
    public void userEnterUsername(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("User Enter password {string}")
    public void userEnterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("User click on login button")
    public void userClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @When("User login to Application successfully")
    public void userLoginToApplicationSuccessfully() {
        System.out.println("User able to login successfully");
    }

    @Then("User Should able to login successfully and verify the text {string}")
    public void userShouldAbleToLoginSuccessfullyAndVerifyTheText(String dashboard) {
        Assert.assertEquals(new DashboardPage().verifyDashboardText(),
                dashboard, "Incorrect message displayed!");
    }

    @When("User Should able to see the OrangeHRM logo")
    public void userShouldAbleToSeeThe() {
        new HomePage().verifyOrangeHrmLogo();
    }

    @And("User click on User Profile logo")
    public void userClickOnUserProfileLogo() {
        new HomePage().clickOnUserProfileLogo();
    }

    @And("User mouse hover and click on logout button")
    public void userMouseHoverAndClickOnLogoutButton() {
        new LoginPage().mouseHoverAndClickOnLogout();
    }

    @Then("User should navigate to the login page and verify the text {string}")
    public void userShouldNavigateToTheLoginPageAndVerifyTheText(String login) {
        Assert.assertEquals(new LoginPage().getTextForLoginPanel(),
                login, "Incorrect message displayed!");
    }

    @Then("User should get error message {string} depends on username {string} and password {string}")
    public void userShouldGetErrorMessageDependsOnUsernameAndPassword(String username, String password, String errorMessage) {
        new LoginPage().getErrorMessage(username, password, errorMessage);
    }

    @When("User enter Username1{string}")
    public void userEnterUsername1(String username) {
        new LoginPage().enterUserName(username);
    }

    @And("User enter password1{string}")
    public void userEnterPassword1(String password) {
        new LoginPage().enterPassword(password);
    }
}