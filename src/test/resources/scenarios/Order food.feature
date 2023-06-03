Feature: Order

  Scenario: Order new food
    Given I open wolt homepage and accept cookie
    When I click wolt banner
    Then I expect to see main page
    When I input 'Plovas' in search field
    And I select first restorant
    Then I expect to see restaurant menu
    When I click on the dish
    Then I expect to see order pop-op
    When I click 'Add order' button
    Then I expect to see shopping cart