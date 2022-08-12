Feature: Reset Password
I want reset password successfully
  Scenario: Reset password
 Given user in homepage to click on registerlink
    When enter user data
    And User logout from website
    And  click on loginlink
    Then user enter login data
    Then user click on myaccountlink
 When user click on changepasswordlink to reset password
    Then reset password sucessfully


