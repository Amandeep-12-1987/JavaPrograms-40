package flipkartsource;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Grocery 
{
	WebDriver driver;

	@FindBy(xpath="(//span[.='Grocery'])[1]")WebElement Grocerytab;
	@FindBy(name="pincode")WebElement pincode;
	@FindBy(xpath="//input[@title='Search grocery products']")WebElement grocerysearch;
	@FindBy(xpath="//button[@class='L0Z3Pu']")WebElement search;
	@FindBy(xpath="(//img[@alt='Fortune Chakki Fresh Atta'])[1]")WebElement FortuneAtta;
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww _27Cjkl']")WebElement Add;
	@FindBy(xpath="//button[.='GO TO BASKET']")WebElement Gtb; 
	@FindBy(xpath="//span[.='Place Order']")WebElement Order;
	@FindBy(xpath="//input[@class='_2IX_2- _17N0em']")WebElement email;
	@FindBy(xpath="//span[.='CONTINUE']")WebElement Continue;
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh _17N0em']")WebElement Otp;
	@FindBy(xpath="//button[@class='_2KpZ6l _20xBvF _3AWRsL']")WebElement login;
	public void Grocerytab1()
	{
		Grocerytab.click();
	}
	public void pincode1()
	{
		pincode.sendKeys("560037");
		pincode.sendKeys(Keys.ENTER);
	}
	public void grocerysearch1()
	{
		grocerysearch.sendKeys("atta");
	    grocerysearch.sendKeys(Keys.ENTER);
	}
	public void FortuneAtta1()
	{
		FortuneAtta.click();
	}
	public void Add1()
	{
	Add.click();
	}
	public void Gtb1()
	{
		Gtb.click();
	}
	public void Order1()
	{
		Order.click();
	}
	public void email1()
	{
		email.sendKeys("amandeepkaur1211@gmail.com");
	}

	public void continue1()
	{
		Continue.click();
	}
	public Grocery(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Onetime() {
		
		Otp.sendKeys("549374");
	}
	public void login1()
	{
		login.click();
	}
}
