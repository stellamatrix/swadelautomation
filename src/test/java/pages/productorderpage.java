package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utility.Utility;
import basecontainers.basecontainers;

public class productorderpage extends basecontainers{
	
	Utility utils = new Utility();

		String  luarenaproduct = OR.getProperty("productimage");
		String  addtocart = OR.getProperty("addtocartbutton");
		String  viewcart = OR.getProperty("viewcartbutton");
		String  plussign = OR.getProperty("Plussign");
		String  checkoutbutton = OR.getProperty("proceedtocheckoutbutton");
		String  clickherelogin = OR.getProperty("clickloginbutton");
		String  emailfield = OR.getProperty("emailfield");
		String  passwordfield = OR.getProperty("passwordfield");
		String  loginbutton = OR.getProperty("loginbutton");
		String  firstnamefield = OR.getProperty("firstnamefield");
		String  lastnamefield = OR.getProperty("lastnamefield");
		String  companyname = OR.getProperty("companynamefield");
		String  streetaddressfield = OR.getProperty("streetaddressfield");
		String  apartmentname = OR.getProperty("apartmentnamefield");
		String  townnamefield = OR.getProperty("townnamefield");
		String  phonenumberfield= OR.getProperty("phonenofield");
		String  billingemailfield = OR.getProperty("billingemailfield");
		String  ordernotefield= OR.getProperty("ordernotefield");
		String  flatratecheckbox = OR.getProperty("flatratecheckbox");
		String  localpickupcheckbox= OR.getProperty("localpickupcheckbox");
		String  directtransfercheckbox= OR.getProperty("directtransfercheckbox");
		String  paytbycashcheckbox= OR.getProperty("paybycashcheckbox");
		String  paybycardcheckbox= OR.getProperty("paybycardcheckbox");
		String  placeorder= OR.getProperty("placeorderbutton");
	
	
	
			
				public void OrderPage(WebDriver driver) {
					basecontainers.driver = driver;
					PageFactory.initElements(basecontainers.driver, this);
				}
				
				
				 public void clickproductimage() {
					 driver.findElement(By.cssSelector(luarenaproduct)).click();
				 }
				 
				
				 public void clickaddtocart() {
					 driver.findElement(By.cssSelector(addtocart)).click();
				 }
				 
				 public void clickviewcart() {
					 driver.findElement(By.cssSelector(viewcart)).click();
				 }
				
				 public void clickplussign() {
					 driver.findElement(By.cssSelector(plussign)).click();
				 }
				
				 
				 public void clickproceedtocheckout() {
					 driver.navigate().refresh();
					 driver.findElement(By.xpath(checkoutbutton)).click();
				 }
				 
				 
				 public void clickherelogin() {
					 driver.findElement(By.xpath(clickherelogin)).click();
				 }
				 
				 
				 public void clickemailfield() {
					  driver.findElement(By.id(emailfield)).click();
				   }
				   
				   
				 public void typeinemailfield(String key) throws IOException {
					   driver.findElement(By.id(emailfield)).sendKeys(utils.datafetcher(key));
				   }
				   
				   
				 public void clearemailfield() {
					   driver.findElement(By.id(emailfield)).clear();
				   }
				   
				   
				 public void clickpasswordfield() {
					   driver.findElement(By.id(passwordfield)).click();
				   }
				   
				   
				 public void typeinpasswordfield(String key) throws IOException {
					  driver.findElement(By.id(passwordfield)).sendKeys(utils.datafetcher(key)); 
				   }
				   
				 public void clearpasswordfield() {
					   driver.findElement(By.id(passwordfield)).clear();
				   }
				   
				 public void clickloginbutton() {
					   driver.findElement(By.name(loginbutton)).click();
				   }
				 
				 
				 
				 public void clickfirstnamefield() {
					 driver.findElement(By.id(firstnamefield)).click();
				 }
				 public void typeinfirstnamefield(String key) throws IOException {
					 driver.findElement(By.id(firstnamefield)).sendKeys(utils.datafetcher(key));
				 }
				 public void clearfirstnamefield() {
					 driver.findElement(By.id(firstnamefield)).clear();
				 }
				 
				 
				 
				 
				 public void clicklastnamefield() {
					 driver.findElement(By.id(lastnamefield)).click();
				 }
				 public void typeinlastnamefield(String key) throws IOException {
					 driver.findElement(By.id(lastnamefield)).sendKeys(utils.datafetcher(key));
				 }
				 
