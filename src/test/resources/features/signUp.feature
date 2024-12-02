Feature: :sign up functionality


  Background:
    Given : user goes to : "https://workspace.google.com/intl/ru/gmail/"

  @signupSuccessfull
    Scenario: user signe up successfully
    And : user enters first name
    Then : user enters last name
    And : user enters his email
    Then : user enters password
    And : user clicks sign up button

  @signupSkipedLastname
    Scenario: user skiped his last name
    And : user enters first name
    Then : user enters his email
    And : user enters password
    Then : user clicks sign up button
    And :

  @signupWrongEmail
Scenario: user entered wrong email
    And : user enters first name
    Then : user enters last name
    And : user enters his  email wrong
    Then : user enters password
    And : user clicks sign up button