Feature: Testing the Employee Feature
Background:
Given the employee has load the application in the browser
When the employee clicks on the login Button navbar 
When the employee enters email in textbox
And the employee enters the password in the textbox
And the employee clicks on the login button

@Module8
Scenario: Testing the view Rooms With Valid Data
And the employee clicks on Rooms
Then the employee clicks on  View Rooms
 
@Module9
Scenario: Testing the delete Rooms With Valid Data
And the employee click on Rooms
And the employee click on View Rooms
And the employee click on Delete button

@Module10
Scenario: Testing the Add Rooms With Valid Data
And the employee click on Room
And the employee click on add Rooms
And the employee enters room capacity
And the employee enters room rent
And the employee enters Hotel Name
And the employee enters room No
And the employee click on Submit
 