Feature: Login to Hotel page 
	 Create an acount and the Hotel page 
	 
	 
Background: 	
Given user is in Hotel webstie page 
@hotel
Scenario: Test the Hotel page and Create an acount 
When user click in option button which is locate it in left side of the page 
And user click on Hotel icon
And user click on signin button 
And user enter the user name 'far_adj@yahoo.com' and password '12345'
And user click in login button 
Then user login in Hotel page 