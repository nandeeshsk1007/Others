package AllPac;

import io.cucumber.java.en.Given;

public class LaunchBrowserclass {
	@Given("Browser is launched")
	public void browser_is_launched() {
		System.out.println("Browser launched");
	}
}
