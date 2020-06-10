#Author: Adarsh Ramesh
Feature: open Zomato

Background:
Given launch zomato app
When user selects login with Gaccount and select corresponding account 
And select allow only while using the app


Scenario: Search a nearby restaurant for indian cuisine and select one restaurant from the list to view
Given click on search box
When User inputs "anna" in search box 
And User should view search results displayed
Then User should select 2nd suggestion from search result displayed


Scenario: Update profile picture in My Account section of app using gallery image or camera image
Given user will navigate to profile section
Then user will select the profile picture 
Then user will select edit profile
And user will select edit photo button and click change photo from the list
Then user will allow permissions
And user should select a profile picture from gallery and preview
When user clicks Done profile picture should be updated as expected

