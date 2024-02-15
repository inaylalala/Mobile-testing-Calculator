@Taks1 @android
Feature:Addition number
  Scenario: addition
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user on calculator page
    And user input "1" on field first value
    And user input "2" on field second value
    And user click drop down
    And choose arithmetic operations addition
    When user click button equal
    And user successfully addition