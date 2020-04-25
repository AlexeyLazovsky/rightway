Feature: sign in page tests

  Background:
    Given User navigates to "https://www.legion-qa.com/users/sign_in" page

  Scenario Outline: Negative sign in tests
    When User populates "<email>" in the email input box
    And User populates "<password>" in the password input box
    When User submits username and password
    Then Verify that sign in failed
    Examples:

      | email         | password |
      | abc@gmail.com | 12345    |
      | ^&&^&^%       | %$%$&^&  |
      | 62354124      | jbsfsbfa |

