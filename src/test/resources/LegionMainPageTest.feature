Feature: Legion QA main page tests

  Background:
    Given User navigates to 'https://www.legion-qa.com' page

  Scenario: Navigate to the main page and verify some components
    Then Verify that legion logo is displayed
    And Verify the title is visible

  Scenario: Navigate to the main page and click Sign In option
    When User clicks Sign In
    Then Verify that email box is displayed
    And Verify that password box is displayed