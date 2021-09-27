@GiftCard
Feature: To get Gift Cards

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario: To verify Gift Cards Button from Header
Given user is on Home page
When user clicks on Gift Cards button from header
Then display the Gift Cards page