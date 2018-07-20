package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.SetUp;
import pages.HomePage;
import pages.LoginPage;

public class Teste2 extends SetUp{
	

	@Parameters("browser")
	@Test
	public void realizarLogin(String _browser)
	{
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys("daiane.macedo@hotmail.com");
		driver.findElement(By.id("user_password")).sendKeys("993007");
		driver.findElement(By.xpath("//input[@name='commit']")).click();

	}

}
