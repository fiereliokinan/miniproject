Feature: Authentication
  As a user
  I want to login and regist account
  So i can access the website

  Scenario: As a user I want to login
    Given I am on the login page
    When I input valid username
    And I input valid password
    And click login button
    Then I go to home page

  Scenario: Failed login
    Given I am on the login page
    When I input invalid username
    And I input valid password
    And click login button
    Then error message "email or password is invalid"

    Scenario: Register account
      Given I am on the register page
      When I input valid nama lengkap
      And I input valid email
      And I input valid regis password
      And click register button
      Then I directed to login page
