Feature: Create new contact

Background:
Given user opens corrrect browser
When user should navigate to corrrect URL
When user enters user name
And user enters password
When user clicks on login button2
Then user is logged in successfully

@CreateContact
Scenario: user should be able to create new contact record

Given user should be present on homepage
When user should click on contact
Then new button should be displayed
Then user enters all the required details
|Elston    |desa     |Diago      |elston.desa@corp.com|Co-operator|
Then contact should be saved successfully
