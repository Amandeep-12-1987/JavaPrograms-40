package flipkartsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
	WebDriver driver;
	public Actions a1;
@FindBy(xpath="(//div[@class='exehdJ'])[1]")WebElement MyAccount;


public void MyAccount1()
{
	a1=new Actions(driver);
	a1.moveToElement(MyAccount).perform();
			
	
}
public  loginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}
}




