Feature: google search functionality
@search1
  Scenario:  verify user can search products in english
    Given : user is on google page
    When  : user enters "rome" in the search bar
    And : user clicks search button
    Then : verify results contain "rome"
@search2
Scenario Outline: verify user can search products in english
  Given : user is on google page
  When  : user enters "<product>" in the search bar
  And : user clicks search button
  Then : verify results contain "<product>"
Examples:
  | product    |
  | apple      |
  | banana     |
  | washington |
  | island     |