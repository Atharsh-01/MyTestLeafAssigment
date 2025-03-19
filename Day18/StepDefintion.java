package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefintion {
	
	@Given("the user is on login page")
	public void the_user_is_on_login_page() {
	    System.out.println("Testcase Passed");
	}

	@When("the user enters the username as atharsh")
	public void the_user_enters_the_username_as_atharsh() {
		System.out.println("Testcase Passed");
	}

	@When("the user enters the password as Facebook")
	public void the_user_enters_the_password_as_facebook() {
		System.out.println("Testcase Passed");
	}

	@When("the user click the loggin button")
	public void the_user_click_the_loggin_button() {
		System.out.println("Testcase Passed");
	}

	@Then("the user should be redirected to the facebook home page")
	public void the_user_should_be_redirected_to_the_facebook_home_page() {
		System.out.println("Testcase Passed");
	}
	@When("the user enters the password as Facebooksss")
	public void the_user_enters_the_password_as_facebooksss() {
		System.out.println("Testcase Passed");
	}

	@When("the user should not redirected to the facebook home page")
	public void the_user_should_not_redirected_to_the_facebook_home_page() {
		System.out.println("Testcase Passed");
	}

}
