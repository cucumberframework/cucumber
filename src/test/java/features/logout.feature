Feature: Logout Feature




@ChromeTC
Scenario: user loggs in successfully
Given user is on login page
When user enters "Elston" and "Daniel"
And user enters "Test@123"
When user clicks on login button
Then user is logged in successfully

@FirefoxTC
Scenario: user loggs in successfully
Given user is on login page
When user enters "invalidUser" and "invaliduser2"
And user enters "invalid"
When user clicks on login button
Then user is logged in successfully

@ChromeTC
Scenario: user loggs in successfully
Given user is on login page
When user enters username and password
|elston1 |password1|
|elston2 |password2|
And user enters "invalid"
When user clicks on login button
Then user is logged in successfully



@FirefoxTC
Scenario Outline: user loggs in successfully
Given user is on login page
When user enters following details <usernameDetails> and <passwordDetails>
And user enters "invalid"
When user clicks on login button
Then user is logged in successfully

Examples:
|usernameDetails |passwordDetails|
|user1 	         |pass1          |
|user2           |pass2          |
|user3           |pass3			 |
|user4			 |pass4			 |

