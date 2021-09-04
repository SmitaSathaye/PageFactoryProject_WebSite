package MavenJava.PracticeMaven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Operations_mrandmrssmith {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Selenium\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
			
		driver.get("https://www.mrandmrssmith.com/");
		driver.manage().window().maximize();
				
		HomePage_smith hp = PageFactory.initElements(driver, HomePage_smith.class);
		SignInPage_smith sp = PageFactory.initElements(driver, SignInPage_smith.class);
		SelectDatePage_smith dp = PageFactory.initElements(driver, SelectDatePage_smith.class);
		
		hp.SignInClick();
		
		sp.Email("automation.software@gmail.com");
		sp.Password("AddMe@123");
			
		sp.SignInClick();
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,400)");
		//new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("div.dayPicker__transitionContainer.dayPicker__transitionContainer--horizontal")));
		Thread.sleep(2000);
		
		dp.SearchCountry("Singapore");
	
		dp.SelectDate();
		//String monthYearValue = driver.findElement(By.xpath("//span[text()='September 2021']").
		String monthYearValue = dp.CheckIn();
		//System.out.println(monthYearValue);// This will print September 2021
		
		String month = monthYearValue.split(" ")[0].trim(); // this will store month, as string got split and its 1st index is month
		String year = monthYearValue.split(" ")[1].trim(); // this will store year
		//System.out.println(month);
		
		while(!(month.equals("October") && year.equals("2021")))// boolean condition if it is not defined year and month it will return false, if true perform enter while loop
		{
			dp.NextMonthClick();// this will check the while loop month and year after clicking it on next button, and then will perform same operation for next month
			monthYearValue = dp.CheckIn();
						
			month = monthYearValue.split(" ")[0].trim();  
			year = monthYearValue.split(" ")[1].trim(); 
		}
		
		dp.ClickCheckInDate();
		dp.ClickCheckOutDate();
		
		//String date = dp.SelectCheckinDate(); not working
		//System.out.println(date);
		
		
	}

}
