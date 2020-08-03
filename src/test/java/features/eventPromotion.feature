Feature: Create event promotion  
	As a client I want to create a event promotion so that discounted item can be created 

Scenario: Users would be able to add new promotion 
	Given a user with username "support" and password "l2w0OoJCmjwS@0jT" already logged in on website
	When user navigate to Marketing -> Event Promotion 
	Then Event Promotions page shows up 
	When user clicks Create Promotion
	Then Create Event Promotion page 
	And Event details will be provided 
	
	
	
	
	
	 
	 