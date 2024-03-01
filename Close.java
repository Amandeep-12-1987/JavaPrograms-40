package flipkartsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Close 
{
	WebDriver driver;

	@FindBy(xpath="//span[@role='button']")WebElement Closebutton;
	public void Close1()
	{
		Closebutton.click();
	}
	public Close(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
