@RiskNetRT_WebLogin
Feature: RiskNet RealTime Login 
		As a user 
		I need to login to RiskNet RealTime
		So that I can access the RiskNet RealTime features 
#		
#Scenario: Open the risknet realtime
#		Given I navigate to the risknet realtime
#		 When I have risknet realtime available
#		 Then I am able to signin  		
		
Scenario: I login with valid credentials
		Given I navigate to to RiskNet RealTime web application
		 When I enter valid email and passord
		 Then I am logged in          

#Scenario: I login with invalid credentials
#		Given I navigate to to RiskNet RealTime web application
#		 When I enter invalid email and passord
#		 Then I see an error message
#		 
#		 		 
#Scenario: Risknet realtime home page available after login
#		Given I navigate to to RiskNet RealTime web application
#		 When I login with valid credentials
#		 Then I am on the risknet reltime home page
#		 
#Scenario Outline: Risknet realtime models
#		Given I login with valid credentials
#		 When I select "option" 
#		 Then I am able to access "option"
#Examples:
#|	option		|
#|	alerts		|
#|	rules		|
#|	statistics	|