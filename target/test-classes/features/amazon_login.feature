@amazonLogin
Feature: as a user you should be able to log in to amazon with your valid credentials

  Background:
    Given User is on the login page

    Scenario: User is Entering PI to log into site
      When user enters userName
      And user enters password
      Then user clicks enter and should be logged in


        Scenario Outline: Logging into Amazon
          When User clicks "<window1>" on application
          And User clicks "<window2>" on application
          And User clicks "<enter>" on the application
          Then result "<result>" user should be logged in
          Examples:
          |window1|window2|result|
          |userName|passWord|enter|

