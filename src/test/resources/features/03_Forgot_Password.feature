@ForgotPassword
Feature: ForgotPassword
  Description: In order to ensure EPMS Admin page is loading properly on clicking EPMS Admin, I want to run the cucumber test to verify it is working

  Background: 
    Given navigate to target url

 #@Smoke
  Scenario: To verify forgot Password functionality working as expected.
    When click on forgot password
    Then Enter Username or Email
    When Click on Send ResetEmail
    Then Open MailTrap Url
    Then Click on Active mail and subject
    Then Click on Resetpassword link
    And Verify Reset password Window
    When Enter New Password and re-enter Password
    Then Click on reset Password button
    When user enters Username and Password
    And user clicks submit button
    Then Home page should be displayed
    And logout and close browser
  Scenario: To verify forgot Password reset functionality working as expected.
    Given navigate to target url
    When reset back to old password