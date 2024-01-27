Feature: ADVS_005_ContactUs
  As a customer of the Advantage Shopping website
  I want to access the Contact Us option
  to get in touch with the relevant department


  Scenario Outline: ADVS_005_ContactUs
    Given I am on the homepage of the Advantage Shopping website
    When I select the Contact Us option
    And I choose a specific category from the available options "<category>"
    And I select a product related to my inquiry "<product>"
    And I input my email address
    And I provide a subject for my message
    And I click on the Send button
    Then I validate the final message "<msgFinal>" 

    Examples: 
      | category   | product                                           | msgFinal                                    |
      | Headphones | Beats Studio 2 Over-Ear Matte Black Headphones    | Thank you for contacting Advantage support. |
