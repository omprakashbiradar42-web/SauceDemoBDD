Feature: Test sauceDemo application

  Scenario: validate Login Funcationality
    Given user is on login page
    When user enter "standard_user" as userName and "secret_sauce" as password
    Then user click on login button
    
    Scenario: validate product add to cart funcationality
    
    When user click on filter icon
    Then select price range options
    And user click on first add to cart button
    Then user click on go to cart icon
    And user click on checkOut button
    
    Scenario: validate checkout information funcationality
    
    When user Enter "Rohit" as firstName  "Sharma" as lastName and "264264" as pincode
    Then user click on continue button
    
    Scenario: validate checkoutOverview
    
    When user click on finish button
    Then user clik on back to home button
    
