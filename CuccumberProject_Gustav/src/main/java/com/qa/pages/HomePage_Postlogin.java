package com.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.maven.model.Build;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage_Postlogin extends TestBase {

	public HomePage_Postlogin() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "(//span[contains(text(),'Mein Konto')])[1]")
	WebElement MyAccount;
	
	@FindBy(xpath= "//a[@class='GN-myAccountStyles__link acte-header-logout-lnk']")
	WebElement signOutLink;
	
public String CurrentURL(){
		
		return driver.getCurrentUrl();
	}
	
	public String PageTitle(){
		return driver.getTitle();
	}
	
	public boolean MyAccount_Displayed(){
		return MyAccount.isDisplayed();
	}
	
	public void SignOut() throws IOException, InterruptedException{
	
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(MyAccount).build().perform();
		signOutLink.isDisplayed();
		signOutLink.click();
		Thread.sleep(3000);
		
	}
}
