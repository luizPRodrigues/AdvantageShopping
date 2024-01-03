
Feature: ADVS_002_Login
  As a customer
  I want to log in to the Advantage online shopping site
  to make purchases

Scenario: ADVS_002_Login
  Given I am on the homepage of the Advantage Shopping website
  And I click on the menu user
  And I enter my username
  And I enter my password
  When I click on login
  Then I validate that the login was successfully performed

