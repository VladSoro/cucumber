Feature: Main menu
  Background:
    Given I open wolt homepage and accept cookie
    And I click wolt banner


  Scenario: Discovery button
    When I click 'Discovery' button
    Then I expect to see delivery page

