package Testing.Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Grouping_Concept {

	WebDriver driver;
	@BeforeTest
	public void browserlaunching() {
		driver=new ChromeDriver();
	}
	@Test(groups="Mobiles")
	public void apple() {
		
		
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");


		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("apple" + Keys.ENTER);

	}
	@Test(groups="Mobiles")
	public void samsung() {
		
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");


		WebElement box = driver.findElement(By.name("q"));
		box.sendKeys("samsung" +Keys.ENTER);
	}
	@Test(groups="Laptops")
	public void dell() {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");


		WebElement box1 = driver.findElement(By.name("q"));
		box1.sendKeys("dell" +Keys.ENTER);

	}
	@Test(groups="Laptops")
	public void hp() {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");


		WebElement box2 = driver.findElement(By.name("q"));
		box2.sendKeys("hp" +Keys.ENTER);

	}

}
