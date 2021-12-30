package Objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rediffhomepage {

			WebDriver driver;
			public  Rediffhomepage(WebDriver driver)
			{
				this.driver=driver;
			}
			By home=By.linkText("rediff.com");
			public WebElement home()
			{
				
			return driver.findElement(home);
		
			}
			
}

