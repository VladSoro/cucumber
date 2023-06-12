Feature: Main menu
  Background:
    Given I open wolt homepage and accept cookie
    And I click wolt banner


Scenario: Discovery page
    When I click 'Discovery' button
    Then I expect to see delivery page


Scenario: Restaurants page
    When I click 'Restaurants' button
    Then I expect to see Restaurants page

Scenario: Stores page
    When I click 'Stores' button
    Then I expect to see Stores page

