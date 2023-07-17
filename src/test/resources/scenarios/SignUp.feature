Feature: Order
  Background:
    Given I open wolt homepage and accept cookie


  Scenario: Sign up
    When I click 'Sign up' button
    Then I expect to see 'Create an account or log in' pop-up
    When I click 'Continue with email' button
    Then I input email
    When I click next button


