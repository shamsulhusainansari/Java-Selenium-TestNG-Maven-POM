package com.practice.techtrix;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Techtrix {

	@Test
	public void TestMethod() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");

		MavenPom maven=new MavenPom(driver);
		maven.name().sendKeys("Shamsul");
		maven.surname().sendKeys("Ansari");
		maven.email().sendKeys("shamsulansari309@gmail.com");
		maven.cemail().sendKeys("shamsulansari309@gmail.com");
		maven.password().sendKeys("Ansari@9525");

		Select day=new Select(maven.day());
		Select month=new Select(maven.month());
		Select year=new Select(maven.year());
		day.selectByValue("14");
		month.selectByIndex(9);
		year.selectByValue("1998");
		maven.gender().click();
		maven.signUp().click();
	}
}
