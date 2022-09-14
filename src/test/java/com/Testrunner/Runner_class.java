package com.Testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_class1;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(features = "src\\test\\java\\com\\Featurefile\\Adactin.feature", glue = "com.Stepdefinition")
@RunWith(Cucumber.class)

public class Runner_class {
	public static WebDriver driver;

	@BeforeClass
	public static void start_up() {
		driver = Base_class1.browserLaunch();

	}

	@AfterClass

	public static void ends_up() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();

	}
}
