package com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.PomClass.Login_page;
import com.PomClass.Search_hotel;
import com.Testrunner.Runner_class;
import com.baseclass.Base_class1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_definition extends Base_class1 {

	public static WebDriver driver = Runner_class.driver;
	public Login_page l = new Login_page(driver);
	public Search_hotel sh= new Search_hotel(driver);

	@Given("^user enter the URL of adactin Application$")
	public void user_enter_the_URL_of_adactin_Application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		openUrl("https://adactinhotelapp.com/");
	}

	@When("^user enter the correct username$")
	public void user_enter_the_correct_username() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("gowthamiguru");
	     sendkeys(l.getUsername(),"gowthamiguru");
	
	}
	
	

	private void sendkeys(WebElement username, String string) {
		// TODO Auto-generated method stub
		
	}

	@When("^user enter the correct password$")
	public void user_enter_the_correct_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("9952436822");
		input_Values(l.getPassword(), "9952436822");
	}

	@Then("^user click login button move to next page$")
	public void user_click_login_button_move_to_next_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
	}
	@When("^user select the location$")
	public void user_select_the_location() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//select[@id='location'])")).sendKeys("Sydney");
	}

	@When("^user select hotels$")
	public void user_select_hotels() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//select[@id='hotels'])")).sendKeys("Hotel creek");
	}

	@When("^user select Room Type$")
	public void user_select_Room_Type() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter checkIn Date$")
	public void user_enter_checkIn_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user enter checkOut Date$")
	public void user_enter_checkOut_Date() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user select adults per Room$")
	public void user_select_adults_per_Room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("^user select children per Room$")
	public void user_select_children_per_Room() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^user click search button$")
	public void user_click_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
