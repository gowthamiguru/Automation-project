package com.PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_hotel2 {
	WebDriver driver;
	
	public Search_hotel2 (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	
		
	}

@FindBy(id = "radiobutton_0")
WebElement radiobutton_0;
@FindBy(id = "continue")
WebElement continues;
}
	

	



	
