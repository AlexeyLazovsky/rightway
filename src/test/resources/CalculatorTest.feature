@division_test
Feature: calculator addition tests

  Background: turn on calculator
    Given calculator app is up and running

  Scenario Outline: user tries to get result of two numbers addition
    Given calculator app is up and running
    When first number equals <firstNum>
    And second number equals <secondNum>
    Then the result should be equal <expectedResult>
    Examples:
      | firstNum | secondNum | expectedResult|
      | 2        | 3         | 5             |
      | 500      | 500       | 1000          |
      | -500     | 500       | 0             |
      | 500      | 0         | 500           |

  Scenario: user tries to get result of two numbers addition
    When first number equals 5
    And second number equals 5
    Then the result should be equal 10

  Scenario: user tries to get result of two numbers addition
    When first number equals -5
    And second number equals 5
    Then the result should be equal 0