package autmation.autmation;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	public static WebDriver driver;
	private static JenkinsLoginPage loginPage;
	
	@cucumber.api.java.Before
	public static void init(){
		// initialize driver
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		loginPage = new JenkinsLoginPage(driver);
		// Given I'm on the login page (GOTO the login page)
		loginPage.gotoPage();
	}

	@Given("^I enter \"([^\"]*)\" as the username$")
	public void i_enter_as_the_username(String username) throws Throwable {
		loginPage.setUsername(username);
	}

	@Given("^I enter \"([^\"]*)\" as the password$")
	public void i_enter_as_the_password(String password) throws Throwable {
	    loginPage.setPassword(password);
	}

	@When("^I click login button$")
	public void i_click_login_button() throws Throwable {
	    loginPage.login();
	}

	@Then("^I will be on the Jenkins homepage$")
	public void i_will_be_on_the_Jenkins_homepage() throws Throwable {
	    // ASSERT statements
		// probably use next POM-- JenkinsHomePage.class
		String windowTitle = driver.getTitle(); // definitely should be in Page Object Model
		Assert.assertEquals("Dashboard [Jenkins]", windowTitle);
	}
	
}