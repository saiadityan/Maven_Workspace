Feature: Login Action

	#outline repeat your total steps with multiple set of data
	Scenario Outline: Successfull Login with Valid Credentials
	
	Given Account User is on Home Page
	When User navigate to Account Login Page
	And User enters "<username>" and "<password>"
	Then Message displayed Login Successfully
	
	Examples:
		| username | password |
		| saiadity | sai23451 |
		| suryasa1 | s@n3452h |
		| sansury2 | 673!san9 |
		| sursanw3 | 34gdbsa& |
		| sursany4 | 342we@d2 |
		| sansgyw5 | 23sde&f3 |
		