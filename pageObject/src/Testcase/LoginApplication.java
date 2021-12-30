package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Objectrepository.Rediffhomepage;
import Objectrepository.Rediffloginpage;


public class LoginApplication {
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver","C://selenium//chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		Rediffloginpage rd=new Rediffloginpage(driver);
        rd.Emailid().sendKeys("hello");
        rd.passsword().sendKeys("hello");
        rd.go().click();
        Rediffhomepage rh=new Rediffhomepage(driver);
        rh.home().click();
        
        
	}


}
