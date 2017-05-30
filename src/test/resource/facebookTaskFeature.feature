Feature: Facebook application testing

  Background: 
    Given the user logs into the facebook application

  Scenario: User should be logged out then sign out is clicked
    When the user clicks on the signout button
    Then the user should be logged out of the application

  Scenario: User should navigate to event homepage when clicked on event link
  	When the user clicks on the event link
  	Then the user should be navigated to the event homepage
  	
  Scenario: User should able to select the dynamic contents 
   When the user clicks on a dynamic contents
   Then the user should be navigated to the selcted event