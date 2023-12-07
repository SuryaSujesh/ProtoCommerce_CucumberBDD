Feature: Verify checkout functionality

  Scenario: Validate the checkout
    Given user is on shop page
    When user clicks on checkout button
    Then user should navigate to next checkout page
    
   Scenario: Validate continue shopping button
   When User clicks the continue shopping button
   Then User should successfully able to navigate to shop page

 