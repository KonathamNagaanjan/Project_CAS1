Feature: login application

  Scenario: sucessfull login
    Given user is on the becognizant site
    When user login into site with valid credentials username 
    And user login into site with valid credentials password
    And user requested to authenticate the site for approval
    Then user is logined to the site
    And User need to verify the profile name
    
    
	Scenario: Navigation to Acronyms
		When user user clicks on the company dropdown list
		Then user need to select the Acronyms
		And user need verify the title of redirected 
		
	Scenario: Identifying the Acronyms
		Given user need identify and print acronyms
		Then user need to snippet the complete acronyms
		
	
    
