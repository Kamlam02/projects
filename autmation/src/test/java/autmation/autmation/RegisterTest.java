package autmation.autmation;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterTest {
	
	private static List<UserBean> users;

	@Given("^I have all these users$")
	public void i_have_all_these_users(List<UserBean> users) throws Throwable {
	    RegisterTest.users = users;
	    // set up a database with rows for database testing
	    System.out.println(users);
	}

	@Given("^I am (\\d+) years old$")
	public void i_am_years_old(int arg1) throws Throwable {
	    System.out.println("Given I am " + arg1 + " years old");
	}

	@Given("^my name is \"([^\"]*)\"$")
	public void my_name_is(String arg1) throws Throwable {
	    System.out.println("Given my name is " + arg1);
	}

	@Given("^I want \"([^\"]*)\" as my username$")
	public void i_want_as_my_username(String arg1) throws Throwable {
	    System.out.println("Given I want " + arg1 + " as my username");
	}

	@When("^I press the Register button$")
	public void i_press_the_Register_button() throws Throwable {
		System.out.println("When I press the Register button");
	}

	@Then("^I will be registered$")
	public void i_will_be_registered() throws Throwable {
	    System.out.println("Then I will be registered");
	}

	@Then("^I will get an error to choose new username$")
	public void i_will_get_an_error_to_choose_new_username() throws Throwable {
	    System.out.println("Then I will get an error to choose new username");
	}
	
}
