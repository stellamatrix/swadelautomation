package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;
import basecontainers.basecontainers;

public class reviewpage extends basecontainers{

	Utility utils = new Utility();
	
	String productimage = OR.getProperty("productimage");
	String productimage2 = OR.getProperty("productimage2");
	String productimage3 = OR.getProperty("productimage3");
	String reviewsbutton = OR.getProperty("reviewsbutton");
	String fivestars = OR.getProperty("fivestars");
	String fourstars = OR.getProperty("fourstars");
	String threestars = OR.getProperty("threestars");
	String twostars = OR.getProperty("twostars");
	String onestar = OR.getProperty("onestar");
	String reviewsfield = OR.getProperty("commentfield");
	String customernamefield = OR.getProperty("customernamefield");
	String customeremailfield = OR.getProperty("customeremailfield");
	String checkbox = OR.getProperty("checkbox");
	String submitreviewbutton = OR.getProperty("submitrevbutton");
	
	
	
			public void ReviewsPage(WebDriver driver) {
				basecontainers.driver = driver;
				PageFactory.initElements(basecontainers.driver, this);
			}
			
			public void clicklaurenamajorelleproduct() {
			    driver.findElement(By.cssSelector(productimage)).click();
			}
			
			public void clickthetruckerproduct() {
				driver.findElement(By.cssSelector(productimage2)).click();
			}
			
			public void clickqueenanatocrestproduct() {
				driver.findElement(By.cssSelector(productimage3)).click();
			}
			
			public void clickreviewsbutton() {
		        driver.findElement(By.id(reviewsbutton)).click();
			}
			
			public void clickfifthstarbutton() {
				driver.findElement(By.cssSelector(fivestars)).click();
			}
				
			
			
		    public void clickfourthstarbutton() {
		    	driver.findElement(By.cssSelector(fourstars)).click();
			}
		    
		    
			
		    public void clickthirdstarbutton() {
		    	driver.findElement(By.cssSelector(threestars)).click();
			}
		        
		    
		    
		    public void clicksecondstarbutton() {
		    	driver.findElement(By.cssSelector(twostars)).click();
			}
		    
		    
		    
		    public void clickfirststarbutton() {
				driver.findElement(By.cssSelector(onestar)).click();
			}
		   
		
		    
			public void clickreviewfield() {
				driver.findElement(By.id(reviewsfield)).click();
			}
			
		
			
			public void typeinreviewfield(String key) throws IOException {
				driver.findElement(By.id(reviewsfield)).sendKeys(utils.datafetcher(key));
			}
			public void emptyreviewfield() {
				driver.findElement(By.id(reviewsfield)).clear();
			}	
			
			
			
			public void clickcustomernamefield() {
				driver.findElement(By.id(customernamefield)).click();
			}
			
			public void typeincustomernamefield(String key) throws IOException {
				driver.findElement(By.id(customernamefield)).sendKeys(utils.datafetcher(key));
			}
			
			
			public void clickcustomeremailfield() {
				driver.findElement(By.id(customeremailfield)).click();
			}
			
			public void typeincustomeremailfield(String key) throws IOException {
				driver.findElement(By.id(customeremailfield)).sendKeys(utils.datafetcher(key));
			}
			
			public void clickcheckbox() {
				driver.findElement(By.name(checkbox)).click();
			}
			
			public void clicksubmitbutton() {
				driver.findElement(By.name(submitreviewbutton)).click();
			}
		    
    
    
}
