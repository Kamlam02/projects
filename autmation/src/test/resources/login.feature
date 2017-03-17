Feature: http://54.68.58.68:8080/jenkins/ login
	As a registered user
	I can login
	To create jobs

Scenario: Login
	Given I enter "jenkin" as the username
	And I enter "welcome1" as the password
	When I click login button
	Then I will be on the Jenkins homepage