@Profile_1
Feature: User should able to see all status of his scorecard and generate pdf and Excel report
  Description: In order to ensure generate reports Functionality Feature works, I want to run the cucumber test to verify it is working

  Background:
    Given navigate to target url
    When user logs in as an admin in the target environment
    And user clicks submit button
    #Then Home page should be displayed

  #@Smoke
  Scenario: To test generate scorecard pdf and excel report works as expected
  	When Click on Menu > Profile 
  	Then verify status of all scorecard with KPI's
  	And Click on download button and click on pdf report
  	And Click on download button, and click on excel report