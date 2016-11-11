Feature: I want to be told the sum of two numbers

  Scenario: Add two numbers
    Given I have entered 70 and 50 into the calculator
    When I press +
    Then result should be 120 on the screen