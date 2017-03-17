Feature: Withdraw cash
	As a debit card holder
	I can withdraw cash from an ATM
	So I can pay my bills
	
Scenario: All good
# Given is allways a precondition
Given I entered my card
And I input my pin
And I have 1000 in my account
# action by the user
When I withdraw 400 doll hairs
# Outcome(s) 
Then I have 600 doll hairs left
