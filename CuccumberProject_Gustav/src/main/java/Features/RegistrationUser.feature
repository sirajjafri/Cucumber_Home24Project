Feature: www.home24.de Registration scenario

Scenario Outline: Registering user on Home24

Given User is on prelogin Home page
When title of the page is correct
Then Clicks on Signin button
Then user redirects to registration page
Then user clicks on Continue button and enters "<FName>", "<LName>", "<Street>", "<Postal>", "<City>", "<Email>", "<Pass>", "<CPass>" and clicks Continue button
Then user redirects to Home page post login
Then user logs out from homepage post login
Then close the browser


Examples:

| FName  | LName | Street | Postal | City | Email | Pass | CPass |
| Siraj | Jafri | Church road| 20801| Bermingham | mlp@gmail.com | Test@123 | Test@123 |
| Siraj  | Jafri | Church road| 20801| Bermingham |nkp@gmail.com | Test@123 | Test@123 |
