Feature: Order
  As a user
  I want to see product details
  So that i can order

  Scenario: See details of product
    Given I am on homepage
    When i click details button
    Then Direct to detail product page

  Scenario: Order with login
    Given  Iam on login page
    When I input valid username
    And I input valid password
    And click login button
    And I go to home page
    And I click beli
    And I click cart
    And I click bayar
    Then Directed to transaction page

