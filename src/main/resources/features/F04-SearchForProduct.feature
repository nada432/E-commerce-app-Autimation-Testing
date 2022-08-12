Feature: search for product
  I want to search for product
  Scenario: search for product
    Given User click on registlink in homepage
    When user enter registration data
    And user logout from account
    And user click on loginlink
    Then User enter his data
    And user search for product
    Then User click in searchbtn

