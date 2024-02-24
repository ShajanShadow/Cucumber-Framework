package org.stepdef;
import io.cucumber.datatable.*;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegistration extends BaseClass{
	SignInPojo s;
	@Given("To lauch the browser and maximise the window")
	public void to_lauch_the_browser_and_maximise_the_window() {
		LaunchBrowser();
		windowMaximize();
	    
	}

	@When("To launch the url of fb application")
	public void to_launch_the_url_of_fb_application() {
		launchURL("https://en-gb.facebook.com/");
	    
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		s=new SignInPojo();
		clickBtn(s.getCreateNewAcc());
		
	    
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		s=new SignInPojo();
		passText(l.get(1), s.getFirstNameTxtBox());
	    
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		s=new SignInPojo();
		passText("Samuel", s.getLastNameTxtBox());
		
	    
	}

	@When("To pass the mobileNo or email in email text box")
	public void to_pass_the_mobileNo_or_email_in_email_text_box(DataTable d) {
		s=new SignInPojo();
		List<List<String>> l = d.asLists();
		passText(l.get(1).get(2), s.getRegMailorPh());
	
	    
	}

	@When("to create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		s=new SignInPojo();
		passText("123456", s.getRegPass());
	    
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		closeEntireBrowser();
	    
	}

}
