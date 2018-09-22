Feature: Login Functionality
  This test is related to login test of Amazon account

  @tag1
  Scenario Outline: Test login functionality using valid username and password
    Given I am on login page
    When I entered valid "<username>" and "<password>"
    And Click on login button
    Then We get logged in
    
Examples:
|username|password|
|ghogare.nitin@gmail.com|lavab7!@#|
    

