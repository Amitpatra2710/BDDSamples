Feature: CRM Login Feature

#Scenario: Valid Login
#Given User is on Login page
#When User enters login credentials
#Then User enters home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then User enters home page

#Scenario: Valid Login
#Given User is on Login page
#When User enters "<username>" and "<password>"
#Then User enters home page

#Examples:
#		| username | password |
#		| tomsmith | SuperSecretPassword! |
#		| testuser1 | welcome123 |
#		| testuser2 | welcome123 |
		
Scenario: Valid Login
Given User is on Login page
When User enters login credentials
		| username | password |
		| tomsmith | SuperSecretPassword! |
Then User enters home page