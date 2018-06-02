package com.qa.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage_Postlogin;
import com.qa.pages.HomePage_Prelogin;
import com.qa.pages.RegistrationPage;

public class HomePage_PostLoginTest extends TestBase {

	public HomePage_PostLoginTest() throws IOException {
		super();
	}
	
	HomePage_Postlogin h_postlogin;
	HomePage_Prelogin h_prelogin;
	RegistrationPage r_page;
	
	@Test(priority=1)
	public void verify_url_HomePagePostlogin(){
		String url= h_postlogin.CurrentURL();
		Assert.assertEquals(prop.getProperty("HomePage_Postlogin_url"), url);
	}
	
	@Test(priority=2)
	public void verify_HomePageTitle_Postlogin(){
		String Page_Title = h_postlogin.PageTitle();
		Assert.assertEquals(prop.getProperty("HomePage_Postlogin_url_title"), Page_Title);
	}
	
	@Test(priority=3)
	public void MyAccount_display(){
		Boolean flag = h_postlogin.MyAccount_Displayed();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=4)
	public void signOut() throws IOException{
		h_prelogin = h_postlogin.SignOut();
	}

}
