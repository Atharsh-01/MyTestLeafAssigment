Feature: User Authetication for Facebook application

Scenario: Successful login using valid credentials

Given the user is on login page
When the user enters the username as atharsh
And the user enters the password as Facebook
And the user click the loggin button
Then the user should be redirected to the facebook home page

Scenario: Failed login using invalid credentials

Given the user is on login page
When the user enters the username as atharsh
And the user enters the password as Facebooksss
And the user click the loggin button
But the user should not redirected to the facebook home page