package basecontainers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Utility.Utility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class basecontainers {

	public static WebDriver driver;
	public static String browser;
	public static Properties config = new Properties();
	public static Properties OR = new Properties();
	public static Properties datasaver = new Properties();
	public static FileInputStream fis;
	String projectlocation = System.getProperty("user.dir");
	Utility utils = new Utility();
	
	
	@BeforeTest
	public void setup() throws IOException {
		if(driver==null) {
				try {
					fis = new FileInputStream(projectlocation+"\\src\\test\\resources\\propertyfile\\config.properties");
				} catch(FileNotFoundException e) {
					e.printStackTrace();
				}
				
				try {
					config.load(fis);
				} catch(FileNotFoundException f) {
					f.printStackTrace();
				}
				
				
				
				try {
					fis = new FileInputStream(projectlocation+"\\src\\test\\resources\\propertyfile\\OR.properties");
				} catch(FileNotFoundException j) {
					j.printStackTrace();
				}
				
				try {
					OR.load(fis);
				} catch(FileNotFoundException k) {
					k.printStackTrace();
				}
				
				
				try {
					fis = new FileInputStream(projectlocation+"\\src\\test\\resources\\propertyfile\\datasaver.properties");
				} catch(FileNotFoundException r) {
					r.printStackTrace();
				}
				
				try {
					datasaver.load(fis);
				} catch(FileNotFoundException g) {
					g.printStackTrace();
				}
			}
		
		
		
		if(config.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(config.getProperty("baseurl"));
			driver.manage().window().maximize();
		}
		
		
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
}
