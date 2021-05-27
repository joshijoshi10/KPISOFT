#@OnlyFunctionality @Jenkins @ValidateUserFilledCheckInTemplate @SmokeTest @OnlyFunctionality
Feature: Program Managment feature
  Description: In order to ensure Create performance Program Functionality works, I want to run the cucumber test to verify it is working

  Background: 
    Given navigate to target url
    When user logs in as an admin in the target environment
    When user clicks submit button
    Then Home page should be displayed

#TC : 51,52,54,55
  Scenario: To verify create program functionality under Program Management creation working as expected.
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User should Click on Add Budget button
    And User should be able to populate budget name and type
    Then User should be able to click on Next button
    Given Period of Project User adds the Budget values
    And User clicks on Add button to add budget values
    Given the budget is added User clicks on Edit Icon for budget
    Then User Updates or modifies values and Clicks on Next
    And User Updates the Budget  values and Clicks on Update button
    
#TC : 53
  Scenario: To verify create program functionality under Program Management Deleting working as expected.
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to Click on Delete Icon and Delete program

 #TC : 56
  Scenario: To verify create program functionality under Program Management Deleting Budget as expected
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should Click on Add Budget button
    And User should be able to populate budget name and type
    Then User should be able to click on Next button
    Given Period of Project User adds the Budget values
    And User clicks on Add button to add budget values
    Then User Clicks on Delete Budget button

 #TC : 57 58 
  Scenario: To verify create program functionality under Program Management Creating Initaitive
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button
    And User Clicks on InitiativeCreated
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    Given User is on Edit Initiative page modify the values required
    Then user clicks on Update button for inititaitive modified

 #TC : 59
  Scenario: To verify create program functionality under Program Management Creating Initaitive and Deleting initiative 
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button
    And User Clicks on InitiativeCreated
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    Given User is on Edit Initiative page modify the values required
    Then user clicks on Update button for inititaitive modified
    And User should be able to Click on Delete Icon and Delete program

 #TC:63 64 65
  Scenario: To verify create program functionality under  Creating Milestone, Editing Milestone and Deleting_Milestone
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button
    And User Clicks on InitiativeCreated
    Given User has created initiative Click on Create MileStone button
    And User should be able to populate all the MileStone Details
    And User clicks on Next button
    Then User enters the MileStone values for respective period
    Then user Clicks on Create button
    Then User Updates or modifies MileStone values and Clicks on Next
    And User clicks on Next button
    Then user clicks on Update button for inititaitive modified
    Then User Clicks on Delete Budget button

 #TC :62
  Scenario: To verify create program functionality under Creating MileStone and adding MileStone and Deleting the same
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button
    And User Clicks on InitiativeCreated
    Given User has created initiative Click on Create MileStone button
    And User should be able to populate all the MileStone Details
    And User clicks on Next button
    Then User enters the MileStone values for respective period
    Then user Clicks on Create button
    Then User Clicks on Delete Budget button
  
  #TC : 60 61 66
  Scenario: To verify create program functionality under Creating Initaitive Budget and Updating the spent values.
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button
    And User Clicks on InitiativeCreated
    Then User should Click on Add Budget button
    And User should be able to populate budget name and type
    Then User should be able to click on Next button
    Given Period of Project User adds the Budget values
    And User clicks on Add button to add budget values
    Then User Clicks on plus button for budget added
    And Click on Edit Icon  to Update Budget Spent values
    Given Period of Project User adds the Budget values
    Then user clicks on Update button for inititaitive modified
    Then User Clicks on Confirm button in Confirmation POPUP
     
  #TC 68   
    Scenario: To verify create program functionality under Creating Initaitive and clicking the Publish
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button 
    And User clicks on Publish button
  
 #TC 67
  Scenario: To verify create program functionality under  Creating Initaitive and Adding the attachment and Posting the same:
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button
    And User Clicks on InitiativeCreated
    Given User has created initiative Click on Create MileStone button
    And User should be able to populate all the MileStone Details
    And User clicks on Next button
    Then User enters the MileStone values for respective period
    Then user Clicks on Create button
    Given User is able to see the Comments Icon and User sees a Post page
    Then User Adds a comment 
    And User chooses an attachment 
    Then User clicks on Post button
    
    
 #TC 58, 70, 71 
  Scenario: To verify create program functionality under  Creating Initaitive and adding MileStone and Completing the same :
    When User click on More Menu box
    And user clicks on Program Management under dropdown
    When User clicks on Create Program
    Then Create Program displays and User enters all the mandatory Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered
    Then user Clicks on Create button
    Then User should be able to see Created Program Management Page and Click on View Details
    And User should be able to see and Click on Edit Icon
    When User is on edit page click on Risks Tab
    Then User clicks on Add Risk button
    And User is populates all Mandatory details in Add Risk page
    Then user clicks on Add button
    Then User click on Issues TAb
    And User click on Add Issue button
    And User is populates all Mandatory details in Add Issue page
    Then user clicks on Add button
    When user should naviagte back to Program Details page
    Then User Click should Click on Add Initaitive button
    And All Initiative Details
    And User clicks on Next button
    Then User should be able to see and click on Add Owner button
    And User enters the employee and Selects the Employee entered!
    Then user Clicks on Create button
    And User Clicks on InitiativeCreated
    Given User has created initiative Click on Create MileStone button
    And User should be able to populate all the MileStone Details
    And User clicks on Next button
    Then User enters the MileStone values for respective period
    Then user Clicks on Create button
    Then User Updates or modifies MileStone values and Clicks on Next
    And User clicks on Next button
    Then user clicks on Update button for inititaitive modified
    
    
   #Tc 69  - start the milestone not automated due to no start button