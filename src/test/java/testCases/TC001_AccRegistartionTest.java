package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegPage;
import pageObjects.HomePage;
import testBases.BaseClass;

public class TC001_AccRegistartionTest extends BaseClass{
	
	
	@Test
	public void verify_accRegistration()
	{
		HomePage hp=new HomePage(driver);
		hp.clickRegister();
		
		AccountRegPage regpage=new AccountRegPage(driver);
		
		regpage.setFirstMobile(randomNumber());
		regpage.signIn();
		
		regpage.setName("Asifff");
		regpage.setEmail("Ajjshdh@gmail.com");
		regpage.setAdd("Chouhanagla");
		regpage.setCity("Moradab");
		regpage.setState("Uttar Pradesh");
		regpage.setPin("244001");
		regpage.SignUpbtn();
		String msg=regpage.getConfMsg();
		Assert.assertEquals(msg, "Logout");
	}
	
	
	
}
