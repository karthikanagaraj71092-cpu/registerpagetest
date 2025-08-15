package TestNgpacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SequenceRun {
	
	@Test
	public void windows() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/");

		driver.findElement(By.xpath("//a[text()='Explore Workspace']")).click();
		driver.findElement(By.xpath("//a[text()=' Tabs ']")).click();

		driver.findElement(By.id("home")).click();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		List<String> list = new ArrayList<String>(windows);
		driver.switchTo().window(list.get(1));
		
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());

		driver.findElement(By.xpath("//button[@id='multi']")).click();
		Set<String> multiwin = driver.getWindowHandles();
		
		List<String> list1 = new ArrayList<String>(multiwin);
		System.out.println(list1);
		
		driver.switchTo().window(list1.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		Thread.sleep(3000);

		driver.switchTo().window(list1.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		Thread.sleep(3000);

		driver.switchTo().window(list1.get(2));
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);

		driver.quit();

	}
	

}
