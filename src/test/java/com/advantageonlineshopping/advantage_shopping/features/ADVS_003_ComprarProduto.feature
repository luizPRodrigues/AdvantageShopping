
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

Scenario Outline: ADVS_003_PurchaseWith <method>
  And I search by a specific product "<product>"
  And I select to add to cart
  And I select menu cart
  And I select to checkout
  And I select to next
  And I choose the payment method "<paymentMethod>"
  And I set the Order Number
  Then I validate the final message with success "<msgFinal>"
  
Examples:
  |method       |product                  |paymentMethod|msgFinal                           |
  |SafePay      |HP ENVY X360 - 15T LAPTOP|SafePay      |Thank you for buying with Advantage|
  |MasterCredit |HP ENVY X360 - 15T LAPTOP|MasterCredit |Thank you for buying with Advantage|      
   
Scenario Outline: ADVS_004_SearchBuyOrder
  And I click on the menu user log in
  And search my purchased order by Order Number 
  Then I validate the final message with success "<msgFinal>"
  
Examples:
  |msgFinal                 |
  |HP ENVY x360 - 15t Laptop|  