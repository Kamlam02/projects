package autmation.autmation;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * Step implementations .. what we execute for each Given, when, Then
 *
 */



public class WithdrawTest {
	@Given("^I entered my card$")
	public void i_entered_my_card() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Card is entered");
	}

	@Given("^I input my pin$")
	public void i_input_my_pin() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Pin is inputted");
	}

	@Given("^I have (\\d+) in my account$")
	public void i_have_in_my_account(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Account");
	}

	@When("^I withdraw (\\d+) doll hairs$")
	public void i_withdraw_doll_hairs(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Dollar");
	}

	@Then("^I have (\\d+) doll hairs left$")
	public void i_have_doll_hairs_left(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("left");
	}


}
