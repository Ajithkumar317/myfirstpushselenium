package Testing.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_Test {
	@Test
	private void chrome_browser() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver	 driver=new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 
	}
	@Test
	private void edge_browser() {
		 WebDriverManager.edgedriver().setup();
		 WebDriver	 driver=new EdgeDriver();
		 driver.get("https://www.youtube.com/");
		 
}
}
