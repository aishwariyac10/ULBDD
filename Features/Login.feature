@Login
Feature: Urban Ladder Login

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open

Scenario: To verify Log In
Given user is on LoginPage
When user enters email and password and hits the Log In button
Then redirect to Home page


