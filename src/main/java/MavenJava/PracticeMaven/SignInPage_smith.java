package MavenJava.PracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage_smith {
	
	WebDriver driver;
	
	public SignInPage_smith(WebDriver driver)
	{
		this.driver=driver;
	}

	@FindBy (id="email")
	//@FindBy (id="LoginType_email")
	WebElement email;
	
	@FindBy (id="password")
	//@FindBy (id="LoginType_password")
	WebElement pass;
	
	@FindBy (xpath="//button[@class='c-authentication__cta']")
	//@FindBy (xpath="//button[@name='submitLogin']")
	WebElement signin;
	
	public void Email(String em)
	{
		email.sendKeys(em);
	}
	
	public void Password(String pa)
	{
		pass.sendKeys(pa);
	}
	
	public void SignInClick()
	{
		signin.click();
	}
}
