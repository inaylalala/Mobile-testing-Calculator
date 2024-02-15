@Task2 @android
Feature: list page
  Scenario: User long press list menu
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    And  user long press list menu

  Scenario: User click multiple times on list menu
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    And  user click multiple times on list menu


