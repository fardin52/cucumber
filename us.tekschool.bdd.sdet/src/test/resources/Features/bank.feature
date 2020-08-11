Feature: Test the Bank website 


Background:
Given user in the Bank web page
@banktest
Scenario: Test the three sliders in Bank website
When user click in Apply for mortgage button
And user scrolldown to the end of the page 
And  user scroll the payment slider from '5 %' to the '27 %'
And user scroll the Annual slider from '95 %' to the '77.5%'
And user scroll the interest slider from' 5 %' to '7.75 %'
Then user should make ready the page to buy home 