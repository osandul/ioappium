Feature: Sign in into the system
  As a guest
  I want to sign in into the system
  So that I could do booking

  Background: I as Guest go to Sign in page
    Given I click on button Create account

  Scenario: Successful sign in
    When I enter a new email address into Email address text field
    And I enter a valid password into Password text field
    And I click on sign in submit button Create account
    Then I see a pop up window with message to activate your account.

  Scenario: Email already exists in the system
    When I enter an existing in data base email address into Email address text field
    And I enter a valid password into Password text field
    And I click on sign in submit button Create account
    Then I see a pop up window with message to enter another email.

#  Scenario: Error message while inputting an invalid email
#      When I enter an invalid email address into Email address text field
#      And I enter a valid password into Password text field
#      Then I see message that Email address is invalid
#
#  Scenario: Red colour of the Email input field bottom border while inputting an invalid email
#    When I enter an invalid email address into Email address text field
#    And I enter a valid password into Password text field
#    Then The Email input field bottom border is red

