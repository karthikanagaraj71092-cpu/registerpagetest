package TestNgpacks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvi {
	

	@Test(dataProvider = "getData",dataProviderClass = Datasheet.class)
	public void login(String email, String pass) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://adactinhotelapp.com/");

		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login']")).click();
		String title = driver.getTitle();
		System.out.println("Title is " + title);
		String url = driver.getCurrentUrl();
		System.out.println("url is " + url);

		driver.quit();

	}


}
