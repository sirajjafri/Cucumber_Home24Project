package com.qa.pages;

import java.io.IOException;

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
	
	@FindBy(name="email")
	WebElement Email;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(name="password_repeat")
	WebElement confirmPassword;
	
	@FindBy(xpath="(//label[@class='ca-label'])[7]")
	WebElement checkbox1;
	
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
	
	public HomePage_Postlogin signUpForm(String fname, String lname, String email, String pass, String cpass) throws IOException 
	 {
			Signup_continueButton.click();
			radioButton.isSelected();
			firstName.clear();
			firstName.sendKeys(fname);
			lastName.clear();
			lastName.sendKeys(lname);
			Email.clear();
			Email.sendKeys(email);
			password.clear();
			password.sendKeys(pass);
			confirmPassword.clear();
			confirmPassword.sendKeys(cpass);
			checkbox1.isSelected();
			submittButton.submit();
			return new HomePage_Postlogin();
		
	} 
	
}
