package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpage {

	public static WebElement fname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='firstname']"));
	}

	public static WebElement lname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='lastname']"));
	}

	public static WebElement usrname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='username']"));
	}

	public static WebElement pass(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@id='password']"));
	}

	public static WebElement sbutton(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@type='submit']"));
	}

}
