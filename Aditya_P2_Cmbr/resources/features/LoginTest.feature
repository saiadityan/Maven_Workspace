Feature: Verifying Login Test

	Scenario: Verifying Login Page Successful
	
	Given Enter Facebook site url
	When User enter valid username and password
	And click on Login Button
	Then verify login successful message display
	