package TestNgpacks;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class InvocationTime {

	
	@Test(invocationCount = 2)
	public void findEleme() {
		WebDriver driver = new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Football", Keys.ENTER);
		List<WebElement> Foodball = driver
				.findElements(By.xpath("//*[contains(text(),'football') or contains(text(),'football')]"));
		System.out.println(Foodball.size());
		//driver.quit();
	}

}
