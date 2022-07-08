@tag 
Feature: Page Activities 
#1 
@normalUser
Scenario: As a normal user I should be able to login and access to the application 
	Given The normal user is in the login page
	When the normal User send an email as "test@hotmail.com" 
	And the normal User send password as "test" 
	And normal User click on Log in button 
	Then normal User should be in Home Page 

#2	
@nonRegisteredUser
Scenario: As a non-registered user I should be able to skip the login process and access the application with a default profile 
	Given The non-registered user is in the login page 
	When non-registered User clicks on Skip button 
	Then non-registered User should be in Home Page

#3
@normalUser
Scenario: As a normal user I should be able to login in my application and see local news
	Given The normal user is in the login page
	When the normal User send an email as "test@hotmail.com" 
	And the normal User send password as "test" 
	And normal User click on Log in button
	Then normal User should be in Home Page
	And User should see the section of local news
	
#4	
@PremiunUser
Scenario: As a Premiun user I should be able to login and see local and global news
	Given The premiun user is in the login page
	When the Premiun User send an email as "testpremiun@hotmail.com" 
	And the Premiun User send password as "testpremiun" 
	And premiun User click on Log in button
	Then premiun User should be in Home Page
	And User should see the section of global and local news
	
#5
@PremiunUser
Scenario: As a Premiun User I should be able to login and open an article with no adds
	Given The premiun user is in the login page
	When the Premiun User send an email as "testpremiun@hotmail.com" 
	And the Premiun User send password as "testpremiun" 
	And premiun User click on Log in button
	And the premiun User should be in Home Page
	And premiun User click on an article
	Then User see an article with no adds
	
#6
Scenario: As a Normal User I should be able to login and open an article with at least five adds
	Given The normal user is in the login page
	When the normal User send an email as "test@hotmail.com" 
	And the normal User send password as "test" 
	And normal User click on Log in button
	And the normal User should be in Home Page
	And normal User click on an article
	Then User see an article with at least five adds
	
#7

Scenario: As a non-registered user I should not be able to open an article
	Given The non-registered user is in the login page 
	When User clicks on Skip button 
	And the non-registered User should be in Home Page
	And non-registered User click on an article
	Then the system should deny the access
	
#8
Scenario: As a Normal User I should be able to login and change my membership
	Given The normal user is in the login page
	When the normal User send an email as "test@hotmail.com" 
	And the normal User send password as "test" 
	And normal User click on Log in button
	And the normal User should be in Home Page
	And normal User click on membership and select the Premiun plan
	Then User should see a message to confirm the change of plan
	







