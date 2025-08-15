package TestNgpacks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelRun {
	
	
	@Test
	@SuppressWarnings("deprecation")
	public void loginform() {
		ChromeDriver driver =  new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.name("email")).sendKeys("karthik92@gmail.com");
		driver.findElement(By.name("password")).sendKeys("admin@123");
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
		String url = driver.getCurrentUrl();
		System.out.println(url); 
		String title = driver.getTitle();
		System.out.println(title); 
      driver.findElement(By.xpath("//a[text()='New User']")).submit();
		driver.quit();
		
	}	

}
