package TestNgpacks;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngparameters {
	RemoteWebDriver driver;

	@Parameters({ "emailid", "password","browser" })
	@Test
	public void SendParam(@Optional("karthik") String mail,@Optional("password@1234") String pass,@Optional("mozilla")String browser) throws InterruptedException {
		
		switch (browser) {
		case "Chrome":
			driver = new ChromeDriver();
			break;
		case "Edge":
			driver = new EdgeDriver(); 
			break;
		default:
			System.err.println("browser is not defined");
			break;
		}
		
		System.out.println(mail + " , " + pass);

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
