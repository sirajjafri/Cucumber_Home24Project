package com.qa.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import com.qa.base.TestBase;
import com.qa.pages.HomePage_Postlogin;
import com.qa.pages.HomePage_Prelogin;
import com.qa.pages.RegistrationPage;

public class HomePage_PreloginTest extends TestBase {

	public HomePage_PreloginTest() throws IOException {
		super();
	}
	HomePage_Postlogin h_postlogin;
	HomePage_Prelogin h_prelogin;
	RegistrationPage r_page;
	
	@BeforeSuite
	public void initializationNew() throws IOException, InterruptedException{
	 initialization();
	 h_prelogin = new HomePage_Prelogin();
	 r_page = new RegistrationPage();
	 h_postlogin= new HomePage_Postlogin();
	 }
	
	// Title of the prelogin home page
		@Test(priority=1)
		public void HomePage_Prelogin1(){
			String title_prelogin= h_prelogin.page_title();
			Assert.assertEquals(prop.getProperty("prelogin_page_title"), title_prelogin);
		}
		@Test(priority=2)
		public void homePage_LogoDisplayed(){
			boolean logo1= h_prelogin.logo_displayed();
			Assert.assertTrue(logo1, "Home page logo not displayed at prelogin screen");
		}
		
		/*@Test(priority=3)
		public void AlertPopopupAcceptAccept(){
			System.out.println(alert.ge);
			h_prelogin.AlertPopUpAccept();
			
		}*/
		
		@Test(priority=3)
		public void click_Sugnup_at_LoginScren() throws IOException, InterruptedException{
			
			r_page = h_prelogin.signup();
		}

		@AfterSuite
		public void tearDown(){
			driver.quit();
		}

}
