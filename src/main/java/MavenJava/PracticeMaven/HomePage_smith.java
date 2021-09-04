package MavenJava.PracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_smith {
	
	WebDriver driver;
	
	public HomePage_smith(WebDriver driver)
	{
		this.driver=driver;
	}
	
	@FindBy (xpath="//span[text()='Sign in']")
	WebElement signin;
	
	public void SignInClick()
	{
		signin.click();
	}

}
