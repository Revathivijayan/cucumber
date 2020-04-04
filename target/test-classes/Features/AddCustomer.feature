
Feature: Add Customer in demo site

  Scenario: Add Customer with hard coded detas 
    Given user launches demo telecom site
    And user click on add customer button
    When user  enters all the fields
    And user click on submit button
    Then user should be displayed customer ID is generated or not
    
    Scenario: Add Customer with hard coded detas 
    Given user launches demo telecom site
    And user click on add customer button
    When user  enters all the fields with one dimensional
    | sathya | vijayan | sathyajva625@gmail.com | chennai25 | 9455144256 |
    And user click on submit button
    Then user should be displayed customer ID is generated or not
    
    Scenario: Add Customer with hard coded detas 
    Given user launches demo telecom site
    And user click on add customer button
    When user  enters all the fields with one dimensional map
    | Fname   | sathya                |
    | Lname   | vijayan               |
    | Email   |sathyajva625@gmail.com | 
    | Address | chennai25             | 
    | Phno    | 9455144256            |
    And user click on submit button
    Then user should be displayed customer ID is generated or not