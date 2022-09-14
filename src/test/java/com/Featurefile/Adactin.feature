Feature: Adactin is a Hotel Booking Application
Scenario: Login module of Adactin Application
Given user launch the Application
When user enter the correct username
And user enter the correct password
Then user click login button move to next page

Scenario: Search the hotel in Adactin Application
Given user fill the particulae aspect
When user select the location
And user select hotels
And user select Room Type
And user enter In Date
And user enter Out Date
And user select adults per Room
And user select children per Room
Then user click search button
Scenario: Select The hotel in Adactin Application
Given user select particular hotel
When user select the hotel in given list
Then user click continue button
Scenario: Booking the particular hotel
Given user pay hotel amount in payer
When user enter the first name
And user enter Last name
And user enter Billing Address
And user enter credit card number
And user select credit card type
And user select Expiry Month in credit card
And user select Expiry year in credit card
And user enter the CVV Number
And user click Book Now Button
And user got Order No.
Then user click My Itinerary button 
Scenario: Booked Itinerary in Adactin Application
Given user verify booking details
