Feature: Login functionality




Scenario: login with valid email and valid password
Given User Navigate to login page
When User Enters valid "4167267407" username
And Enter vaild "Prachi@123" Password
And User click on Login button
Then User Should get a proper login Message


Scenario: login with valid email and invalid password
Given User Navigate to login page
When User Enters valid "4167267407" username
And Enter vaild "Prachi2121@123" Password
And User click on Login button
Then User Should get a proper warning Message for wrong password

Scenario: login with valid email and empty password
Given User Navigate to login page
When User Enters valid "4167267407" username
And Enter vaild "" Password
And User click on Login button
Then User Should get a proper warning Message for empty password




