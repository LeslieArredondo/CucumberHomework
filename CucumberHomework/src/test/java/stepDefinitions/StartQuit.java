package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class StartQuit {

	@Before
	public void starDriver() {
		System.out.println("Starting driver");
	}
	
	@After
	public void quitDriver() {
		System.out.println("Quit driver");
	}
	
}
