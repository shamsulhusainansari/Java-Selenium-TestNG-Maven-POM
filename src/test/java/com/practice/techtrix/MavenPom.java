package com.practice.techtrix;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MavenPom {
	WebDriver driver;
	public MavenPom(WebDriver driver)
	{
		this.driver = driver;
	}
	By name = By.name("firstname");
	By surname=By.name("lastname");
	By email = By.name("reg_email__");
	By cemail = By.name("reg_email_confirmation__");
	
	By password = By.name("reg_passwd__");

	By day = By.name("birthday_day");
	By month = By.name("birthday_month");
	By year = By.name("birthday_year");

	By gender = By.name("sex");

	By signUp = By.name("websubmit");


	public WebElement name()
	{
		return driver.findElement(name);
	}
	public WebElement surname()
	{
		return driver.findElement(surname);
	}

	public WebElement email()
	{
		return driver.findElement(email);
	}
	public WebElement cemail()
	{
		return driver.findElement(cemail);
	}
	public WebElement password()
	{
		return driver.findElement(password);
	}

	public WebElement day()
	{
		return driver.findElement(day);
	}
	public WebElement month()
	{
		return driver.findElement(month);
	}
	public WebElement year()
	{
		return driver.findElement(year);
	}

	public WebElement gender()
	{
		return driver.findElement(gender);
	}

	public WebElement signUp()
	{
		return driver.findElement(signUp);
	}
}

