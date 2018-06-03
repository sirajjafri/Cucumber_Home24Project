package com.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class RegistrationPage extends TestBase {

	public RegistrationPage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[contains(text(),'Neu bei Home24?')]")
	WebElement signup_message;    // in a iframe
	
	@FindBy(xpath="//button[@class='button button--primary button--min-width js-open-registration acte-login-further-btn']")
	WebElement Signup_continueButton;
	
	@FindBy(xpath="//div[@class='ca ca-radio js-input-account-type acte-login-account-type-private-m']")
	WebElement radioButton;
	
	@FindBy(name="firstname")
	WebElement firstName;
	
	@FindBy(name="lastname")
	WebElement lastName;
	
	@FindBy(xpath="(//input[@name='street'])[1]")
	WebElement Street;
	
	@FindBy(xpath="//html//form[@id='view2']//div[@class='ui-input-group']//div[1]/input[1]")
	WebElement Postal;
	
	@FindBy(xpath="//html//form[@id='view2']//div[@class='ui-input-group']//div[2]/input[1]")
	WebElement City;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	WebElement Email;
	
	
	@FindBy(xpath="(//input[@name='password'])[2]")
	WebElement password;
	
	@FindBy(xpath="(//input[@name='password_repeat'])[1]")
	WebElement confirmPassword;
	
	@FindBy(xpath="(//span[contains(text(),' (Pflichtfeld)')])[14]")
	WebElement checkbox1;
	
	@FindBy(xpath="(//div[@class='ca ca-checkbox'])[1]")
	WebElement checkbox2;
	
	
	@FindBy(xpath="(//button[contains(text(),'Weiter')])[2]")
	WebElement submittButton;
	
	public String CurrentURL(){
		
		return driver.getCurrentUrl();
	}
	
	public String PageTitle(){
		return driver.getTitle();
	}
	
	public boolean signupMessage(){
		return signup_message.isDisplayed();
	}
	
	public HomePage_Postlogin signUpForm(String fname, String lname, String street, 
			String postal, String city, String email, String pass, String cpass) throws IOException, 
			InterruptedException 
	 {
			Signup_continueButton.click();
			
			radioButton.click();
			firstName.clear();
			firstName.sendKeys(fname);
		
			lastName.clear();
			lastName.sendKeys(lname);
		
			Street.clear();
			Street.sendKeys(street);
			
			Postal.clear();
			Postal.sendKeys(postal);
			
			City.clear();
			City.sendKeys(city);
			
			Email.clear();
			Email.sendKeys(email);
			
			password.clear();
			password.sendKeys(pass);
			
			confirmPassword.clear();
			confirmPassword.sendKeys(cpass);
			
			Thread.sleep(2000);
			checkbox1.click();
			
			Thread.sleep(1000);
			submittButton.click();
			Thread.sleep(2000);
			return new HomePage_Postlogin();
		
	} 
	
}
