package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.Utility;

import basecontainers.basecontainers;
import pages.logoutpage;


public class logoutmodule extends basecontainers{
	
	Utility utils = new Utility();
	
	@Test
	public void validlogin() throws IOException, InterruptedException {
		logoutpage log = new logoutpage();
		
		
		log.clickAvatarIcon();
		Thread.sleep(5000);
		log.clickemailfield();
		Thread.sleep(5000);
		log.typeinemailfield("email");
		Thread.sleep(5000);
		log.clickpasswordfield();
		Thread.sleep(5000);
		log.typeinpasswordfield("password");
		Thread.sleep(5000);
		log.clickloginbutton();
		Thread.sleep(6000);
		log.clicklogoutbutton();
		Thread.sleep(5000);
		
		
		
	}
	
	
		

}
