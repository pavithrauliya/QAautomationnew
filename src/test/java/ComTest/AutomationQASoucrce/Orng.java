package ComTest.AutomationQASoucrce;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Orng {
	WebDriver driver=new ChromeDriver(); 
	@Test
	public void assertFalseequals () {
			WebDriver driver=new ChromeDriver();  
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
driver.findElement(By.linkText("https://opensource-demo.orangehrmlive.com/web/index.php/leave/viewLeaveList")).click();
	// search
SoftAssert softobject= new SoftAssert();
boolean search= driver.findElement(By.xpath("//button[@type=\"submit\"]")).isEnabled();
softobject.assertTrue(search);
softobject.assertAll();
	}
	//close browser
	public void close() {
		driver.close();
}	
}

