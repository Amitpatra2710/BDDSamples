@PhaseOne
Feature: CRM Contacts Deals Functionality

Background: User Login
Given User must have logged in
@RegressionTest
Scenario: Create a contact
#Given User must have logged in
When User create a contact

@RegressionTest
Scenario: Update contact
#Given User must have logged in
When User Update a contact

Scenario: View contact Details
#Given User must have logged in
When User View a contact

@SmokeTest
Scenario: Create a Deal
#Given User must have logged in
When User create a Deal

@SmokeTest
Scenario: Update Deal
#Given User must have logged in
When User Update a Deal

Scenario: View Deal Details
#Given User must have logged in
When User View a Deal

@RegressionTest @SmokeTest
Scenario: Logout from App
#Given User must have logged in
When User Logout