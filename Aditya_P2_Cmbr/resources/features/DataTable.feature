Feature: Admin Login Datatable

	Scenario: Admin Login with DataTable Valid Credentials
	
	Given User is onto Home page
	When User navigate to Login page
	And User enter credentials to LogIn page
		| user11 | pwd12 |
    	| user22 | pwd23 |
    	| user33 | pwd34 |
    	| user44 | pwd45 |
    	| user55 | pwd56 |
    	| user66 | pwd67 |
    Then LogIn Successfull message dispalyed