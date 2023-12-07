Feature: Login into Application

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://rahulshettyacademy.com" site
And Click on Login link in home page to land on Secure sign in page
When User enters "<username>" and "<password>" and logs in
Then Verify that user is successfully logged in
And Close browser

Examples:
|username								|password		|
|test99@gmail.com				|123456			|
|user123@ecommerce.com	|932156			|