@cucumberHooks
Feature: AudienceApp UAT log in  feature

@AudienceAppLogInDefault
Scenario: Log in with default username and password

Given User is on AudienceApp UAT Log in Page
When User enters Login email and password and clicks log in
Then User lands on request AudienceAPP page