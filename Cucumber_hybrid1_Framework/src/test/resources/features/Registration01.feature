Feature: Registration functionality

Scenario: register with all right data 
Given User navigates to directliy to registration page
When User enters valid Name
When User enter valid email address "tugudamedu1@gmail.com" in email field
And User enters valid password "Prachi@123" in password field
And User enters valid and same "Prachi@123" password 
And User clicks on continue button
Then User should get success message


Scenario: register with all right data except email 
Given User navigates to directliy to registration page
When User enters valid Name
When User enter invalid email address "chramip065gmy.com" in email field
And User enters valid password "Prachi@123" in password field
And User enters valid and same "Prachi@123" password 
And User clicks on continue button
Then User should get invalid email warning message


Scenario: registering with password missmatch
Given User navigates to directliy to registration page
When User enters valid Name
When User enter valid email address "tugudamedu11@gmail.com" in email field
And User enters valid password "Prachi@123" in password field
And User enters missmatch and same "Prachi444@123" password 
And User clicks on continue button
Then User should get password missmatch message


Scenario: registering with Empty Name
Given User navigates to directliy to registration page
When User enters valid no Name
When User enter valid email address "tugudamedu11@gmail.com" in email field
And User enters valid password "Prachi@123" in password field
And User enters valid and same "Prachi@123" password 
And User clicks on continue button
Then User should get enter your name warning message
