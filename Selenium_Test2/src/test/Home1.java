package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Home1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		String str = driver.getTitle();
		System.out.println(str);
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("khansapharu@gmail.com");
		WebElement element1 = driver.findElement(By.id("pass"));
		element1.sendKeys("ALAUDDIN1234");
		driver.findElement(By.id("loginbutton")).click();

		System.out.println("Test Passed");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();

	}
}
