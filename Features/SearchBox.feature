@SearchBox
Feature: To verify Search Box

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario Outline: To verify Search Box
Given user is on Home page
When user types for <product> in searchbox and clicks Search
Then direct to search results page
Examples:
|product |
|sofa    |
|chair   |
|table   |