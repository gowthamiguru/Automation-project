package com.baseclass;



import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Base_class1 {
	public static WebDriver driver;
	public static Actions act;
	public static Robot r;
	public static File desti;
	public static File source;
	public static Select s;
	public static WebElement enabledElement;
	public static WebElement selectedElement;
	public static WebElement displayedElement;
	public static WebElement getAttribute;
	public static WebElement multipleDropdown;
	public static WebElement singleDropdown;
	public static List<WebElement> getoptions;
	public static WebElement firstSelectedOption;
	public static List<WebElement> allSelectedOptions;
	public static WebElement simpleAlert;
	public static WebElement confirmAlert;
	public static WebElement promptAlert;
	public static WebElement promptTextBox;
	public static WebElement singleFrame;
	public static WebElement multipleFrame;
	public static WebElement multipleFrame1;
	public static WebElement webelement;
	public static WebElement frameTextBox;
	public static WebElement frameTextBox1;
	public static WebElement element;
	public static WebElement element1;
	public static WebDriverWait wait;
	public static FluentWait<WebDriver> wait1;
    public static JavascriptExecutor js;
    public static String url;
    
	public static WebDriver browserLaunch()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\gowth\\eclipse-workspace\\New_Maven_Project\\Driver1\\chromedriver.exe");
		return driver = new ChromeDriver();
	}
	
	public static void openUrl(String url)
	{
		driver.get(url);
		
	}
	public static void input_Values(WebElement element, String string) 
	{
		//element.clear();
		element.sendKeys(string);
		
	}
	
	public static void close()
	{
		driver.close();
	}
	
	public static void quit()
	{
		driver.quit();
	}
	
	public static void navigateTo(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void navigateBack()
	{
		driver.navigate().back();
	}
	
	public static void navigateForward()
	{
		driver.navigate().forward();
	}
	
	public static void navigateRefresh()
	{
		driver.navigate().refresh();
	}
	
	public static void getTitle(String title)
	{
	    driver.getTitle();
	    System.out.println(title);
	}
	
	public static void getCurrentUrl(String currentUrl)
	{
	    driver.getCurrentUrl();
	    System.out.println(currentUrl);
	}
	
	public static void action()
	{
		act=new Actions(driver);
	}

	public static void dropDown(WebDriver driver, By locator, String value)
	{
		new Select(driver.findElement(locator)).selectByVisibleText(value); 
	}
	
	public static void getOptions(WebElement webElement2)
	{
	    s=new Select(multipleDropdown);
	     getoptions = s.getOptions();
	}
    public static void getFirstSelectedOptions() 
    {
    	s=new Select(multipleDropdown);
	     firstSelectedOption = s.getFirstSelectedOption();
    }
	
	public static void getAllSelectedOptions() 
	{
		s=new Select(multipleDropdown);
		allSelectedOptions = s.getAllSelectedOptions();
	}
	
	public static void isMultiple(boolean multiple) 
	{
		s=new Select(multipleDropdown);
		multiple=s.isMultiple();
	}
	public static void robot() throws AWTException
	{
	     r=new Robot();
	}
	
	public static void takesScreenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		source=ts.getScreenshotAs(OutputType.FILE);
		desti=new File("C:\\Users\\gowth\\eclipse-workspace\\selenium_jun\\screenshot");
		FileUtils.copyFile(source, desti);
	}
	
	public static void simpleAlert()
	{
		simpleAlert.click();
		driver.switchTo().alert().accept();
	}
	
	public static void confirmAlert()
	{
		confirmAlert.click();
		driver.switchTo().alert().dismiss();
	}
	public static void promptAlert(String text)
	{
		promptTextBox.click();
		promptAlert.click();
		driver.switchTo().alert().sendKeys(text);
		driver.switchTo().alert().accept();
	}
	
	public static void singleFrames(String input)
	{
		singleFrame.click();
		driver.switchTo().frame(singleFrame);
		frameTextBox.sendKeys(input);
		driver.switchTo().parentFrame();
	}
	
	public static void multipleFrames(String input1)
	{
		multipleFrame.click();
		driver.switchTo().frame(multipleFrame);
		multipleFrame1.click();
		driver.switchTo().frame(multipleFrame1);
		frameTextBox1.sendKeys(input1);
		driver.switchTo().defaultContent();
	}
	
	public static void windowHandles()
	{
		act.contextClick(webelement).build().perform();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void checkBox(boolean check)
	{
	   check = element1.isSelected();
	   element1.click();
	}
	
	public static void isEnabled(boolean enabled)
	{
		enabled = enabledElement.isEnabled();
	}
	
	public static void isDisplayed(boolean displayed)
	{
		displayed = displayedElement.isDisplayed();
	}
	
	public static void isSelected(boolean selected)
	{
		selected=selectedElement.isSelected();
	}
	
	public static void getText(String text2)
	{
		text2=element.getText();
	}
	
	public static void getAttribute(String name)
	{
		element1.getAttribute(name);
	}
	
	
	public void implicitWait()
	{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public static void explicitWait(WebElement element) {
		 WebDriverWait Ewait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Ewait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void fluentWait()
	{
		 wait1= new FluentWait<WebDriver>(driver);
	     wait1.withTimeout(Duration.ofSeconds(60));
		 wait1.pollingEvery(Duration.ofSeconds(15));
		 wait1.ignoring(Exception.class);
	}
	
	public static void scrollUp()
	{
		driver.manage().window().maximize();
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,0)", "");
	}
	
	public static void scrollDown()
	{
		js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
	}
	
	
	public static void click (WebElement element) 
	{
		element.click();
	

	}

	public static WebDriver Browser_laun() {
		// TODO Auto-generated method stub
		return null;
	}

}



   




               


 








		
















		

























		









































		


		








		






















		

		
		               
		

		 



