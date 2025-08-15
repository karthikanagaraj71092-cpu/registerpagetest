package TestNgpacks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parallel {

	@Test
	@SuppressWarnings("deprecation")
	public void facebook(){
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("email", Keys.TAB, "Password", Keys.ENTER);
		
		driver.quit();

	}

}
