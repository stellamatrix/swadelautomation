package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.Utility;
import basecontainers.basecontainers;
import pages.signuppage;

public class signupmodule extends basecontainers{
	Utility utils = new Utility();

	@Test(priority=0)
	public void valigsignup() throws IOException, InterruptedException {
		signuppage sign = new signuppage();
		
			sign.clickAvatarIcon();
			Thread.sleep(2000);
			sign.clickregemailfield();
			Thread.sleep(2000);
			sign.typeinregemailfield("email");
			Thread.sleep(2000);
			sign.clickregisterbutton();
			Thread.sleep(2000);
		}
		
		@Test(priority=1)
		public void signupwithemptyemailfield() throws IOException, InterruptedException {
			signuppage sign = new signuppage();
			
			sign.clickAvatarIcon();
			Thread.sleep(2000);
			sign.clickregemailfield();
			Thread.sleep(2000);
			sign.typeinregemailfield("email");
			Thread.sleep(2000);
			sign.clearregemailfield();
			Thread.sleep(2000);
			sign.clickregisterbutton();
			Thread.sleep(2000);
		}
		
		
		@Test(priority=2)
		public void invalidemail() throws IOException, InterruptedException {
			signuppage sign = new signuppage();
			
			sign.clickAvatarIcon();
			Thread.sleep(2000);
			sign.clickregemailfield();
			Thread.sleep(2000);
			sign.typeinregemailfield("invregemail");
			Thread.sleep(2000);
			sign.clickregisterbutton();
			Thread.sleep(2000);
		}

	
}
