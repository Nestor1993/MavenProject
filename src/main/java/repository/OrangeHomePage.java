package repository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHomePage {
	
	WebDriver driver;
	


	public OrangeHomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}

	
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login = By.id("btnLogin");
	
	public WebElement UserO()
	{
		return driver.findElement(username);
	}
	
	public WebElement PasswordO()
	{
		return driver.findElement(password);
	}
	
	public WebElement LoginO()
	{
		return driver.findElement(login);
	}
	
}
