@49_Edit_Relationship
Feature: Edit Relationship Feature
  Description: In order to ensure Edit Relationship Functionality Feature works, I want to run the cucumber test to verify it is working

  Background:
    Given navigate to target url
    When user logs in as an admin in the target environment
    And user clicks submit button
    Then Home page should be displayed
    And Navigate to HR tool box

  #@Smoke
  Scenario: To test Edit Relationship works as expected
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
    And Click Employee for the created Program
    And Edit the supervisor and verifier for that User
    And Verify for supervisor and verifier is changed in User login
    #And verify for supervisor and verifier added in the Employee page
    #And Reset Supervisor and Verifier to the old