				 public void clearlastnamefield() {
					 driver.findElement(By.id(lastnamefield)).clear();
				 }
			
				 
				 
				 
				 public void clickcompanynamefield() {
					 driver.findElement(By.id(companyname)).click();
				 }
				 public void typeincompanynamefield(String key) throws IOException {
					 driver.findElement(By.id(companyname)).sendKeys(utils.datafetcher(key));
				 }
				 public void clearcompanynamefield() {
					 driver.findElement(By.id(companyname)).clear();
				 }
				 
				 
				 
				 
				 public void clickaddressfield() {
					driver.findElement(By.id(streetaddressfield)).click(); 
				 }
			
				 public void typeinaddressfield(String key) throws IOException {
						driver.findElement(By.id(streetaddressfield)).sendKeys(utils.datafetcher(key)); 
					 }
				 
				 public void clearaddressfield() {
						driver.findElement(By.id(streetaddressfield)).clear();
					 }
			
				 
				 
				 
				 
				 public void clickapartmentfield() {
					 driver.findElement(By.id(apartmentname)).click();
				 }
				 public void typeinapartmentfield(String key) throws IOException {
					 driver.findElement(By.id(apartmentname)).sendKeys(utils.datafetcher(key));
				 }
				 public void clearapartmentfield() {
					 driver.findElement(By.id(apartmentname)).clear();
				 }
				 
				 
				 
				 
				 public void clicktownfield() {
					 driver.findElement(By.id(townnamefield)).click();
				 }
				 public void typeintownfield(String key) throws IOException {
					 driver.findElement(By.id(townnamefield)).sendKeys(utils.datafetcher(key));
				 }
				 public void cleartownfield() {
					 driver.findElement(By.id(townnamefield)).clear();
				 }
			
			
				 
				 
				 public void clickphonofield() {
					 driver.findElement(By.id(phonenumberfield)).click();
				 }
				 public void typeinphonofield(String key) throws IOException {
					 driver.findElement(By.id(phonenumberfield)).sendKeys(utils.datafetcher(key));
				 }
				 public void clearphonofield() {
					 driver.findElement(By.id(phonenumberfield)).clear();
				 }
				 
				 
				 
				 
				 public void clickbillingemailfield() {
					 driver.findElement(By.id(billingemailfield)).click();
				 }
				 public void typeinbillingemailfield(String key) throws IOException {
					 driver.findElement(By.id(billingemailfield)).sendKeys(utils.datafetcher(key));
				 }
				 public void clearbillingemailfield() {
					 driver.findElement(By.id(billingemailfield)).clear();
				 }
				 
				 
				 
				 
				 public void clickordernotefield() {
					 driver.findElement(By.id(ordernotefield)).click();
				 }
				 public void typeinordernotefield(String key) throws IOException {
					 driver.findElement(By.id(ordernotefield)).sendKeys(utils.datafetcher(key));
				 }
				 public void clearordernotefield() {
					 driver.findElement(By.id(ordernotefield)).clear();
				 }
				 
				 
				 
				 public void clicklocalpickcheckbox() {
					 driver.findElement(By.id(localpickupcheckbox)).click();
				 }
				 
				 
				 public void clickflatratecheckbox() {
					 driver.findElement(By.id(flatratecheckbox)).click();
				 }
				 
				 
				 public void clickbanktransfercheckbox() {
					 driver.findElement(By.id(directtransfercheckbox)).click();
				 }
				 
				 
				 public void clickcashondeliverycheckbox() {
					 driver.findElement(By.xpath(paytbycashcheckbox)).click();
				 }
				 
				 
				 public void clickdebitorcreditcardcheckbox() {
					 driver.findElement(By.id(paybycardcheckbox)).click();
				 }
				 
				 
				 public void clickplaceorderbutton() {
					 driver.findElement(By.name(placeorder)).click();
				 }
		 
	 
	 
	 
}
