package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AccountRegPage extends BasePage {
	

	WebDriver driver;
	
	public AccountRegPage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//input[@id='user-mobile']")
	WebElement TxtMobile;

    @FindBy(xpath="//input[@id='user-signin']")
    WebElement signIn;
	
	@FindBy(xpath="//input[@id='user-signin']")
	WebElement SignBtn;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement Name;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@id='address']")
	WebElement Address;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement City;
	
	@FindBy(xpath="//select[@id='state']")
	WebElement drpDown;
	
	@FindBy(xpath="//input[@id='pincode']")
	WebElement Pin;
	
	@FindBy(xpath="//input[@id='register_btn']")
	WebElement SignUpbtn;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement msg;
	
	public void signIn()
	{
		signIn.click();
	}
	public void setFirstMobile(String fMobile)
	{
		TxtMobile.sendKeys(fMobile);	
	}
	
	public void setName(String fname)
	{
		Name.sendKeys(fname);
	}
	
	public void setEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void setAdd(String Add)
	{
		Address.sendKeys(Add);
	}
	
	public void setCity(String city)
	{
		City.sendKeys(city);
	}
	
	public void setState(String state)
	{
		Select drpcountry=new Select(drpDown);
		drpcountry.selectByVisibleText(state);
	}
	
	public void setPin(String pin)
	{
		Pin.sendKeys(pin);
	}
	
	public void SignUpbtn()
	{
		SignUpbtn.click();
	}
	
	
	
	public String getConfMsg()
	{
		try {
			return(msg.getText());
		} catch (Exception e)
		{
			return (e.getMessage());
		}
	}
	
	
	
}
