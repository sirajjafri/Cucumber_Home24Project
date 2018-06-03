package StepDefinitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;

import com.qa.base.TestBase;
import com.qa.pages.HomePage_Postlogin;
import com.qa.pages.HomePage_Prelogin;
import com.qa.pages.RegistrationPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDefinition extends TestBase{
	public RegistrationStepDefinition() throws IOException {
		super();
		
	}
	HomePage_Prelogin h_prelogin;
	RegistrationPage r_page;
	HomePage_Postlogin h_postlogin;
	

	@Given("^User is on prelogin Home page$")
	public void user_is_on_prelogin_Home_page() throws IOException, InterruptedException {
		initialization();
	}

	@When("^title of the page is correct$")
	public void title_of_the_page_is_correct() throws Throwable {
		h_prelogin = new HomePage_Prelogin();
		String tiltle= h_prelogin.page_title();
		Assert.assertEquals(prop.getProperty("prelogin_page_title"), tiltle);
		
	}

	@Then("^Clicks on Signin button$")
	public void clicks_on_Signin_button() throws Throwable {
		h_prelogin.signup();
	}

	@Then("^user redirects to registration page$")
	public void user_redirects_to_registration_page() throws Throwable {
		r_page= new RegistrationPage();
		Thread.sleep(3000);
		String url = r_page.CurrentURL();
		Assert.assertEquals(prop.getProperty("RegistrationPage_url"), url);
		
		String title= r_page.PageTitle();
		Assert.assertEquals(prop.getProperty("RegistrationPage_Title"), title);
	}
	
	@Then("^user clicks on Continue button and enters \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" and clicks Continue button$")
	public void user_clicks_on_Continue_button_and_enters_and_clicks_Continue_button(String fname, String lname, String street, String postal, String city, String email, String pass, String cpass) throws Throwable {
		r_page.signUpForm(fname, lname, street, postal, city, email, pass, cpass);
	}

	@Then("^user redirects to Home page post login$")
	public void user_redirects_to_Home_page_post_login() throws Throwable {
		h_postlogin = new HomePage_Postlogin();
		String url = h_postlogin.CurrentURL();
		Assert.assertEquals(prop.getProperty("HomePage_Postlogin_url"), url);
		String title= h_postlogin.PageTitle();
		Assert.assertEquals(prop.getProperty("HomePage_Postlogin_url_title"), title);
	}

	@Then("^user logs out from homepage post login$")
	public void user_logs_out_from_homepage_post_login() throws Throwable {
		
		h_postlogin.SignOut();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
	   driver.quit();
	}
}
