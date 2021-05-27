@customerOnBoarding 
Feature: CustomerOnBoarding  feature
  Description: In order to ensure Customer On Boarding  Functionality works, I want to run the cucumber test to verify it is working

Background:
		Given navigate to target url
		When user logs in as an admin in the target environment
    And user clicks submit button
    #Then Home page should be displayed   
    And Navigate to HR tool box
    
@Smoke
Scenario: To test Customer on Boarding page open without breaking
    Given user click on customer on boarding
    #When user click on download
    #And check for file downloaded
    When user upload a COB file
    
#@uploadCOB
#Scenario: To test COB upload without breaking
    #When user upload a COB file
    
#@validateCOB 
#Scenario: To validate onboarded menu items
    #Given Check all the Onboarded menus are there or not