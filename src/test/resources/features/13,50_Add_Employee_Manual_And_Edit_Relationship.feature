@13-50_EditRelationshipEmployeePage
Feature: Add Employee and update supervisor,verifier feature
  Description : In order to ensure Edit_RelationshipEmployee Function is working, I want to run the cucumber test.

  Background:
    Given navigate to target url
  	When user logs in as an admin in the target environment
    And user clicks submit button
    Then Home page should be displayed
    And Navigate to HR tool box

  #@AddEmployee @Smoke
  Scenario: To verify Add Employee option is working as expected
    When click on EmployeesLink	
    And click on AddEmployee Button
    And enter all the mandatory details
    And click on Save Employee button
    Then verify added Employee
    And update the supervisor and verifier in the Employee page