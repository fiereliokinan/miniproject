Feature: Home
  As a user
  I want to go to web
  So that I can se all products

  Scenario: As a user I have to be able to get list products
    Given I am on main page
    When main page
    Then Show all products

#  Scenario: As a user I have to be able to login in saucedemo
#    Given I am on the login page
#    When I input valid username
#    And I input valid password
#    And click login button
#    Then I go to home page
#
#  Scenario: Failed login
#    Given I am on the login page
#    When I input protected username
#    And I input valid password
#    And click login button
#    Then error message "Epic sadface: Sorry, this user has been locked out."