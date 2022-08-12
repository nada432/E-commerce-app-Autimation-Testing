Feature:Filter product with color
  I want select product and filter with color
  Scenario: Filter product with color
    Given User register in homepage of website
    When  User enter personal data to register
    And User logout
    Then User login in his account
    When user choose main categorise
    And User choose sub categorise
    Then User filter product with red color
