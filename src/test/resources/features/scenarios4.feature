Feature: Scenario for mini cart functionality on home page

@About
Scenario: user checks if minicart is populated after product is added to cart
	Given user is on dev Home Page
	When user clicks on the product link
	And user selects the s series
	And user clicks on S shop now button
	And user checks if page redirects to store
	And user clicks on add to cart 
	And user goes back to home page
	And user checks if minicart is updated