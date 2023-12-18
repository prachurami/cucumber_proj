Feature: Add to Cart functionality


Scenario: Deleting the previously saved product
Given User Navigate to login page
When User Enters valid "4167267407" username
And Enter vaild "Prachi@123" Password
And User click on Login button
And User click on cart button
And User click on Delete button of saved product 
Then Product should be removed from the saved items list


@prachi
Scenario: Adding product to the cart
Given User Navigate to login page
When User Enters valid "4167267407" username
And Enter vaild "Prachi@123" Password
And User click on Login button
And User click on cart button
And User  update the quantity after priviously saved the product and proceed to checkout
Then Validating the updated price and shipping page
