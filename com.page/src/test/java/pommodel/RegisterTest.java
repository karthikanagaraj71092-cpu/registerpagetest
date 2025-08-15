package pommodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterTest {
	
	@Test
	public void register() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Registerpage.fname(driver).sendKeys("Raghul");
		Registerpage.lname(driver).sendKeys("Dhivan");
		Registerpage.usrname(driver).sendKeys("Raghul Dhivan");
		Registerpage.pass(driver).sendKeys("Admin@1234");
		Registerpage.sbutton(driver).click();
		
		driver.quit();

	}

}
