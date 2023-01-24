Feature: Verify Flipkart Registration

	Scenario: Registration with Mobile Number
	
	Given Flipkart site url as "http://flipkart.com"
	And click on Register with us
	When User enter valid mobile number "9876543212"
	And Enter firstname as "Sai"
	And Enter surname as "Aditya"
	And Enter age as 25
	And click on Register
	Then Verify Registration success message display 