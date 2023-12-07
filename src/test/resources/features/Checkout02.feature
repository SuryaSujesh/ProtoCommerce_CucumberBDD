Feature: Verify second checkout functionality

 Scenario: Validate the checkout button after adding all items
    Given user is on shop page
    When User clicks the Add button for all the product
    And User clicks the checkout button
    
   Scenario: Validate Remove button
   When User clicks the remove button for the first product
   Then User should successfully able to remove it
   
   Scenario: Validate final checkout button
   When User clicks the final checkout
   Then user navigates to purchase page