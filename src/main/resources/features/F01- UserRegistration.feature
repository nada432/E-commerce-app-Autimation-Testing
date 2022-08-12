Feature: User Registration
  I want to check that user can register in our e-commerce website
  Scenario Outline: User Registration
    Given The user in the homebage
    When user click on user registerlink
    And user enter "<fristname>","<lastname>","<email>","<password>"
    Then The restration page display successfully
    Examples:
      |fristname|lastname|email|password|
      |nada     |mohamed  |nada186@gmail.com|1234567|
      |nurhan   |mohamed  |nurhan@gmail.com |9876543|
      |hosame   |mohamed  |hossam18@gmail.com|3456789|