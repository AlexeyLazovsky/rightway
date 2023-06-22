@homepage_test
Feature: Rightway Auto home page navigation test

  Scenario: Navigate to the home page and verify the About Us link
    Given User navigates to "https://www.rightwayautosale.com/" home page
    When User clicks on About Us link
    Then Verify that user is on About Us page

  Scenario: Navigate to the home page and verify the Contact Us link
    Given User navigates to "https://www.rightwayautosale.com/" home page
    When User clicks on Contact Us link
    Then Verify that user is on Contact Us page


  Scenario: Navigate to the home page and verify the About Us link
    Given User navigates to "https://www.rightwayautosale.com/" home page
    When User clicks on About Us link
    Then Verify that user is on About Us page

  Scenario: Filter cars by year 2015
    Given User navigates to Inventory "https://www.rightwayautosale.com/inventory" page

    When User clicks on the Year filter
    And User selects the 2015 filter
    Then Verify that only cars from 2015 are displayed



  Scenario: Filter cars by year 2015 and body type Minivan
    Given User navigates to Inventory "https://www.rightwayautosale.com/inventory" page
    When User clicks on the Year filter
    And User selects the 2015 filter
    And User clicks on the Body Type filter
    And User selects the Minivan filter
    Then Verify that only cars from 2015 are displayed
    And Verify that only Minivans are displayed

  Scenario: Filter cars by year 2015 and body type Minivan
    Given User navigates to Inventory "https://www.rightwayautosale.com/inventory" page
    When User clicks on the Year filter
    And User selects the 2015 filter
    And User clicks on the Body Type filter
    And User selects the Minivan filter
    And User clicks on the Make filter
    And User selects the Dodge filter
    Then Verify that only cars from 2015 are displayed
    And Verify that only Minivans are displayed
    And Verify that only Dodge are displayed