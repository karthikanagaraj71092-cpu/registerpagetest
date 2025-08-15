package TestNgpacks;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param {

	@Parameters({ "email","password" })
	@Test
	public void login(@Optional("Suja") String mail, @Optional("admin@1234") String pass) throws InterruptedException {
		System.out.println(mail + " , " + pass);

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);

		WebElement emai = driver.findElement(By.id("email"));
		emai.sendKeys(mail);
		Thread.sleep(3000);
		WebElement pas = driver.findElement(By.id("pass"));
		pas.sendKeys(pass);
		Thread.sleep(3000);
		driver.quit();

	}

}
