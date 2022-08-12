Feature: switch between currencies
  I want switch between currencies US-Euro
Scenario: switch between currencies
  Given user in homepage of website to click on register-link
  When User enter his data to register
  And user logout
  Then User login in account
  And User switch currency
