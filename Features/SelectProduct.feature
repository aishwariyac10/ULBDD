@SelectProduct
Feature: To select a Product

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario: To Selecting a product
Given user is on Search Page
When clicks on the product
Then open the product page
And the name, price, pin and delivery date is displayed
When user clicks on Add to cart button
Then display the cart