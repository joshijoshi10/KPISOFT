@MeasureKPIOnce
Feature: Create and publish performance program with Measure KPI Once(For whole program duration)
  Description: In order to ensure Performance program - Measure KPI Once Functionality Feature works, I want to run the cucumber test to verify it is working

  Background:
    Given navigate to target url
    When user logs in as an admin in the target environment
    And user clicks submit button
    Then Home page should be displayed
    And Navigate to HR tool box

  #@MeasureKPIOnce @Smoke
  Scenario: To test create and publish performance program with Measure KPI Once(For whole program duration) works as expected
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
		Then Validate if create scorecard widget is listed under all I need to do 
		Then Employee verifies create KPI's

		When Click on createMyKpi-Once button and create individual and Measurekpi's
		Then Supervisor verifies the Scorecard
		And Verifier verifies the scorecard
    And Employee publishes the scorecard
    And verifies for scorecard published label
    #When Once (For whole program duration) program should be submit for review
    #Then supervisor will approve Once (For whole program duration) review scorecard
    #And verifier will approve Once (For whole program duration) review scorecard
    #And Employee will verify Once (For whole program duration) Scorecard published Label