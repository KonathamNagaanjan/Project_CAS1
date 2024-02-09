package pageobjects;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;
//import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.junit.Assert;

import Utilities.Excel2;
//import dev.failsafe.internal.util.Assert;

public class Acronyms_page{/* extends BasePage {
	public Acronyms_page(WebDriver driver) {
		super(driver);
	}*/
	@FindBy(xpath="//tbody/tr")
	List<WebElement> tot;
	public static String file = System.getProperty("user.dir")+"/src/test/resources/testdata/data3.xlsx";
	public static WebDriver driver;
	
	@FindBy(xpath="//div[@id=\"title_text\"]")
	WebElement title_verify;
	
	public void title_validation() {
		String text1 = title_verify.getText();
		Assert.assertEquals("Acronyms",text1);	
	}
	
	    
	
	//sc3
	public void Excel_print() throws IOException  {
		//List <WebElement> res =driver.findElements(By.xpath("//tr//td"));
      //  for(int i=0;i<res.size();i++) {
    			//System.out.println(res.get(i).getText());
		int rowCount=driver.findElements(By.tagName("tr")).size();
		int colCount=driver.findElements(By.tagName("col")).size();
		
		System.out.println("rowCount :" +rowCount);
		System.out.println("colCount :" +colCount);
		
		
		//for(WebElement tableData:driver.findElements(By.tagName("tr"))) {
			//System.out.println(tableData.getText());
		List<WebElement> total = tot;
		for(int i=1;i<=total.size();i++) {
			String column1 = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[1]")).getText();
			String column2 = driver.findElement(By.xpath("//tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(column1+"  "+column2);
			Excel2.setCellData(file,"Sheet1", i-1, 0, column1);
			Excel2.setCellData(file,"Sheet1", i-1, 1, column2);   
	}
	}


}
