Feature: Google Search Feature

Scenario: Java Search
Given User is on Google Page
When User Search Java Tutorial
Then Should display Java result page

Scenario: Selenium Search
Given User is on Google Page
When User Search Selenium Tutorial
Then Should display Selenium result page