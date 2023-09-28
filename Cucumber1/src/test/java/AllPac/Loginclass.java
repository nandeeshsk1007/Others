package AllPac;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginclass {
	@Given("Open chrome browser and launch facebook application")
	public void open_chrome_browser_and_launch_facebook_application() {
	    System.out.println("10");
	}

	@When("Enter UN and PWD")
	public void enter_un_and_pwd() {
		System.out.println("20");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		System.out.println("30");
	}

	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() {
		System.out.println("40");
	}
}
