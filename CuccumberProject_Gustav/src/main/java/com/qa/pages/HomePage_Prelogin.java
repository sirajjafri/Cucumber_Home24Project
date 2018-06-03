package com.qa.pages;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class HomePage_Prelogin extends TestBase {

	public HomePage_Prelogin() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	// annotations of the pages are
	
	@FindBy(xpath="//*[@viewBox='0 0 363.74 129.73']")
	WebElement logo;
	
	@FindBy(xpath= "//a[@id='alternative-country-close']//span[@class='alternative-country-box__country-name']")
	WebElement AlertPopup;
	
	@FindBy(xpath= "//span[@class='GN-iconContent__iconCaption'][contains(text(),'Anmelden')]")
	WebElement Login;
	//font[@style='vertical-align: inherit;'][contains(text(),'Log In')]
	@FindBy(xpath= "//a[@class='GN-button__root GN-myAccountStyles__loginButton GN-button__fluid GN-button__sm GN-button__home24']")
	WebElement SignUp;
	
	// methods
	
	public String page_title(){
		return driver.getTitle();
	}
	
	public boolean logo_displayed(){
		return logo.isDisplayed();
	}
	
	
	public RegistrationPage signup() throws IOException, InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", AlertPopup);
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.moveToElement(Login).build().perform();
		SignUp.click();
		Thread.sleep(2000);
		return new RegistrationPage();
		
		
	}

	

}
