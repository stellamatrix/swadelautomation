package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;
import basecontainers.basecontainers;

public class signuppage extends basecontainers{
	Utility utils = new Utility();
	
		String homepageAvatarIcon = OR.getProperty("AvatarIcon");
		String regemailfield = OR.getProperty("regemailfield");
		String registerbutton = OR.getProperty("registerbutton");
	
	
			public void SignupPage(WebDriver driver) {
			basecontainers.driver = driver;
			PageFactory.initElements(basecontainers.driver, this);
			}
	
	
			    public void clickAvatarIcon() {
			    	driver.findElement(By.cssSelector(homepageAvatarIcon)).click();
			    }
			    
			    public void clickregemailfield() {
			    	driver.findElement(By.id(regemailfield)).click();
			    }
			    
			   
			    public void typeinregemailfield(String key) throws IOException {
			    	driver.findElement(By.id(regemailfield)).sendKeys(utils.datafetcher(key));
			    }
			   
			    
			    public void clearregemailfield() {
			    	driver.findElement(By.id(regemailfield)).clear();
			    }
			    
			    public void clickregisterbutton() {
			    	driver.findElement(By.name(registerbutton)).click();
			    }
			
		
		
		
		
}
