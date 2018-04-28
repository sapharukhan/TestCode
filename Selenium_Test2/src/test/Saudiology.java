package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Saudiology {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://abraj.mage4.com/default/english-laundry-women-signature-eau-de-parfum-100-ml.html");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String str = driver.getTitle();
		System.out.println(str);

		driver.findElement(By.xpath("html/body/div[1]/main/div[2]/div/div[2]/div[6]/form/div/div/div[2]/button"))
				.click();
		String str1 = driver.getTitle();
		System.out.println(str1);

		driver.findElement(By.xpath("html/body/div[1]/header/div[3]/div/div[2]/nav/div[2]/a")).click();
		String str2 = driver.getTitle();
		System.out.println(str2);

		driver.findElement(
				By.xpath("html/body/div[1]/header/div[3]/div/div[2]/nav/div[2]/div/div/div/div[2]/div[3]/div/button"))
				.click();
		String str3 = driver.getTitle();
		System.out.println(str3);

		Assert.assertEquals("Checkout - Abraj Avenue", str3);

		System.out.println("Test passed");
		// driver.close();
	}

}
