Feature: Verifying User Registration

	Scenario: Valid Registration
	Given Enter Facebook site url
	When User enter valid mobile number
	And wait for OTP
	And Enter valid OTP
	And click on Create Account Button
	Then verify Registration successfull message displayed
	
	Scenario: 
	Given Enter Facebook site url