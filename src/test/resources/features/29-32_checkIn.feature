@CheckInProgram @Jenkins @OnlyFunctionality
Feature: CheckIn Program Feature
  Description: In order to ensure Create Checkin Program Functionality works, I want to run the cucumber test to verify it is working

  Background: 
		Given navigate to target url
		When user logs in as an admin in the target environment
    When user clicks submit button
    Then Home page should be displayed

  #@CreateCheckInProgram @SmokeTest @OnlyFunctionality(29,30,31,32)
  Scenario: To verify create and atart CheckIn program functionality working as expected.
    When Navigate to HR tool box
    When Click on CheckIn menu link
    When Click on Add Checkin
    Then It should navigate to Create CheckIn Program Page
    Then Basic Information page should be loaded
    When Enter all field on Basic Information page
    Then Template page Should Load
    When Enter all field on Template page and click on save
    When Click on ellipsis of a checkIn Program
    Then click on Start button
    Then Choose Which employees you want to start program
    And Click on validate Start program
    When Login with user EMP12
    And Click on Thing to Do page
    Then Select the check-in program and click on it
    Then Fill all the value in check in Template
    Then Give the self star and click on check -in button
    Then Home page should be displayed    
    When Login with user EMP10
    Then Home page should be displayed
   	When Click on submited widget of check-in program
 		When Enter the feedback and click on publish button
    

   
