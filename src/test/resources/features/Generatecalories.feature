Feature: Generate calories feature

  Background:
    Given user goes to : "https://www.eatthismuch.com/"

  @generateCalories1
  Scenario: Verify user can generate 4 meals for given amount of calories
    And user enters 2500 calories
    Then user selects 4 meals
    And user clicks on generate
    Then verify 4 meals are generated


@generateCalories2
  Scenario: Verify user can generate 7 meals for given amount of calories
    And user enters 3500 calories
    Then user selects 7 meals
    And user clicks on generate
    Then verify 7 meals are generated



@generateCalories3
  Scenario: Verify user can generate 5 meals for given amount of calories for Vegan
Then user selects vegan category
And user enters 3500 calories
    Then user selects 7 meals
    And user clicks on generate
    Then verify 7 meals are generated
