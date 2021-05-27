@LoginTest
Feature: Login Functionality Feature
  Description: In order to ensure Login Function works, I want to run the cucumber test to verify it is working

  Background:
    Given navigate to target url

  @positiveScenario @Smoke
  Scenario: To test login function works as expected
  	When user logs in as an admin in the target environment
    And user clicks submit button
    Then Home page should be displayed
    And Navigate to HR tool box
    And admin logout and close browser
    