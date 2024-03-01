package flipkartsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email
{
WebDriver driver;

@FindBy (xpath="//input[@class='_18u87m _3WuvDp']")WebElement emailid;
@FindBy (xpath="//button[.='Request OTP']")WebElement Otp;
public void emailid1()
{
	emailid.sendKeys("amandeepkaur1211@gmail.com");
}
public void otp1()
{
	Otp.click();
}

public Email(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
