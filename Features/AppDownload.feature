@AppDownload
Feature: To get App Download Links

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario Outline: To verify App Download Links from Footer
Given user is on Home page
When user clicks on Download app button for <store>
Then direct to the download page
Examples:
|store |
|apple |
|google|
