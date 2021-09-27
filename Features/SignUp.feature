@SignUp
Feature: Sign Up on Urban Ladder

Background:
Given A windows system
When I initialize Browser
And enter URL
Then WebPage should be Open
 
Scenario: To verify Sign Up
Given user is on Home page
When user clicks on sign up
And user enters email and password and hits the Sign Up button
Then redirect to LoginPage