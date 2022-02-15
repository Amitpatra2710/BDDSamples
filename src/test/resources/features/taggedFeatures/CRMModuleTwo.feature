@PhaseTwo
Feature: CRM Task Functionality

@RegressionTest
Scenario: Create a Task
Given User must have logged in
When User create a Task

Scenario: Update a Task
Given User must have logged in
When User Update a Task

@SmokeTest
Scenario: View Task Details
Given User must have logged in
When User View a Task

@RegressionTest 
Scenario: Logout from App
Given User must have logged in
When User Logout