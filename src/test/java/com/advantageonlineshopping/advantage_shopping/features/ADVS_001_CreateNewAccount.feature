
Feature: ADVS_001_CreateNewAccount
  As a prospective customer
  I want to create an account on the Advantage Shopping website
  In order to seamlessly browse and make online purchases

  Scenario Outline: ADVS_001_CreateNewAccount
    Given I am on the homepage of the Advantage Shopping website
    And I click on the menu user
    And I should find and click on the create new account option
    And I insert the user name
    And I insert the email adress "<email>"
    And I insert password
    And I insert confirmation of the password 
    And I insert the first name "<fName>"
    And I insert the last name "<lName>"
    And I insert my phone number "<phone>"
    And I select my country "<country>"
    And I insert my city "<city>"
    And I insert my address "<address>"
    And I insert my region "<region>"
    And I insert my postal code "<postalCode>"
    And I select use conditions privacy
    When I click on the register option
    Then the final message should be displayed as expected

    Examples: 
      | email         | fName | lName    | phone         | country | city      | address    | region | postalCode |
      | test@test.com | test  | register | 5511902837462 | Brazil  | Sao Paulo | Vila Maria | South  | 00000129   |
     
