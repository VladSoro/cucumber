Feature: Order
  Background:
    Given I open wolt homepage and accept cookie
    When I click wolt banner
    Then I expect to see main page


  Scenario: Order new food
    When I input 'Ugruzina by Azerai' in search field
    And I select first restorant
    Then I expect to see restaurant menu
    When I click on the dish
    Then I expect to see order pop-op
    When I click 'Add order' button
    Then I expect to see shopping cart


  Scenario: Ordering a dish by type of cuisine
    When I click 'Restaurants' button
    Then I expect to see Restaurants page
    When I click 'Sorted by Recommended' button
    And I click 'See all filters' button
    Then I expect to see 'Filter categories' pop-up
    When I click 'Pizza' button
    And I click 'Apply' button
    Then I expect see Restaurants near me with pizza


  Scenario: Ordering a dish by type of stores
      When I click 'Stores' button
      Then I expect to see Stores page
      When I click 'Sorted by Recommended' button
      Then I expect to see 'Filter' pop-up
      When I select 'Health & beauty'
      And I select 'Apply' button
      Then I expect see Stores near me pages
