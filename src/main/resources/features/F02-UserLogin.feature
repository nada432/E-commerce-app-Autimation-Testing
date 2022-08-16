@smoke
Feature: User Login
  I want check user can login after registration
  Scenario: User Login
    Given User in homepage to register
    When user enter data
    And user click on logout link
    Then User go back to homepage to login
    And user enter his data
    Then The account page display successfully


