Feature: Login on Myntra App

  @Login
  Scenario Outline: Successful login with Valid Credentials
    Given User is on Myntra Home Page
    When User clicks the Login button and enters "<username>" and "<password>"
    Then User Should be able to login

    Examples: 
      | username               |password  |
      | Rashikas331@gmail.com  | Demo@123 |
      #| Abcd@yahoo.com         | abcd@123 |

   Scenario Outline: Login Failure with Invalid Credentials
  	Given User is on Myntra Home Page
    When User clicks the Login button and enters "<username>" and "<password>"
    Then A message is shown saying Incorrect User id and password
    
    Examples: 
      | username               |password  |
      | xyz@outlook.com        | Razz@123 |
      | Abcd@yahoo.com         | abcd@123 |