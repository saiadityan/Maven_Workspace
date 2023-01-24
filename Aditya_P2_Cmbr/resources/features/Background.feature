Feature: Email Communication

	Background: 
				Given Gmail Homepage
				And Login into Account
				And search email
				
	Scenario: Verifying Reply Functionality
				When User click on reply button
				Then verify reply screen dispalyed
				
	Scenario: Verifying Forward Functionality
				When User click on Forward button
				Then verify Forward screen displayed
				
	Scenario: Verifying Delete Functionality
				When User click on delete button
				Then verify email delete option displayed
				