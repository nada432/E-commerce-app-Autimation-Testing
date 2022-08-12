Feature: Select different Categories
  I want to select different catagories
  Scenario:  Select different Categories
    Given User in homepage to click on register-link
    When User enter registration data
    And User logout from account
    Then User login to his account
    When User enter login data
    And user Select main categorise
    Then  user select sub categorise
