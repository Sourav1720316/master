@FirstTest
Feature: CucumberJava

Background: User login
						Given User can input Username and Password
						Then User can click on login button
						
	
  Scenario Outline: Login functionality exists
    Given Tutorialspoint is searched with "<Search>"
    When I open Facebook website with Username and Password
    |Username  | Sourav|
    |Age | 30|
    |Emp | Full time|
    Then I will login
    
  Scenario Outline: Home Page
  	Given Validate "<Title>" of home page
  	Then Validate fields of home page
  	| Title |
  	|Home |
    