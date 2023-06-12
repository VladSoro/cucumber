Feature: Order
  Background:
    Given I open wolt homepage and accept cookie

  Scenario: Discovery page
    When I click Log in button
    Then I expect to see 'Create an account or log in' pop-up
    When I click 'Continue with Facebook' button
    Then switch window to facebook log in
    When I input my name and password
