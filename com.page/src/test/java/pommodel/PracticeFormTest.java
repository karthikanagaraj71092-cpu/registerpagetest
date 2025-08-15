package pommodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeFormTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");

		PracticeFormPage formPage = new PracticeFormPage(driver);

		formPage.enterName("Karthik", "K");
		formPage.enterEmail("karthik@example.com");
		formPage.selectGender("Male");
		formPage.enterMobile("9876543210");
		// formPage.setDoB(""14 Oct 1992"");
		formPage.Subject("Computer Science");
		formPage.selectHobby("Reading");
		formPage.uploadPicture("C:\\Users\\vrkka\\Downloads\\Test.jpg");
		formPage.enterAddress("1536 Stellar Dr, Kenai, Alaska 99611, USA");
		formPage.selectState("NCR");
		formPage.selectCity("Delhi");
		formPage.submitForm();
		Thread.sleep(4000);
		driver.quit();
	}
}
