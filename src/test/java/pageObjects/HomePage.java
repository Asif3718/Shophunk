package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}



	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement Registerbtn;
	
	public void clickRegister()
	
	{
		Registerbtn.click();
		
	}
}
