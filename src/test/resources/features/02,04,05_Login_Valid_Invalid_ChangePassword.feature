@02_04_05_Login_Valid_Invalid_ChangePassword  
Feature: To test login functionalities
    Description: In order to ensure Login,change password Functionality works, I want to run the cucumber test to verify it is working

  Background:
    Given navigate to target url
    
 #@Smoke
  Scenario: To test Login negitive,positive,change password Scenario Functionaly works as expected
  	When user enters invalid Username and Password
  	And user verifies error message
  	And user enters valid Username and Password
  	And User click submit button
    And user moves to settings
    And clicks on change password
    And enter the details
    And click on save password
    Then user verifies success message
    And logout
    When user enters valid Username and new Password
    And user clicks on submit button
    Then set back to default password
