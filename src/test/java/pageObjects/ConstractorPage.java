package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConstractorPage {
	
	WebDriver  driver;
	
	public ConstractorPage(WebDriver  driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver,this);

		
	}
	
	
	
	

}
