@Checkout
Feature: To Checkout

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario: To verify checkout
Given user is on Cart
When user clicks on Checkout button
And enters Details
And Clicks Save
Then display the payment page