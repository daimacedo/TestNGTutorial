package base;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class SetUp {

	static protected WebDriver driver;

	@BeforeClass
	@Parameters({ "browser" })
	public void setUp(@Optional("chrome")String _browser) {

		System.out.println(_browser);

		if (_browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"/home/daiane.macedo/workspace2/cucumber/resources/seleniumDrivers/chromedriver");
			driver = new ChromeDriver();

		} else if (_browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"/home/daiane.macedo/workspace2/cucumber/resources/seleniumDrivers/geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://letskodeit.teachable.com/");
	}

	@AfterClass
	public void endTest() {
		driver.close();
	}

}
