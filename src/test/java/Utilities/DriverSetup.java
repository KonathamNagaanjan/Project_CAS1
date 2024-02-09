package Utilities;

//public class DriverSetup {
	//package utilities;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	//import org.openqa.selenium.chrome.ChromeDriver;
	//import org.testing.annotations.Test;

	public class DriverSetup {
		static Properties p;
		public static String username;
		public static String pass;
		
		public static WebDriver driver;
		public static WebDriver getWebDriver() throws IOException {
			
			
		Properties prop = new Properties();
		File file = new File("config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		String baseurl = prop.getProperty("url");
		 username = prop.getProperty("user_name");
		  pass=prop.getProperty("password");
		 
		///////////////
		//String browserName = "chrome";
		 WebDriver driver = null;
		 
		 if(browserName.equalsIgnoreCase("chrome")) {
			 driver = new ChromeDriver();
		 }
		 
		 else if(browserName.equalsIgnoreCase("edge")) {
			 driver = new EdgeDriver();	 
		 }
		 else if (browserName.equalsIgnoreCase("Firefox"))
		 {
			 driver = new FirefoxDriver();
		 }
		 
		 else {
			 System.out.println("provide a valid browser");
		 }
		
		//WebDriver driver=new ChromeDriver();
		//String baseurl = prop.getProperty("url");
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		
		}
		
	/*	public static Properties getproperties() throws IOException {
			FileReader file = new FileReader(System.getProperty("user.dir") + "config.properties");
			p = new Properties();
			p.load(file);
			return p;
		}*/
		
		public static WebDriver getdriver() {
			return driver;
		}
		

	}


