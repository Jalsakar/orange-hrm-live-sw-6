#@Disha
Feature: User Test Feature
  As a user,
  I should be able to add user successfully
  I should be able to verify the added user successfully
  I should be able to delete the added user successfully
  I should be able to search for the user and it should be unique user

  Background: User is on Login page
    When      User Enter Username "Admin"
    And       User Enter password "admin123"
    And       User click on login button

#@Sanity @Smoke @Regression
  Scenario: Admin Should Add New User SuccessFully
    When      User login to Application successfully
    And       User click on Admin tab
    Then      User should able to see the System Users text "System Users"
    And       User click on add button
    Then      User should able to see the Add User text "Add User"
    And       User select User Role as "Admin"
    And       User enter Employee Name as "Lisa  Andrews"
    And       User enter UserName as "TestUser2"
    And       User select the status as "Disable"
    And       User enter password "Asha123"
    And       User enter Confirm password "Asha123"
    And       User click on Save Button
    Then      User should see the message "successfully Saved"

#@Smoke @Regression
  Scenario: Admin Should Search the User SuccessFully And Verify it
    When    User login to Application successfully
    And     User click on Admin tab
    Then    User should able to see the System Users text "System Users"
    And     User enter username "krishna1203" in system users page
    And     User select User role as Admin in system users page
    And     User select status as disable in system users page
    And     User click on search button
    Then    User should able to see the user name "krishna1203" in result list

  #@Regression
  Scenario: User should verify that Admin should delete the User successfully
    When      User login to Application successfully
    And       User click on Admin tab
    Then      User should able to see the System Users text "System Users"
    And       User enter username "krishna1203" in system users page
    And       User select User role as Admin in system users page
    And       User select status as disable in system users page
    And       User click on search button
    Then      User should able to see the user name "krishna1203" in result list
    And       User click on check box
    And       User click on delete button
    Then      User see Popup display and User click on yes for popup display
    And       User should able to verify the message "Successfully Deleted"
#@Regression
  Scenario Outline: Admin should search the user and verify the message record found
    When      User login to Application successfully
    And       User click on Admin tab
    Then      User should able to see the System Users text "System Users"
    And       User enter user name "<username>" in system users page
    And       User select user role "<userRole>" in system users page
    And       User select employee name "<employeeName>" in system users page
    And       User select status "<Status>" in system users page
    And       User click on search button
    And       User should see the one record found "(1) Record Found" message
    And       User should verify the username "<username>"
    Then      User click on reset tab

    Examples:

      | username     | userRole | employeeName  | Status |
      | Admin        | Admin    | Paul Collings | Enable |
      | Cassidy.Hope | ESS      | Cassidy Hope  | Enable |
      | Nina.Patel   | ESS      | Nina Patel    | Enable |
      | Odis.Adalwin | Admin    | Odis Adalwin  | Enable |