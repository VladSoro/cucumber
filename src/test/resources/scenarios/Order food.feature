Feature: Order
  Background:
    Given I open wolt homepage and accept cookie


  Scenario: Order new food
    When I click wolt banner
    Then I expect to see main page
    When I input 'Plovas' in search field
    And I select first restorant
    Then I expect to see restaurant menu
    When I click on the dish
    Then I expect to see order pop-op
    When I click 'Add order' button
    Then I expect to see shopping cart


  Scenario: Ordering a dish by type of cuisine
    When I click wolt banner
    Then I expect to see main page
    When I click 'Restaurants' button
    Then I expect to see Restaurants page
    When I click 'Sorted by Recommended' button
    And I click 'See all filters' button
    Then I expect to see 'Filter categories' pop-up
    When I click 'Pizza' button
    And I click 'Apply' button
    Then I expect see Restaurants near me with pizza


  Scenario: Ordering a dish by type of cuisine