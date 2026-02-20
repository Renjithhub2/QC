package Sp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {
	WebDriver driver;
	@Before
		public void gett()
		{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		}
	@Test
		public void sett()
		{
		driver.findElement(By.id("email")).sendKeys("renjithex@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("qwerty12345");
		driver.findElement(By.xpath("//*[@id=\"u_0_5_62\"]")).click();
		}
	@After
		public void exitt()
		{
		driver.quit();
		}	

}
