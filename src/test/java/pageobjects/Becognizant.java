package pageobjects;

import java.io.IOException;
import java.util.List;

//import org.apache.logging.log4j.core.util.Assert;
//import static org.junit.Assert;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.Excel2;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;

public class Becognizant{ /*extends BasePage{
	public Becognizant(WebDriver driver) {
		super(driver);
	}*/
	
	@FindBy(xpath="//*[text()=\"be.cognizant\"]") 
	WebElement page_val;
	
	@FindBy(xpath="//*[@class=\"_8ZYZKvxC8bvw1xgQGSkvvA==\"]\"")
	WebElement profile_click;
	
	@FindBy(xpath="//div[@id='mectrl_currentAccount_secondary']")
	WebElement userid;
	
	@FindBy(xpath="//div[@id=\\\"mectrl_headerPicture\\\"]")
	WebElement profile_close;
	
	@FindBy(xpath="//span[contains(text(),'Company')]")
	WebElement dropdown;
	
	@FindBy(xpath="//span[contains(text(),'Acronyms')]")
	WebElement acronym_select;
	
	
	
	public void page_validation() throws InterruptedException {
		Thread.sleep(5000);
		  String value = page_val.getText();
		  Assert.assertEquals("be.cognizant", value);   
	}
	
	public void user_validation() throws InterruptedException {
		//Thread.sleep(5000);
		profile_click.click();
		String value2 = userid.getText();
		Assert.assertEquals("2304127@cognizant.com", value2);
        profile_close.click();
	}
	
	//sc2
	public void dropdown_click() {
		dropdown.click();   
	}

	public void select_acronym() {
		acronym_select.click();    
	}
	
	


}
