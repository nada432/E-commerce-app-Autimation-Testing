Feature: Add different products to compare list
  I want Add different products to compare list
  Scenario Outline: Add different products to compare list
  Given User click on  register link to register
    When  User logout from his register account
    Then User login in  his account in website
    When User search for first product "<product1>"
    And  User click on add compare list btn
    And Assert that first product added to compare list
    Then User search for second product "<product2>"
    And User click on add compare list
    Then Assert that second product added to compare list
    Examples:
    |product1|product2|

  |Flower Girl Bracelet|$100 Physical Gift Card|