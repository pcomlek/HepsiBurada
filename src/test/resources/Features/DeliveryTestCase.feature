Feature: Control the delivery options

  Scenario: Control the delivery option and cart amount
    Given go to Hepsiburada.com login page_1
    When click on login button_1
    And click on login button_2
    And user enters username_1
    And click on login button_3
    And user enters password_1
    And click on login button_4
    And enter a product name on search bar_1
    And click on search buton_1
    And select first product_1
    And open a new tab_1
    Then add to cart_1
    And close the order page_1
    And go to cart_1
    And click the complete shop button