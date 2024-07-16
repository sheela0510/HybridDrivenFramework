package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends ConstractorPage{

	public LoginPage(WebDriver driver)
	{
		super(driver);
		
	}
	
@FindBy(id="input-email")
WebElement txtEmailAddress;

@FindBy(id="input-password")
WebElement txtPassword;

@FindBy(xpath="//input[@value='Login']")
WebElement btnLogin;

public void EnterEmailAddress(String email)
{
	txtEmailAddress.sendKeys(email); //Suditi222@gmail.com
}

public void EnterPassword(String password)
{
	txtPassword.sendKeys(password); //Suditi222
}
public void ClickLoginButton()
{
	btnLogin.click();
}
}
