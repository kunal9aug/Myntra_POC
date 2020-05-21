$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/AddToCart.feature");
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is Successfully logged into the application.",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User clicks on Add to Bag for a Product",
  "keyword": "When "
});
formatter.match({
  "location": "AddToCart.user_clicks_on_Add_to_Bag_for_a_Product()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The Product gets added in Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "AddToCart.the_Product_gets_added_in_Cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("Features/Login.feature");
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
  "keyword": "Scenario Outline"
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
  "keyword": "Scenario Outline"
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login Failure with Invalid Credentials",
  "description": "",
  "keyword": "Scenario Outline"
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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});