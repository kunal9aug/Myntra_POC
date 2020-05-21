$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Login.feature");
formatter.feature({
  "name": "Login on Myntra App",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Successful login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User is on Myntra Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks the Login button and enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "User Should be able to login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Rashikas331@gmail.com",
        "Demo@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Successful login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Myntra Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_Myntra_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Login button and enters \"Rashikas331@gmail.com\" and \"Demo@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_the_Login_button_and_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_Should_be_able_to_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login Failure with Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.step({
  "name": "User is on Myntra Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User clicks the Login button and enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "A message is shown saying Incorrect User id and password",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "xyz@outlook.com",
        "Razz@123"
      ]
    },
    {
      "cells": [
        "Abcd@yahoo.com",
        "abcd@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login Failure with Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Myntra Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_Myntra_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Login button and enters \"xyz@outlook.com\" and \"Razz@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_the_Login_button_and_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "A message is shown saying Incorrect User id and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.a_message_is_shown_saying_Incorrect_User_id_and_password()"
});
formatter.result({
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Incorrect user id or password]\u003e but was:\u003c[Too many failed password attempts, please try after 7 minutes]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.Login.a_message_is_shown_saying_Incorrect_User_id_and_password(Login.java:73)\r\n\tat ✽.A message is shown saying Incorrect User id and password(file:src/test/resources/features/Login.feature:18)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Failure with Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on Myntra Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_is_on_Myntra_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the Login button and enters \"Abcd@yahoo.com\" and \"abcd@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_clicks_the_Login_button_and_enters_and(String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: An element could not be located on the page using the given search parameters.\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-2ITHABKP\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002712.0.2\u0027\nDriver info: io.appium.java_client.android.AndroidDriver\nCapabilities {app: C:\\Users\\kunal\\eclipse-work..., appActivity: com.myntra.android.activiti..., appPackage: com.myntra.android, automationName: Appium, databaseEnabled: false, desired: {app: C:\\Users\\kunal\\eclipse-work..., appActivity: com.myntra.android.activiti..., appPackage: com.myntra.android, automationName: Appium, deviceName: NDD4C18926014588, platformName: android, platformVersion: 10.0}, deviceApiLevel: 29, deviceManufacturer: HUAWEI, deviceModel: JSN-L42, deviceName: NDD4C18926014588, deviceScreenDensity: 480, deviceScreenSize: 1080x2340, deviceUDID: NDD4C18926014588, javascriptEnabled: true, locationContextEnabled: false, networkConnectionEnabled: true, pixelRatio: 3, platform: LINUX, platformName: Android, platformVersion: 10, statBarHeight: 85, takesScreenshot: true, viewportRect: {height: 2052, left: 0, top: 85, width: 1080}, warnings: {}, webStorageEnabled: false}\nSession ID: a67478a8-04b3-41de-a64b-4d0629105f32\n*** Element info: {Using\u003did, value\u003dcom.myntra.android:id/et_email_or_phone}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:239)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:41)\r\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.execute(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:61)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:69)\r\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\r\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\r\n\tat steps.Login.user_clicks_the_Login_button_and_enters_and(Login.java:57)\r\n\tat ✽.User clicks the Login button and enters \"Abcd@yahoo.com\" and \"abcd@123\"(file:src/test/resources/features/Login.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "A message is shown saying Incorrect User id and password",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.a_message_is_shown_saying_Incorrect_User_id_and_password()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/Myntra_AddToCart.feature");
formatter.feature({
  "name": "Add to Cart functionality for Products listed in app",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User adds a Product to Bag",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is Successfully logged into the application.",
  "keyword": "Given "
});
formatter.match({
  "location": "AddToCart.user_is_Successfully_logged_into_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Add to Bag for a Product",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCart.user_clicks_on_Add_to_Bag_for_a_Product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Product gets added in Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.the_Product_gets_added_in_Cart()"
});
formatter.result({
  "status": "passed"
});
});