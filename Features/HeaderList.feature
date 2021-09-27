@HeaderList
Feature: To Verify Lists on Header

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario: To verify Header Lists
Given user is on Home page
When user hover over Sale and clicks on Deals of the Week
Then direct to Deals of the Week page
When user hover over Living and clicks on Sofa Set
Then direct to Sofa Set page
When user hover over Bedroom and clicks on Beds
Then direct to Beds page