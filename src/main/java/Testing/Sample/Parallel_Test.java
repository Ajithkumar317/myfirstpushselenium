package Testing.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Test {
	@Test
	private void youtube_launch() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver	 driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 
	}
	@Test
	private void amazon_launch() {
		WebDriverManager.chromedriver().setup();
		 WebDriver	 driver=new ChromeDriver();
		 driver.get("https://www.amazon.com/");
		 
}
}
