package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;
import basecontainers.basecontainers;

public class loginpage extends basecontainers{
   Utility utils = new Utility();
   
   String homepageAvatarIcon = OR.getProperty("AvatarIcon");
   String emailfield = OR.getProperty("emailfield");
   String passwordfield = OR.getProperty("passwordfield");
   String loginbutton = OR.getProperty("loginbutton");
   
   public void LoginPage(WebDriver driver) {
	basecontainers.driver = driver;
	PageFactory.initElements(basecontainers.driver, this);
   }
   
   
		   public void clickAvatarIcon() {
			   driver.findElement(By.cssSelector(homepageAvatarIcon)).click(); 
		   }
		   
		   public void clickemailfield() {
			  driver.findElement(By.id(emailfield)).click();
		   }
		   
		   
		   public void typeinemailfield(String key) throws IOException {
			WebElement  emailbox =  driver.findElement(By.id(emailfield));
			emailbox.sendKeys(utils.datafetcher(key));
		   }
		   
		   
		   public void clearemailfield() {
			   driver.findElement(By.id(emailfield)).clear();
		   }
		   
		   
		   public void clickpasswordfield() {
			   driver.findElement(By.id(passwordfield)).click();
		   }
		   
		   
		   public void typeinpasswordfield(String key) throws IOException {
			 WebElement passwordbox = driver.findElement(By.id(passwordfield));
			 passwordbox.sendKeys(utils.datafetcher(key));
		   }
		   
		   public void clearpasswordfield() {
			   driver.findElement(By.id(passwordfield)).clear();
		   }
		   
		   public void clickloginbutton() {
			   driver.findElement(By.name(loginbutton)).click();
		   }
		   
		   
   
	
}
