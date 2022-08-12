Feature: Add Different Products to Wishlist
  I want to add different products to wishlist
 Scenario Outline: Add Different Products to Wishlist
    Given User register to website
    And  User click on logout link
    Then User login to register account
    When User search for "<product1>"
    And  User click on add wishlist btn
    And Assert that first product added to wish list
    Then User search for second "<product2>"
    And User click on wishlist
    Then Assert that second product added to wishlist
Examples:
   |product1|product2|
 |Nokia Lumia 1020|First Prize Pies|