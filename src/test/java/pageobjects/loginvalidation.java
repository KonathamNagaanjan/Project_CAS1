package pageobjects;

import java.time.Duration;

//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.DriverSetup;

//import Utilities.DriverSetup;
//import io.cucumber.java.en.When;

public class loginvalidation{ /*extends BasePage{
	

	public loginvalidation(WebDriver getdriver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}*/

	public static WebDriver driver;
	/* extends basepage{
	public loginvalidation(WebDriver driver) {
		super(driver);
	}*/
	
	@FindBy(xpath="//input[@id=\"i0116\"]") 
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]")
	WebElement uclick;
	
	@FindBy(xpath="//input[@type=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//input[@value=\"Sign in\"]")
	WebElement pclick;
	
	@FindBy(xpath="//*[@id=\"KmsiCheckboxField\"]")
	WebElement wait;
	
	@FindBy(xpath="//*[@id=\"idSIButton9\"]")
	WebElement nclick;
	
	public void setusername() throws InterruptedException {	
		Thread.sleep(10000);
		String s="2304127@cognizant.com";
		try {
		driver.findElement((By.xpath("//input[@id=\"i0116\"]"))).sendKeys(s);
		//username.sendKeys(s);
		uclick.click();
		}catch(Exception e) {}	   
	}
	
	public void setpassword() {
		String p=DriverSetup.pass;
		try {
				password.sendKeys(p);
				pclick.click();
			}catch(Exception e) {}  
	}

	public void setapproval() {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("wait")));
		    WebElement d = driver.findElement(By.xpath("nclick"));
		    d.click();
		    }
			catch (Exception e) {}    
	}
	
	
	
	
	
	
	
	
	

}
