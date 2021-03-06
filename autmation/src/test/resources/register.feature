Feature: User registration
  As a customer
  I can register
  So I can use services

  Background: Setup data for all my tests (DataTable)
    Given I have all these users
      | username | name             | age |
      | "danp"   | "Dan Pickles"    |  45 |
      | "howiej" | "Howard Johnson" |  55 |

  Scenario Outline: Repeat steps for each Example
    Given I am <old> years old
    And my name is <myname>
    And I want <user> as my username
    When I press the Register button
    Then I will be registered

    Examples: 
      | old | myname           | user     |
      |  33 | "Randolph Scott" | "randys" |
      |  21 | "Howie Mandell"  | "howiem" |

  Scenario: Already exists
    Given I want "danp" as my username
    When I press the Register button
    Then I will get an error to choose new username