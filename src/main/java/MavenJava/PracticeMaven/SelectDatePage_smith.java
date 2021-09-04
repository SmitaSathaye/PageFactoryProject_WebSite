package MavenJava.PracticeMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectDatePage_smith {
	
	WebDriver driver;
	public SelectDatePage_smith(WebDriver driver)
	{
		this.driver=driver;
	}
    
	@FindBy (id="react-s_query")
	WebElement search;
	
	@FindBy (xpath="//div[text()='check-in']")
	WebElement selectdate;
	
	@FindBy (xpath="//span[text()='September 2021']")
	WebElement checkin;
	
	@FindBy (xpath="//div[@class='next-month']")
	WebElement nextmonth;
	
	@FindBy (xpath="//td[text()='8']")
	WebElement cidate;
	
	@FindBy (xpath="//td[text()='11']")
	WebElement codate;
	
	public void SearchCountry(String co)
	{
		search.sendKeys(co);
	}
	
	public void SelectDate() {
		selectdate.click();
	}
	
	public String CheckIn()
	{
		return checkin.getText();
	}
	
	public void NextMonthClick()
	{
		nextmonth.click();
	}
	
	public void ClickCheckInDate()
	{
		cidate.click();
	}
	
	public void ClickCheckOutDate()
	{
		codate.click();
	}
	
	/*
	@FindBy (xpath="//td[@class='calendarDay calendarDay--default calendarDay--defaultTheme']")
	WebElement checkindate;
	
	@FindBy (xpath="//td[@role='button']")
	WebElement checkindateclick;
	
	public String SelectCheckinDate()
	{
		return checkindate.getText();
	}
	
	public void ClickCheckinDate()
	{
		checkindateclick.click();
	}*/
	
	
}
