package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.Utility;
import basecontainers.basecontainers;
import pages.loginpage;

public class loginmodule extends basecontainers{
	Utility utils = new Utility();
	
	@Test(priority=3)
	public void validlogin() throws IOException, InterruptedException {
		loginpage login = new loginpage();
		
		
		login.clickAvatarIcon();
		Thread.sleep(5000);
		login.clickemailfield();
		Thread.sleep(5000);
		login.typeinemailfield("email");
		Thread.sleep(5000);
		login.clickpasswordfield();
		Thread.sleep(5000);
		login.typeinpasswordfield("password");
		Thread.sleep(5000);
		login.clickloginbutton();
		
	}
	
	
	
	
	@Test(priority=2)
	public void ivalidlogin() throws IOException, InterruptedException {
		loginpage login = new loginpage();
		
		
		login.clickAvatarIcon();
		Thread.sleep(5000);
		login.clickemailfield();
		Thread.sleep(5000);
		login.typeinemailfield("invemail");
		Thread.sleep(5000);
		login.clickpasswordfield();
		Thread.sleep(5000);
		login.typeinpasswordfield("invpassword");
		Thread.sleep(5000);
		login.clickloginbutton();
		
	}
	
	
	
	
	@Test(priority=1)
	public void validemailinvalidpassword() throws IOException, InterruptedException {
		loginpage login = new loginpage();
		
		
		login.clickAvatarIcon();
		Thread.sleep(5000);
		login.clickemailfield();
		Thread.sleep(5000);
		login.typeinemailfield("email");
		Thread.sleep(5000);
		login.clickpasswordfield();
		Thread.sleep(5000);
		login.typeinpasswordfield("invpassword");
		Thread.sleep(5000);
		login.clickloginbutton();
		
	}
	
	
	
	@Test(priority=0)
	public void invalidemailvalidpassword() throws IOException, InterruptedException {
		loginpage login = new loginpage();
		
		
		login.clickAvatarIcon();
		Thread.sleep(5000);
		login.clickemailfield();
		Thread.sleep(5000);
		login.typeinemailfield("invemail");
		Thread.sleep(5000);
		login.clickpasswordfield();
		Thread.sleep(5000);
		login.typeinpasswordfield("password");
		Thread.sleep(5000);
		login.clickloginbutton();
		
	}
	
	
	@Test(priority=4)
	public void emptyloginfields() throws IOException, InterruptedException {
		loginpage login = new loginpage();
		
		
		login.clickAvatarIcon();
		Thread.sleep(5000);
		login.clickemailfield();
		Thread.sleep(5000);
		login.clickpasswordfield();
		Thread.sleep(5000);
		login.clickloginbutton();
		Thread.sleep(2000);
		
	}

}
