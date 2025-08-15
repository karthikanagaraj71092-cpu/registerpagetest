package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.id("email"));
	}

	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.id("password"));
	}

	public static WebElement nubutton(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='New User']"));
	}

}
