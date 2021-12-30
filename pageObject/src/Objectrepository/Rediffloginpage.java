package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffloginpage {

			WebDriver driver;
			public  Rediffloginpage(WebDriver driver)
			{
				this.driver=driver;
			}
			By username=By.xpath(".//*[@id='login1']");
			By password=By.name("passwd");
			By go=By.name("proceed");
			
			public WebElement Emailid()
			{
				
			return driver.findElement(username);
		
			}
			public WebElement passsword()
			{
				
			return driver.findElement(password);
		
			}
			public WebElement go()
			{
				
			return driver.findElement(go);
		
			}
		
			
}

