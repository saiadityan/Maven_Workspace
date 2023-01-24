Feature: Admin Login

	Scenario: Admin Login with Valid Credentials
	
	Given User is on Home Page
	When User navigate to Login Page
	And User enter credentials to LogIn
		| user1 | pwd1 |
    	| user2 | pwd2 |
    	| user3 | pwd3 |
    	| user4 | pwd4 |
    	| user5 | pwd5 |
    	| user6 | pwd6 |
    Then Message displayed LogIn Successfull