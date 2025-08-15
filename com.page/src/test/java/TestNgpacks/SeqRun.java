package TestNgpacks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeqRun {
	
	@Test
	public  void run() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Alert b = driver.switchTo().alert();
		b.sendKeys("Testing");
		Thread.sleep(4000);
		b.accept();
		Thread.sleep(3000);
		
		driver.quit();
				
		

	}
	

}
