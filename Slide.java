package flipkartsource;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Slide 
{
	WebDriver driver;
	@FindBy(xpath="//button[@title='Next Slide']")WebElement rightslide;
	@FindBy(linkText="iPhone 14")WebElement iphone;
	
	public void rightslide1()
	{
		rightslide.click();
	}
	public void shopnow1()
	{
		//Point p1=iphone.getLocation();
		//int x=p1.getX();
		//int y=p1.getY();
		//JavascriptExecutor j1=(JavascriptExecutor) driver;
		//j1.executeScript("window.scrollBy(0,+"+y+")");
		iphone.click();
	}
	
	public Slide(WebDriver driver) 
	{

		PageFactory.initElements(driver, this);
	}

}
