package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Map {

	WebDriver driver;
	public Map(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement emailInput;
	public WebElement passwordInput;
	public WebElement submitLogin;
	public WebElement loginbutton;
	public WebElement skipbutton;
	public WebElement articlesection;
	public WebElement membershipbutton;
	public WebElement premiunmembership;

	
}
