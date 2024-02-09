package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.Acronyms_page;
import pageobjects.Becognizant;
import pageobjects.loginvalidation;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import Utilities.DriverSetup;
import Utilities.Excel;
//import dev.failsafe.internal.util.Assert;

import org.openqa.selenium.WebDriver;
//import java.io.File;
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
//import java.io.File;
//import java.io.IOException;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import Utilities.*;


public  class stepdefination extends DriverSetup {
	//loginvalidation lv=new loginvalidation(driver);
	public static loginvalidation login = new loginvalidation() ;
	Becognizant page;
	Acronyms_page page2;
	public static WebDriver driver;
	Properties p;
	FileReader reader;
	String file = System.getProperty("user.dir")+"/src/test/resources/testdata/data3.xlsx";
	By totalrows = By.xpath("//tbody/tr");
	//public static driver = DriverSetup.getWebDriver();	
	
	
	//sc1
	@Given("user is on the becognizant site")
	public void user_is_on_the_becognizant_site() throws IOException {
		driver = DriverSetup.getWebDriver();	
	}
	
	@When("user login into site with valid credentials username")
	public void user_login_into_site_with_valid_credentials_username() throws InterruptedException {	
//		String s=DriverSetup.username;
//		try {
//		driver.findElement((By.xpath("//input[@id=\"i0116\"]"))).sendKeys(s);
//		driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]")).click();
//		}catch(Exception e) {}	   
		
		login.setusername();
	}
	
	@When("user login into site with valid credentials password")
	public void user_login_into_site_with_valid_credentials_password() {
//		String p=DriverSetup.pass;
//		try {
//				driver.findElement((By.xpath("//input[@type=\"password\"]"))).sendKeys(p);
//				driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
//			}catch(Exception e) {}  
		login.setpassword();
	}

	@When("user requested to authenticate the site for approval")
	public void user_requested_to_authenticate_the_site_for_approval() {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"KmsiCheckboxField\"]")));
//		    WebElement d = driver.findElement(By.xpath("//*[@id=\"idSIButton9\"]"));
//		    d.click();
//		    }
//			catch (Exception e) {}  
		login.setapproval();
	}

	@Then("user is logined to the site")
	public void user_is_logined_to_the_site() throws InterruptedException {
//		Thread.sleep(5000);
//		  String value = driver.findElement(By.xpath("//*[text()=\"be.cognizant\"]")).getText();
//		  Assert.assertEquals("be.cognizant", value);   
		page.page_validation();
	}
	
	@Then("User need to verify the profile name")
	public void user_need_to_verify_the_profile_name() throws InterruptedException {
		//Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@class=\"_8ZYZKvxC8bvw1xgQGSkvvA==\"]")).click();
//		String value2 = driver.findElement(By.xpath("//div[@id='mectrl_currentAccount_secondary']")).getText();
//		Assert.assertEquals("2304127@cognizant.com", value2);
//		driver.findElement(By.xpath("//div[@id=\"mectrl_headerPicture\"]")).click();
		page.user_validation();
	}
	
	//sc2
	@When("user user clicks on the company dropdown list")
	public void user_user_clicks_on_the_company_dropdown_list() {
		//driver.findElement(By.xpath("//span[contains(text(),'Company')]")).click();   
		page.dropdown_click();
	}

	@Then("user need to select the Acronyms")
	public void user_need_to_select_the_acronyms() {
		page.select_acronym();
		//driver.findElement(By.xpath("//span[contains(text(),'Acronyms')]")).click();
		
	}
	
	@Then("user need verify the title of redirected")
	public void user_need_verify_the_title_of_redirected() {
		page2.title_validation();
//		String text1 = driver.findElement(By.xpath("//div[@id=\"title_text\"]")).getText();
//		Assert.assertEquals("Acronyms", text1);	
		
	}
	
	    
	
	//sc3
	@Given("user need identify and print acronyms")
	public void user_need_identify_and_print_acronyms() throws IOException  {
		page2.Excel_print();
		//List <WebElement> res =driver.findElements(By.xpath("//tr//td"));
      //  for(int i=0;i<res.size();i++) {
    			//System.out.println(res.get(i).getText());
//		int rowCount=driver.findElements(By.tagName("tr")).size();
//		int colCount=driver.findElements(By.tagName("col")).size();
//		
//		System.out.println("rowCount :" +rowCount);
//		System.out.println("colCount :" +colCount);
//		
//		
//		//for(WebElement tableData:driver.findElements(By.tagName("tr"))) {
//			//System.out.println(tableData.getText());
//		List<WebElement> total = driver.findElements(totalrows);
//		for(int i=1;i<=total.size();i++) {
//			String column1 = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText();
//			String column2 = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText();
//			System.out.println(column1+"  "+column2);
//			Excel.setCellData(file,"Sheet1", i-1, 0, column1);
//			Excel.setCellData(file,"Sheet1", i-1, 1, column2);   
//	}
	}


	
	@Then("user need to snippet the complete acronyms")
	public void user_need_to_snippet_the_complete_acronyms()  {
		//File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(src, new File("C:\\Users\\2304127\\eclipse-workspace\\testing\\screenshot\\page.png"));
		//Shutterbug.shootPage(driver, Capture.FULL, true).save("C:\\Users\\2304127\\eclipse-workspace\\testing\\screenshot\\page.png");
		/*int i=1;
		while(i<=244) {
			
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement acro=driver.findElement(By.xpath("//tr["+i+"]"));
		js.executeScript("arguments[0].scrollIntoView();",acro);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\2304127\\eclipse-workspace\\testing\\screenshot\\Acronym"+i+".png");
		FileUtils.copyFile(src,trg);
		i=i+9;
		}*/
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		//Screenshot screenshot = new AShot()
				//.shootingStrategy(ShootingStrategies.viewportPasting(scrollTimeout: 100))
				//.takeScreenshot(driver);
		//ImageIO.write(screenshot.getImage(), /*formatName:*/"jpg", new File(/*pathname:*/"./fullimage.jpg"));
		//driver.findElement(By.xpath("//i[contains(text(),'')]")).click();
		
		//Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(screenshot.getImage(), "png", new File(System.getProperty("user.dir")+"\\screenshot2\\fullpagescreenshot.png"));
		
		/*TakesScreenshot ts=(TakesScreenshot)driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File trg=new File("C:\\Users\\2304127\\eclipse-workspace\\testing\\screenshot\\page1.png");
        
        FileUtils.copyFile(src,trg);
        System.out.println("screenshot captured");*/
		/*WebElement element= driver.findElement(By.tagName("tr"));
		int x =element.getLocation().getX();
		int y =element.getLocation().getY();
		int width = element.getSize().getWidth();
		int height = element.getSize().getHeight();
		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			File croppedScreenshot = new File("C:\\Users\\2304127\\eclipse-workspace\\testing\\screenshot\\fim.png");
			
			FileUtils.copyFile(screenshotFile, croppedScreenshot);
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
		}*/
		
		
	

		
				
	}
}