Feature: Generate calories feature
@generateCalories1
  Scenario: Verify user can generate 4 meals for given amount of calories
    Given user goes to : "https://www.eatthismuch.com/"
    And user enters 2500 calories
    Then user selects 4 meals
    And user clicks on generate
    Then verify 4 meals are generated


@generateCalories2
  Scenario: Verify user can generate 7 meals for given amount of calories
    Given user goes to : "https://www.eatthismuch.com/"
    And user enters 3500 calories
    Then user selects 7 meals
    And user clicks on generate
    Then verify 7 meals are generated
