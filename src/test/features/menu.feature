Feature: Menu test
  As a user
  On choosing a menu option I should get re-directed to appropriate product page

  Scenario Outline: validate menu re-direction

    Given I am on Home Page "http://next.co.uk"
    When I choose a menu option "<menu>"
    Then I should be on the appropriate product page with title as "<pageHeader>"

    Examples:

    |menu|pageHeader|
    |Men |The Men's Shop|
    |BOYS|The Boy's Shop|