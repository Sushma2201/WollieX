
@OrderProduct

Feature: This for WolliesX Tech challenge
@AddCartTc1

Scenario: Launch application and Place Order
Given User Launch Chrome browser
When User opens URL "http://automationpractice.com/index.php"
And User Click on PrdWomen
Then User Adds firstProduct to cart
And Click on Continue Shopping
Then User Adds Product2 to cart
And User Proceeds to cartsummary
Given Validates Authentication page
And User provides Emailaddress and Password
And User Clicks Sign in and Proceed
Then User Selects Shipping and Proceed
And User Selects check Payment options
Then User Confirm order summary
Then User validates Order Confirmation
Then Close browser




