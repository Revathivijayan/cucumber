
Feature: Add Customer in demo site

  Scenario: Add Customer with hard coded detas 
    Given user launches demo telecom site
    And user click on add customer button
    When user  enters all the fields
    And user click on submit button
    Then user should be displayed customer ID is generated or not