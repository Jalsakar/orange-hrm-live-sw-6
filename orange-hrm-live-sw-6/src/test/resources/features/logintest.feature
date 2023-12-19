@Disha
Feature: Login Test Feature
  As a User
  I should be able to login successfully with valid credentials
  I should not be able to login with invalid credentials
  I should able to logout successfully
  I should see the logo on homepage

  Background: User is on Login page
  @Sanity @Smoke @Regression
  Scenario: Verify User Should Login SuccessFully
    When      User Enter Username "Admin"
    And       User Enter password "admin123"
    And       User click on login button
    And       User login to Application successfully
    Then      User Should able to login successfully and verify the text "Dashboard"
  @Smoke @Regression
  Scenario: Verify That The Logo Display On HomePage
    When      User Enter Username "Admin"
    And       User Enter password "admin123"
    And       User click on login button
    And       User login to Application successfully
    Then      User Should able to see the OrangeHRM logo
  @Regression
  Scenario: Verify User Should LogOut SuccessFully
    When      User Enter Username "Admin"
    And       User Enter password "admin123"
    And       User click on login button
    And       User login to Application successfully
    And       User click on User Profile logo
    And       User mouse hover and click on logout button
    Then      User should navigate to the login page and verify the text "Login"
  @Regression
  Scenario Outline: User should get error message with invalid credentials
    When    User enter Username1"<username>"
    And     User enter password1"<password>"
    And     User click on login button
    Then    User should get error message "<errorMessage>" depends on username "<username>" and password "<password>"
    Examples:
      | username          |  | password |  | errorMessage        |
      |                   |  |          |  | Required            |
      | test123@gmail.com |  |          |  | Required            |
      |                   |  | test123  |  | Required            |
      | test123@gmail.com |  | test123  |  | Invalid credentials |