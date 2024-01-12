
Feature: ADVS_003_ComprarProduto
  As a customer
  I want to log in to the Advantage online shopping site
  to make purchases
  
Background:  
  Given I am on the homepage of the Advantage Shopping website
  And I click on the menu user
  And I enter my username
  And I enter my password
  When I click on login

Scenario Outline: ADVS_003_ComprarProduto
  
  And I search by a specific product "<product>"
  And I select to add to cart
  And I select menu cart
  And I select to checkout
  And I select to next
  And I choose the payment method "<paymentMethod>"
  Then I validate the final message with success "<msgFinal>"
  
Examples:
  |product                  |paymentMethod|msgFinal                           |
  |HP ENVY X360 - 15T LAPTOP|SafePay      |Thank you for buying with Advantage|
  |HP ENVY X360 - 15T LAPTOP|MasterCredit |Thank you for buying with Advantage|      
  