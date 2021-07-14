Feature: This is to launch application and add items to cart




Scenario: Launch application
Given User Launch Chrome browser
When User opens URL "http://automationpractice.com/index.php"
And User Click on PrdWomen
And User Click on List
Then User Click on Add to Cart
And Click on Continue Shopping
Then Close browser

