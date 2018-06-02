package com.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage_Postlogin;
import com.qa.pages.HomePage_Prelogin;
import com.qa.pages.RegistrationPage;

public class RegistrationTest extends TestBase{
	
	public RegistrationTest() throws IOException {
		super();
	}
	
	HomePage_Postlogin h_postlogin;
	HomePage_Prelogin h_prelogin;
	RegistrationPage r_page;
	
	
	/*public void initialization() throws IOException{
	 initialization();
	 h_postlogin = new HomePage_Postlogin();
	 h_prelogin = new HomePage_Prelogin();
	 r_page = new RegistrationPage();
	 r_page = h_prelogin.signup();
	 }*/
	
	
	@Test(priority=1)
	public void verify_url_RegistrationPage() throws IOException, InterruptedException{
		r_page = new RegistrationPage();
		String url= r_page.CurrentURL();
		Thread.sleep(5000);
		System.out.println("Registration page url is"+url);
		Assert.assertEquals(prop.getProperty("RegistrationPage_url"), url);
	}
	
	@Test(priority=2)
	public void verify_RegistrationPageTitle(){
		String Page_Title = r_page.PageTitle();
		Assert.assertEquals(prop.getProperty("RegistrationPage_Title"), Page_Title);
	}
	
	@Test(priority=3)
	public void SignupMessage_Display(){
		Boolean flag= r_page.signupMessage();
		Assert.assertTrue(flag);
	}
	
		@Test(priority=4)
		public void Fill_SignUpForm() throws IOException{
			h_postlogin= r_page.signUpForm("dilshad", "jafri", "abc@gmail.com", "Test@123", "Test@123");
		}	

		/*@AfterSuite
		public void tearDown(){
			driver.quit();
		}*/
}
