package com.qa.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
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
	
	@FindBy(xpath= "//span[@class='alternative-country-box__country-name'])[1]")
	WebElement AlertPopup;
	
	@FindBy(xpath= "(//span[contains(text(),'Anmelden')])[1]")
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
	
	/*public void AlertPopUpAccept(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}*/
	/*public static void acceptAlert(WebDriver driver,int time) {

		WebDriverWait wait=new WebDriverWait(driver, time);
		
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		
		alt.accept();
	}*/
	
	
	public RegistrationPage signup() throws IOException, InterruptedException{
		/*Thread.sleep(10000);
		driver.switchTo().frame(1);
		AlertPopup.click();*/
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);*/
		/*WebDriverWait wait=new WebDriverWait(driver, 20);
		Alert alert= wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();*/
		
		/*Alert alert= driver.switchTo().alert();*/
		/*System.out.println("Alert text is"+alert.getText());
		alert.accept();*/
		
		driver.navigate().refresh();
		Actions action = new Actions(driver);
		action.moveToElement(Login).build().perform();
		SignUp.click();
		return new RegistrationPage();
		
		
	}

	

}
