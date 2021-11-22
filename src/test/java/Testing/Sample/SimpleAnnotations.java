package Testing.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SimpleAnnotations {
	WebDriver driver;
	@BeforeSuite
private void set_up() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\git\\repository\\seleniumtesting\\Driver");

}
	@BeforeTest
private void browse() {
	 driver=new ChromeDriver();

}
	@BeforeClass
	private void browser_launch() {
		driver.get("http://leafground.com/pages/Button.html");

	}
}
