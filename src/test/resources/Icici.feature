Feature: To validate the login function of icici bank portal

@Scenario1
Scenario Outline: To validate the login function with userId and password

Given To launch the chrome browser and to maximise window
When To launch the url of icici bank site
And To Click the userId field
And To pass userId "<userids>" in userId field
And To pass the password "<pass>" in password field
And To click the loginBtn
Then To close the Browser

Examples:
|userids									      |pass|
|seleniuminmakes@gmail.com      |85968|
|testng@inmakes.in              |89752|
|cucumberframeworks@hotmail.com |25698|

