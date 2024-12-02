Feature: verify user is able to login



  Background:
    Given : user is on login page
    When : user enters "<username>"
    And : user enters "<password>"
    Then : user clicks in login button

@loginPositive

Scenario Outline: user is successfully login with valid credentiaals
  Then  verify user redirected to the home page
  Examples:
    | username | password |
    | Klara    | pass865  |
    | Klara    | pass867  |
    | Siri     | pass541  |
    | Kiara    | pass123  |
    | Pavel    | pass125  |
    | Sophia   | pass741  |



  @loginNegative
  Scenario Outline:  user enters with invalid credentials
    Then  verify user fails to login
    Examples:

      | username    | invalidpass |
      | invaliduser | pass865     |
      | Klara       | pergerh     |
      | Siri        |             |
      | ewgwgw2313  | pass123 rth |
