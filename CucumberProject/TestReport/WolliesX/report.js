$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurFiles/Wolliesx.feature");
formatter.feature({
  "line": 4,
  "name": "This for WolliesX Tech challenge",
  "description": "",
  "id": "this-for-wolliesx-tech-challenge",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@OrderProduct"
    }
  ]
});
formatter.scenario({
  "line": 7,
  "name": "Launch application and Place Order",
  "description": "",
  "id": "this-for-wolliesx-tech-challenge;launch-application-and-place-order",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@AddCartTc1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User opens URL \"http://automationpractice.com/index.php\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User Click on PrdWomen",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Adds firstProduct to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Continue Shopping",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User Adds Product2 to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User Proceeds to cartsummary",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Validates Authentication page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User provides Emailaddress and Password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User Clicks Sign in and Proceed",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User Selects Shipping and Proceed",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User Selects check Payment options",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User Confirm order summary",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "User validates Order Confirmation",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "WolliesX.user_Launch_Chromebrowser()"
});
formatter.result({
  "duration": 6343005474,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_opens_URL()"
});
formatter.result({
  "duration": 6918436076,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Click_on_PrdWomen()"
});
formatter.result({
  "duration": 6354236229,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Adds_firstProduct_to_cart()"
});
formatter.result({
  "duration": 2191473624,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.click_on_Continue_Shopping()"
});
formatter.result({
  "duration": 1374573887,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Adds_Product2_to_cart()"
});
formatter.result({
  "duration": 5859271773,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Proceeds_to_cartsummary()"
});
formatter.result({
  "duration": 8336514703,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.validates_Authentication_page()"
});
formatter.result({
  "duration": 1268852748,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_provides_Emailaddress_and_Password()"
});
formatter.result({
  "duration": 3632551128,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Clicks_Sign_in_and_Proceed()"
});
formatter.result({
  "duration": 11705419888,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Selects_Shipping_and_Proceed()"
});
formatter.result({
  "duration": 10242182569,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Selects_check_Payment_options()"
});
formatter.result({
  "duration": 6404641155,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_Confirm_order_summary()"
});
formatter.result({
  "duration": 7310347364,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.user_validates_Order_Confirmation()"
});
formatter.result({
  "duration": 3245074295,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.Close_browser()"
});
formatter.result({
  "duration": 653976002,
  "status": "passed"
});
});