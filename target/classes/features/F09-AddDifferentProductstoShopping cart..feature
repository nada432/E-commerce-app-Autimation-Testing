
Feature: Add Different Products to Shopping cart
  I want add Different Products to Shopping cart

  Scenario Outline: Add Different Products to Shopping cart
    Given User register
    And User click on logout link to logout
    When User login
    Then search for frist "<product1>"
    And Click on add cart
    And Assert that product one added
    When Search for "<product2>"
    Then Click on add cart
    When Click again on add cart in information page
    And Assert that second product added
    Examples:
    |product1|product2|
    |Samsung Series 9 NP900X4C Premium Ultrabook|Apple MacBook Pro 13-inch|







