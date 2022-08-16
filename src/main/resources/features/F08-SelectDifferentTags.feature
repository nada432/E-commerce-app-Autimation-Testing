@smoke
Feature: select different tags
  I want select different tags of products
  Scenario: select different tags
    Given user register
    When User logout from register account
    And user login in account
    Then User search about product
    And select different tags
