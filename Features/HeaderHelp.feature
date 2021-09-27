@HeaderHelp
Feature: To Verify Help button on Header

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario: To verify Header Help
Given user is on Home page
When user clicks on Help from the header
Then direct to FAQ page