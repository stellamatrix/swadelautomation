package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.Utility;
import basecontainers.basecontainers;
import pages.productorderpage;

public class productordertest extends basecontainers{
	Utility utils = new Utility();

	@Test(priority=2)
	public void validproductorder() throws InterruptedException, IOException {
		productorderpage order = new productorderpage();
		 
		
			order.clickproductimage();
			Thread.sleep(2000);
			order.clickaddtocart();
			Thread.sleep(1000);
			order.clickviewcart();
			Thread.sleep(1000);
			order.clickplussign();
			Thread.sleep(1000);
			order.clickproceedtocheckout();
			Thread.sleep(2000);
			order.clickherelogin();
			Thread.sleep(2000);
			order.clickemailfield();
			Thread.sleep(2000);
			order.typeinemailfield("email");
			Thread.sleep(2000);
			order.clickpasswordfield();
			Thread.sleep(2000);
			order.typeinpasswordfield("password");
			Thread.sleep(2000);
			order.clickloginbutton();
			Thread.sleep(2000);
			order.clickfirstnamefield();
			Thread.sleep(2000);
			order.clearfirstnamefield();
			Thread.sleep(5000);
			order.typeinfirstnamefield("firstname");
			Thread.sleep(2000);
			order.clicklastnamefield();
			Thread.sleep(2000);
			order.clearlastnamefield();
			Thread.sleep(2000);
			order.typeinlastnamefield("lastname");
			Thread.sleep(2000);
			order.clickcompanynamefield();
			Thread.sleep(2000);
			order.clearcompanynamefield();
			Thread.sleep(2000);
			order.typeincompanynamefield("companyname");
			Thread.sleep(2000);
			order.clickaddressfield();
			Thread.sleep(2000);
			order.clearaddressfield();
			Thread.sleep(2000);
			order.typeinaddressfield("streetaddress");
			Thread.sleep(2000);
			order.clickapartmentfield();
			Thread.sleep(2000);
			order.clearapartmentfield();
			Thread.sleep(2000);
			order.typeinapartmentfield("apartment");
			Thread.sleep(2000);
			order.clicktownfield();
			Thread.sleep(2000);
			order.cleartownfield();
			Thread.sleep(2000);
			order.typeintownfield("town");
			Thread.sleep(2000);
			order.clickphonofield();
			Thread.sleep(2000);
			order.clearphonofield();
			Thread.sleep(2000);
			order.typeinphonofield("phoneno");
			Thread.sleep(2000);
			order.clickbillingemailfield();
			Thread.sleep(2000);
			order.clearbillingemailfield();
			Thread.sleep(2000);
			order.typeinbillingemailfield("email");
			Thread.sleep(2000);
			order.clickordernotefield();
			Thread.sleep(2000);
			order.clearordernotefield();
			Thread.sleep(2000);
			order.typeinordernotefield("ordernote");
			Thread.sleep(2000);
			order.clickcashondeliverycheckbox();
			Thread.sleep(2000);
			order.clickplaceorderbutton();
			Thread.sleep(5000);
			
			
	}
	
	
	
	
	
	@Test(priority=1)
	public void productorderwithinvalidlogin() throws InterruptedException, IOException {
		productorderpage order = new productorderpage();
		 
		
			order.clickproductimage();
			Thread.sleep(2000);
			order.clickaddtocart();
			Thread.sleep(1000);
			order.clickviewcart();
			Thread.sleep(1000);
			order.clickplussign();
			Thread.sleep(1000);
			order.clickproceedtocheckout();
			Thread.sleep(5000);
			order.clickherelogin();
			Thread.sleep(2000);
			order.clickemailfield();
			Thread.sleep(2000);
			order.typeinemailfield("invemail");
			Thread.sleep(2000);
			order.clickpasswordfield();
			Thread.sleep(2000);
			order.typeinpasswordfield("password");
			Thread.sleep(2000);
			order.clickloginbutton();
			Thread.sleep(5000);
			
			
		
		
		
	}
	
	@Test(priority=0)
	public void productorderwithemptybillinginfo() throws InterruptedException, IOException {
		productorderpage order = new productorderpage();
		
		
		
			order.clickproductimage();
			Thread.sleep(2000);
			order.clickaddtocart();
			Thread.sleep(1000);
			order.clickviewcart();
			Thread.sleep(1000);
			order.clickplussign();
			Thread.sleep(1000);
			order.clickproceedtocheckout();
			Thread.sleep(2000);
			order.clickherelogin();
			Thread.sleep(2000);
			order.clickemailfield();
			Thread.sleep(2000);
			order.typeinemailfield("email");
			Thread.sleep(2000);
			order.clickpasswordfield();
			Thread.sleep(2000);
			order.typeinpasswordfield("password");
			Thread.sleep(2000);
			order.clickloginbutton();
			Thread.sleep(3000);
			order.clickfirstnamefield();
			Thread.sleep(2000);
			order.clearfirstnamefield();
			Thread.sleep(5000);
			order.clicklastnamefield();
			Thread.sleep(2000);
			order.clearlastnamefield();
			Thread.sleep(2000);
			order.clickcompanynamefield();
			Thread.sleep(2000);
			order.clearcompanynamefield();
			Thread.sleep(2000);
			order.clickaddressfield();
			Thread.sleep(2000);
			order.clearaddressfield();
			Thread.sleep(2000);
			order.clickapartmentfield();
			Thread.sleep(2000);
			order.clearapartmentfield();
			Thread.sleep(2000);
			order.clicktownfield();
			Thread.sleep(2000);
			order.cleartownfield();
			Thread.sleep(2000);
			order.clickphonofield();
			Thread.sleep(2000);
			order.clearphonofield();
			Thread.sleep(2000);
			order.clickbillingemailfield();
			Thread.sleep(2000);
			order.clearbillingemailfield();
			Thread.sleep(2000);
			order.typeinbillingemailfield("email");
			Thread.sleep(2000);
			order.clickordernotefield();
			Thread.sleep(2000);
			order.clearordernotefield();
			Thread.sleep(2000);
			order.typeinordernotefield("ordernote");
			Thread.sleep(2000);
			order.clickcashondeliverycheckbox();
			Thread.sleep(2000);
			order.clickplaceorderbutton();
			Thread.sleep(5000);
		
		
	}
	
	
	
}
