package com.qa.pages;

import java.io.IOException;

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
	
	@FindBy(xpath= "(//*[contains(text(),'My account')])[1]")
	WebElement MyAccount;
	
	@FindBy(xpath= "(//font[@style='vertical-align: inherit;'])[1]")
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
	
	public HomePage_Prelogin SignOut() throws IOException{
		Actions action = new Actions(driver);
		action.moveToElement(MyAccount).build().perform();
		signOutLink.isDisplayed();
		signOutLink.click();
		return new HomePage_Prelogin();
		
	}
}
