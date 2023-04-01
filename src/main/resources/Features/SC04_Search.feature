@Regression
Feature: verify search function

  Scenario: Logged User could search for any product

    And user enter name of product at search box
    And user click on search
    Then user could see the product displayed
    And user select first product
    And user check the price after discount
    And user check the price before discount
    And user add three item to cart
    And user can remove item from cart