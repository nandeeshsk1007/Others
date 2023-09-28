package Sample4;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Name {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	new ChromeDriver();
}
}
