@45_ForceCloseByProgram
Feature: Force Close By Program feature
 Description: In order to ensure Force Close By Program Functionality Feature works, I want to use this template for my feature file

Background:
    Given navigate to target url
    When user logs in as an admin in the target environment
    And user clicks submit button
    Then Home page should be displayed
    And Navigate to HR tool box
    
  #@Smoke
  Scenario: To test Force Close By Program(Once) works as expected
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
		Then Supervisor verifies the Scorecard
		And Verifier verifies the scorecard
    And Employee publishes the scorecard
    And verifies for scorecard published label
    When program should be submit for review
    Then supervisor will approve review scorecard
    And force close by program
    And Verify for Scorecard published Label after force close
