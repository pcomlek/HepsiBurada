Feature: Add to cart a product without login

  Scenario: Add to cart a product from music,book and film category without login
    Given Go to Hepsiburada.com homepage
    When click to music, film category
    And click to uzaktan kumandalı araçlar
    And click first product
    Then add to cart the product