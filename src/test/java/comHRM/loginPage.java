package comHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.organge.HRM.test.baseTest;

public class loginPage {
//	driver.findElement(By.name("username")).sendKeys("Admin");
//	driver.findElement(By.name("password")).sendKeys("admin123");
	// driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	@FindBy(name = "username")
	WebElement usertext;
	@FindBy(name = "password")
	WebElement paswrdtext;
	@FindBy(name = "//button[@type=\"submit\"]")
	WebElement buttonclick;

	public loginPage() {
		PageFactory.initElements( baseTest.driver, this);
	}
	public void loginApplication(String username, String password ) {
		usertext.sendKeys( username);
		paswrdtext.sendKeys(password);
		 buttonclick.click();
	}
	}