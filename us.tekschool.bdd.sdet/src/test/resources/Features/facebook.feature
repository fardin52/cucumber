Feature: login to the faceBook 


Background: 
Given user is in facebook webstie

@facebook
Scenario: Testing FaceBook icons 
When user enter the username'far_adj@yahoo.com' 
And user enter the password 'f1l2a3j'
And user click on login button 
And user click in Fardin in the top of the page 
And user go all the way down to the Eid Mubarak post
And user should check is the like button is display 
And user click on care icon
And user click in comment icon
And user type ' nice ' on comment field
And user come to massenger and choose Basel 
And user write a massage ' I LOVE YOU '
And user click in send key
And user click in close icon to close the massage window
And user click in array icon on top of the page 
Then user click in log out and get of from page 
