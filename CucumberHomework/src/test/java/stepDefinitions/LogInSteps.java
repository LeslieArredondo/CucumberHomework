package stepDefinitions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.Map;
import objects.Map;

public class LogInSteps {
	
	WebDriver driver;
	Map mp;
	
	
	@Given("The normal user is in the login page")
	public void the_normal_user_is_in_the_login_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		mp = new Map(driver);
		driver.get(" ");

	}

	@When("the normal User send an email as {string}")
	public void the_normal_user_send_an_email_as(String email) {
		mp.emailInput.sendKeys(email);
	}

	@When("the normal User send password as {string}")
	public void the_normal_user_send_password_as(String password) {
		mp.passwordInput.sendKeys(password);
	}

	@When("normal User click on Log in button")
	public void normal_user_click_on_log_in_button() {
		mp.loginbutton.click();

	}

	@Then("normal User should be in Home Page")
	public void normal_user_should_be_in_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");
	}

	@Given("The non-registered user is in the login page")
	public void the_non_registered_user_is_in_the_login_page() {
		driver.get(" ");
	}

	@When("non-registered User clicks on Skip button")
	public void non_registered_user_clicks_on_skip_button() {
		mp.skipbutton.click();

	}

	@Then("non-registered User should be in Home Page")
	public void non_registered_user_should_be_in_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@Then("User should see the section of local news")
	public void user_should_see_the_section_of_local_news() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@Given("The premiun user is in the login page")
	public void the_premiun_user_is_in_the_login_page() {
		driver.get(" ");

	}

	@When("the Premiun User send an email as {string}")
	public void the_premiun_user_send_an_email_as(String emailpremiun) {
		mp.emailInput.sendKeys(emailpremiun);

	}

	@When("the Premiun User send password as {string}")
	public void the_premiun_user_send_password_as(String passwordpremiun) {
		mp.passwordInput.sendKeys(passwordpremiun);

	}

	@When("premiun User click on Log in button")
	public void premiun_user_click_on_log_in_button() {
		mp.loginbutton.click();

	}

	@Then("premiun User should be in Home Page")
	public void premiun_user_should_be_in_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@Then("User should see the section of global and local news")
	public void user_should_see_the_section_of_global_and_local_news() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@When("the premiun User should be in Home Page")
	public void the_premiun_user_should_be_in_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@When("premiun User click on an article")
	public void premiun_user_click_on_an_article() {
		mp.articlesection.click();

	}

	@Then("User see an article with no adds")
	public void user_see_an_article_with_no_adds() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@When("the normal User should be in Home Page")
	public void the_normal_user_should_be_in_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@When("normal User click on an article")
	public void normal_user_click_on_an_article() {
		mp.articlesection.click();

	}

	@Then("User see an article with at least five adds")
	public void user_see_an_article_with_at_least_five_adds() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@When("the non-registered User should be in Home Page")
	public void the_non_registered_user_should_be_in_home_page() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@When("non-registered User click on an article")
	public void non_registered_user_click_on_an_article() {
		mp.articlesection.click();

	}

	@Then("the system should deny the access")
	public void the_system_should_deny_the_access() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	@When("normal User click on membership and select the Premiun plan")
	public void normal_user_click_on_membership_and_select_the_premiun_plan() {
		mp.membershipbutton.click();
		mp.premiunmembership.click();


	}

	@Then("User should see a message to confirm the change of plan")
	public void user_should_see_a_message_to_confirm_the_change_of_plan() {
		Assert.assertEquals(driver.getCurrentUrl(), " ");

	}

	
}
