@Task2 @android
  Feature: arithmetic operations
    Scenario: Addition 2 numbers decimal
      Given user is on login page
      When user input username "admin"
      When user input password "admin"
      When user click button login
      Then user successfully login
      When user on calculator page
      And user input "0.5" on field first value
      And user input "0.5" on field second value
      And user click drop down
      And choose arithmetic operations addition
      When user click button equal
      And user successfully addition numbers decimal
    Scenario: Subtraction 2 numbers
      Given user is on login page
      When user input username "admin"
      When user input password "admin"
      When user click button login
      Then user successfully login
      When user on calculator page
      And user input "9" on field first value
      And user input "5" on field second value
      And user click drop down
      And choose arithmetic operations subtraction
      When user click button equal
      And user successfully subtraction numbers

    Scenario: Multiplication 2 numbers
      Given user is on login page
      When user input username "admin"
      When user input password "admin"
      When user click button login
      Then user successfully login
      When user on calculator page
      And user input "5" on field first value
      And user input "5" on field second value
      And user click drop down
      And choose arithmetic operations multiplication
      When user click button equal
      And user successfully multiplication numbers

    Scenario: Division 2 numbers
      Given user is on login page
      When user input username "admin"
      When user input password "admin"
      When user click button login
      Then user successfully login
      When user on calculator page
      And user input "25" on field first value
      And user input "5" on field second value
      And user click drop down
      And choose arithmetic operations division
      When user click button equal
      And user successfully division numbers