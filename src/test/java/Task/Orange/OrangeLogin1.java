package Task.Orange;

import org.testng.Assert;
import org.testng.annotations.Test;

import repository.OrangeHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin1 {
	
	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NESTOR\\Documents\\SELENIUM\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		String url1 = driver.getCurrentUrl();
		Assert.assertEquals(url1, "https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		String data = driver.findElement(By.xpath("//span[contains(text(),'( Username : Admin | Password : admin123 )')]")).getText().split(":")[1].trim().split(" ")[0];
		System.out.println(data);
		String pass = driver.findElement(By.xpath("//span[contains(text(),'( Username : Admin | Password : admin123 )')]")).getText().split("ord")[1].trim().split(":")[1].trim().split(" ")[0].trim();
		System.out.println(pass);
		OrangeHomePage o= new OrangeHomePage(driver);
		o.UserO().sendKeys(data);
		o.PasswordO().sendKeys(pass);
		o.LoginO().click();
		String url =driver.getCurrentUrl();		
		Assert.assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.close();
		
	}

}
