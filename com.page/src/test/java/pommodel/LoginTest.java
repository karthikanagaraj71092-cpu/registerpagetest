package pommodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	@Test
	public void login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Loginpage.username(driver).sendKeys("karthik");
		Loginpage.password(driver).sendKeys("admin@1234");
		Loginpage.nubutton(driver).click();
        driver.quit();
	}
}
