Feature: Sign in into the system
  As a guest
  I want to sign in into the system
  So that I could do booking

  Background: Guest goes to sign in page
    Given I open the application "Booking" on a smartphone
    And I click on button "Create account"


  Scenario: Successful sign in
    When I enter a new email address into "Email address" text field
    And I enter a password "123456" into "Password" text field
    And I click on sign in submit button "Create account"
    Then I see a pop up window with message to activate your account.

  Scenario: Email already exists in the system
    When I enter an existing in data base email address into "Email address" text field
    And I enter a password "123456" into "Password" text field
    And I click on sign in submit button "Create account"
    Then I see a pop up window with message to enter another email.
