package Testing.Sample;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exception_Concept {
	WebDriver driver;

	@Test(invocationCount = 6)
	public void Open_Google() {
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
	}


	@Test(expectedExceptions = Exception.class)
	public void With_IncorrectXpath() {
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement signinbutton = driver.findElement(By.xpath("//span[@id='nav']"));
		signinbutton.click();
	}
}
