Feature: all login scenarios

  @login
  Scenario: to test the functionality of login button for valid input
    Given login page is opened
  #  When I enter correct username and password
    When I enter "admin" and "admin123"
    And I click on login button
    Then I should reach to the home page
  @login
  Scenario: to test the functionality of login button for invalid input
    Given login page is opened
   # When I enter incorrect username and password
    When I enter "xyz" and "aaaabbb"
    And I click on login button
    Then I should get an error
  @login
  Scenario: to test the functionality of login button for blank input
    Given login page is opened
   # When I enter blank username and password
    When I enter "" and ""
    And I click on login button
    Then I should get another error

    @userReg
    Scenario: to test the functionality of submit button
      Given I am on user registration page
      When I enter below data
        | Amol | Ujagare | 244343 | amol@gmail.com |
      And I click on submit button
      Then the user should be added

      @subscription
  Scenario Outline: to test the functionality of subscribe button
    Given I am on subscription page
    When I enter <name> , <email> ,<phNo>
    And I click on subscribe button
    Then the user should be subscribed
        Examples:
          | name    | email             | phNo |
          | vanita  | vanita@email.com  | phNo |
          | nisha   | nisha@email.com   | phNo |
          | Jagruti | Jagruti@email.com | phNo |
          | Ankush  | Ankush@email.com  | phNo |
