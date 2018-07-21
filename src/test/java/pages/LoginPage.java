package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	String nome = "Daiane";
	
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
	
	public LoginPage sendEmail(String email) {
		txtLogin.sendKeys(email);
		return this;
	}
	
	public LoginPage sendPass(String pass){
		txtPass.sendKeys(pass);
		return this;
	}
	
	public LoginPage clickOnBtnLogin()
	{
		btnLogin.click();
		return this;
	}

	

}
