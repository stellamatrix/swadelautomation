package Tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Utility.Utility;
import basecontainers.basecontainers;
import pages.reviewpage;

public class reviewmodule extends basecontainers{
	Utility utils = new Utility();
	
	@Test(priority=2)
	public void productreview() throws IOException, InterruptedException {
		reviewpage rev = new reviewpage();
		
		
			rev.clicklaurenamajorelleproduct();
			Thread.sleep(2000);
			rev.clickreviewsbutton();
			Thread.sleep(2000);
			rev.clickfirststarbutton();
			Thread.sleep(2000);
			rev.clicksecondstarbutton();
			Thread.sleep(2000);
			rev.clickthirdstarbutton();
			Thread.sleep(2000);
			rev.clickfourthstarbutton();
			Thread.sleep(2000);
			rev.clickfifthstarbutton();
			Thread.sleep(2000);
			rev.clickreviewfield();
			Thread.sleep(2000);
			rev.typeinreviewfield("comment");
			Thread.sleep(2000);
			rev.typeincustomernamefield("customername");
			Thread.sleep(2000);
			rev.typeincustomeremailfield("customeremail");
			Thread.sleep(2000);
			rev.clickcheckbox();
			Thread.sleep(2000);
			rev.clicksubmitbutton();
			Thread.sleep(2000);
			
		
			
		}
		
		
		
		@Test(priority=1)
		public void emptyratings() throws IOException, InterruptedException {
			reviewpage rev = new reviewpage();
			
			
			rev.clicklaurenamajorelleproduct();
			Thread.sleep(2000);
			rev.clickreviewsbutton();
			Thread.sleep(2000);
			rev.clickreviewfield();
			Thread.sleep(2000);
			rev.typeinreviewfield("comment");
			Thread.sleep(2000);
			rev.typeincustomernamefield("customername");
			Thread.sleep(2000);
			rev.typeincustomeremailfield("customeremail");
			Thread.sleep(2000);
			rev.clickcheckbox();
			Thread.sleep(2000);
			rev.clicksubmitbutton();
			Thread.sleep(2000);
			
		}
		
		
		
		@Test(priority=0)
		public void emptyreviewfield() throws IOException, InterruptedException {
			reviewpage rev = new reviewpage();
			
			rev.clicklaurenamajorelleproduct();
			Thread.sleep(2000);
			rev.clickreviewsbutton();
			Thread.sleep(2000);
			rev.clickfirststarbutton();
			Thread.sleep(2000);
			rev.clicksecondstarbutton();
			Thread.sleep(2000);
			rev.clickthirdstarbutton();
			Thread.sleep(2000);
			rev.clickfourthstarbutton();
			Thread.sleep(2000);
			rev.clickfifthstarbutton();
			Thread.sleep(2000);
			rev.clickreviewfield();
			Thread.sleep(2000);
			rev.typeinreviewfield("comment");
			Thread.sleep(2000);
			rev.emptyreviewfield();
			Thread.sleep(2000);
			rev.typeincustomernamefield("customername");
			Thread.sleep(2000);
			rev.typeincustomeremailfield("customeremail");
			Thread.sleep(2000);
			rev.clickcheckbox();
			Thread.sleep(2000);
			rev.clicksubmitbutton();
			Thread.sleep(5000);
			
		}
		
		
		
		@Test(priority=3)
		public void productreviewwithoutemail() throws IOException, InterruptedException {
			reviewpage rev = new reviewpage();
			
			
				rev.clicklaurenamajorelleproduct();
				Thread.sleep(2000);
				rev.clickreviewsbutton();
				Thread.sleep(2000);
				rev.clickfirststarbutton();
				Thread.sleep(2000);
				rev.clicksecondstarbutton();
				Thread.sleep(2000);
				rev.clickthirdstarbutton();
				Thread.sleep(2000);
				rev.clickfourthstarbutton();
				Thread.sleep(2000);
				rev.clickfifthstarbutton();
				Thread.sleep(2000);
				rev.clickreviewfield();
				Thread.sleep(2000);
				rev.typeinreviewfield("comment");
				Thread.sleep(2000);
				rev.typeincustomernamefield("customername");
				Thread.sleep(2000);
				rev.clickcheckbox();
				Thread.sleep(2000);
				rev.clicksubmitbutton();
				Thread.sleep(5000);
				
			
				
			}

}
