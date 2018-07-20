package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage{

	WebDriver driver;
	
	@FindBy(xpath="//a[@href='/sign_in']")
	WebElement linkLogin;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnLogin()
	{
		linkLogin.click();
	}
}
