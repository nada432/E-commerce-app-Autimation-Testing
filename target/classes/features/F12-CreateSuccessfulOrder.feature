Feature: Create successful order
  I want Create successful order
  Scenario : Create successful order
    Given User search for product
    When User add  product to shopping cart
    And User go to shopping cart page
    Then User enter data in billing payment
    When User choose shipping method
    And User choose payment method in payment method page
    Then User comfirm order




