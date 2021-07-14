$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurFiles/Wolliesx.feature");
formatter.feature({
  "line": 1,
  "name": "This is to launch application and add items to cart",
  "description": "",
  "id": "this-is-to-launch-application-and-add-items-to-cart",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Launch application",
  "description": "",
  "id": "this-is-to-launch-application-and-add-items-to-cart;launch-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User opens URL \"http://automationpractice.com/index.php\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Click on PrdWomen",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click on List",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Click on Add to Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Continue Shopping",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "WolliesX.User_Launch_Chromebrowser()"
});
formatter.result({
  "duration": 6026766053,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.User_opens_URL()"
});
formatter.result({
  "duration": 4942588897,
  "status": "passed"
});
formatter.match({
  "location": "WolliesX.User_Click_on_PrdWomen()"
});
formatter.result({
  "duration": 7614604707,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//*[@id\u003d\"block_top_menu\"]/ul/li[1]/a\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027apples-MacBook-Air.local\u0027, ip: \u0027fe80:0:0:0:807:eaba:c5d9:6d8c%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.13.6\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: driver.version: RemoteWebDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepDefinitions.WolliesX.User_Click_on_PrdWomen(WolliesX.java:42)\n\tat ✽.And User Click on PrdWomen(featurFiles/Wolliesx.feature:9)\n",
  "status": "failed"
});
formatter.match({
  "location": "WolliesX.User_Click_on_List()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WolliesX.User_click_on_Add_to_Cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WolliesX.Click_on_Continue_Shopping()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "WolliesX.Close_browser()"
});
formatter.result({
  "status": "skipped"
});
});