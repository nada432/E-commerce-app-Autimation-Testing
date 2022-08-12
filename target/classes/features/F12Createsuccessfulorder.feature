Feature: Create successful order
  I want Create successful order
  Scenario Outline: Create successful order
    Given User search for product
    When User add  product to shopping cart
    And User go to shopping cart page
    Then User enter data in billing payment "<firstname>", "<lastname>", "<email>" ,"<City>","<address>", "<zip-post>", "<phone-number>"
    When User choose shipping method
    And User choose payment method in payment method page
    Then User comfirm order
    Examples:
      |firstname||lastname| email| City|address |zip-post| phone-number|
