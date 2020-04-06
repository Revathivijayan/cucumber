Feature: Add Customer in demo site
  @sanity1
  Scenario: Add Customer with hard coded datas
    And User click on add customer button
    When User enters all the fields
    And User click on submit button
    Then User should be displayed customer ID is generated or not 
 @smoke1 @sathya
  Scenario: One Dim List 
    And User click on add customer button
    When User enters all the fields with one dimensional
      | sathya | vijayan | sathyajav3@gmail.com | aranthangi | 965321456 |
    And User click on submit button
    Then User should be displayed customer ID is generated or not
 @sathya
  Scenario: 
    And User click on add customer button
    When User enters all the fields with one dimensional map
      | Fname   | sathya                |
      | Lname   | vijayan               |
      | Email   | sathyajav3@gmail.com  |
      | Address | aranthangi            |
      | phno    | 965321456      |
    And User click on submit button
    Then User should be displayed customer ID is generated or not
