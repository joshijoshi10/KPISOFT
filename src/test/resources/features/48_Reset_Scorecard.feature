@48_Reset_scorecard
Feature: Reset Scorecard Feature
  Description: In order to ensure Reset Scorecard Functionality Feature works, I want to run the cucumber test to verify it is working

  Background:
    Given navigate to target url
    When user logs in as an admin in the target environment
    And user clicks submit button
    Then Home page should be displayed
    And Navigate to HR tool box

  #@Smoke
  Scenario: To test Reset Scorecard works as expected
		Given Validate if it navigates to Create performance Program
    When Click on Create Program Button
    Then It should navigate to Create Performance Program Page
    And Program Details page should be loaded
    When Enter all manditory fields on Program detail page
    And Click on continue button on Program detail page
    Then Program configuration page should load
    When Enter all manditory field on Program configuration page
    And Click on Advance Setting an fill all the fields
    And Click on continue button on Program configuration page
    Then Program Scale page should load
    When Enter all field on Scale page
    And Click on continue button on Program configuration
    Then Save program button by clicking save button
    And to verify created Program
    
    When Click On Action more option and select Start from drop down
    Then Program Start Details page should be loaded
    When Select Include Everyone,Include Everyone Except,Include everyone in one by one
    And Click on Do not have employee codes link
    Then it should navigate to employee Employee Advanced Search
    When Verify all the field of filter
    And Start the performance program
    Then Validate and trigger review
		When Validate if create scorecard widget is listed under all I need to do 
		Then Employee verifies create KPI's
		
		When Click on createMyKpi button and create individual and Measurekpi
		Then Reset scorecard from Approve Scorecard to Scorecard Created
		And Verify for Create Scorecard Label