Feature: Test with Taged Hooks

	@First
	Scenario: My First Scenario
	Given My first step
	When My second step
	Then My third step
	
	@Third
	Scenario: My Second Scenario
	Given My Scnd scnr first step
	When My Scnd scnr second step
	Then My Scnd scnr third step
	
	@Second
	Scenario: My Third Scenario
	Given My Thrd scnr first step
	When My Thrd scnr second step
	Then My Thrd scnr third step
	