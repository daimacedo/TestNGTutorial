package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id="user_email")
	WebElement txtLogin;
	
	@FindBy(id="user_password")
	WebElement txtPass;
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement btnLogin;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void sendEmail(String email) {
		txtLogin.sendKeys(email);
	}
	
	public void sendPass(String pass){
		txtPass.sendKeys(pass);
	}
	
	public void clickOnBtnLogin()
	{
		btnLogin.click();
	}
}
