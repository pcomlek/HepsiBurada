Feature: Add to cart a product with login

  Scenario: add to cart two same product from different seller with login
    Given go to Hepsiburada.com login page
    When click on login button1
    And click on login button2
    And user enters username
    And click on login button3
    And user enters password
    And click on login button4
    And enter a product name on search bar
    And click on search buton
    And select first product
    And open a new tab
    Then add to cart
    And close the order page
    And add to cart the product from different seller
    And go to cart