package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_conformation {
	WebDriver driver;
	public Booking_conformation (WebDriver driver) {
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
@FindBy(id = "hotel_name")	
WebElement hotel_name;
public WebDriver getDriver() {
	return driver;
}
public WebElement getHotel_name() {
	return hotel_name;
}
public WebElement getLocation() {
	return location;
}
public WebElement getRoom_type() {
	return room_type;
}
public WebElement getArrival_date() {
	return arrival_date;
}
public WebElement getDeparture_text() {
	return departure_text;
}
public WebElement getTotal_rooms() {
	return total_rooms;
}
public WebElement getAdults_room() {
	return adults_room;
}
public WebElement getChildren_room() {
	return children_room;
}
public WebElement getPrice_night() {
	return price_night;
}
public WebElement getTotal_price() {
	return total_price;
}
public WebDriver getGst() {
	return gst;
}
public WebElement getFinal_price() {
	return final_price;
}
public WebElement getFirst_name() {
	return first_name;
}
public WebElement getLast_name() {
	return last_name;
}
public WebElement getAddress() {
	return address;
}
public WebElement getOrder_no() {
	return order_no;
}
public WebDriver getLogout() {
	return logout;
}
@FindBy(id = "location")
WebElement location;
@FindBy(id = "room_type")
WebElement room_type;
@FindBy(id = "arrival_date")
WebElement arrival_date;
@FindBy (id = "departure_text")
WebElement  departure_text;
@FindBy(id = "total_rooms")
WebElement total_rooms;
@FindBy(id = "adults_room")
WebElement adults_room;
@FindBy(id = "children_room")
WebElement children_room;
@FindBy(id = "price_night")
WebElement price_night;
@FindBy(id = "total_price")
WebElement total_price;
@FindBy(id = "gst")
WebDriver gst;
@FindBy(id = "final_price")
WebElement final_price;
@FindBy(id = "first_name")
WebElement first_name;
@FindBy(id = "last_name")
WebElement last_name;
@FindBy(id = "address")
WebElement address;
@FindBy(id = "order_no")
WebElement order_no;
@FindBy(id = "logout")
WebDriver logout;








}


