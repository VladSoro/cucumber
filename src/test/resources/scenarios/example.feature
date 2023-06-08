Feature: Wolt Home Page


  Scenario: Accept cookies
    Given I open wolt homepage
    When I see cookie banner
    Then I click 'Accept' button
    And I see Home page



  Scenario: Open main page
     Given I open wolt homepage and accept cookie
     When I click wolt banner
     Then I expect to see main page


  Scenario: checking registration and authorization buttons
    Given I open wolt homepage and accept cookie
    When I click Log in button
    Then I see 'Create an account or log in' pop-up
    When I close pop-up
    And I see Home page
    When I click 'Sign up' button
    Then I see 'Create an account or log in' pop-up


  Scenario: checking field 'choose a delivery` address'
    Given I open wolt homepage and accept cookie
    When I input my address
    Then I expect to see delivery page



