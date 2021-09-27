@Stores
Feature: To get Stores

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario: To verify Stores from Header
Given user is on Home page
When user clicks on Stores button from header
Then display the Stores page
When user clicks on a particular location
Then print the address