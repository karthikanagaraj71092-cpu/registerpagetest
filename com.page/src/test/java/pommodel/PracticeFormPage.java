package pommodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFormPage {
	 WebDriver driver;
	    public PracticeFormPage(WebDriver driver) {
	        this.driver = driver;
	    }
    
	    public By FName = By.xpath("//input [@placeholder='First Name']");
		public By LName = By.xpath("//input [@id='lastName']");
		public By Email = By.xpath("(//input [@type='text'])[3]");
		public By GenderM = By.xpath("//label[text()='Male']");
		public By GenderF = By.xpath("//label[text()='Female']");
		public By GenderO = By.xpath("//label[text()='Other']");
		public By Mobile = By.xpath("(//input [@type='text'])[4]");
		public By SubjectsInput = By.id("subjectsInput");
		public By HobbySp = By.xpath("//label[text()='Sports']");
		public By HobbyRe = By.xpath("//label[text()='Reading']");
		public By HobbyMu = By.xpath("//label[text()='Music']");
		public By Upload = By.xpath("//input[@id='uploadPicture']");
		public By Addr = By.xpath("//textarea[@placeholder=\"Current Address\"]");
		public By StateDrop = By.xpath("//input [@id='react-select-3-input']");
		public By CityDrop = By.xpath("//input [@id='react-select-4-input']");
		public By submit = By.xpath("//button[text()='Submit']");
	    
	    
	    public void enterName(String fName, String lName) {
	        driver.findElement(FName).sendKeys(fName);
	        driver.findElement(LName).sendKeys(lName);
	    }

	    public void enterEmail(String userEmail) {
	        driver.findElement(Email).sendKeys(userEmail);
	    }

	    public void selectGender(String gender) {
	        switch (gender.toLowerCase()) {
	            case "male":
	                driver.findElement(GenderM).click();
	                break;
	            case "female":
	                driver.findElement(GenderF).click();
	                break;
	            case "other":
	                driver.findElement(GenderO).click();
	                break;
	        }
	    }

	    public void enterMobile(String number) {
	        driver.findElement(Mobile).sendKeys(number);
	    }

	    public void Subject(String subject) {
			WebElement subjectBox = driver.findElement(SubjectsInput);
			subjectBox.sendKeys(subject);
			subjectBox.sendKeys(Keys.ENTER);
		}

	    public void selectHobby(String hobby) {
	        switch (hobby.toLowerCase()) {
	            case "sports":
	                driver.findElement(HobbySp).click();
	                break;
	            case "reading":
	                driver.findElement(HobbyRe).click();
	                break;
	            case "music":
	                driver.findElement(HobbyMu).click();
	                break;
	        }
	    }

	    public void uploadPicture(String filePath) {
	        driver.findElement(Upload).sendKeys(filePath);
	    }

	    public void enterAddress(String address) {
	        driver.findElement(Addr).sendKeys(address);
	    }

	    public void selectState(String state) {
	        WebElement stateInput = driver.findElement(StateDrop);
	        stateInput.sendKeys(state);
	        stateInput.sendKeys(Keys.ENTER);
	    }

	    public void selectCity(String city) {
	        WebElement cityInput = driver.findElement(CityDrop);
	        cityInput.sendKeys(city);
	        cityInput.sendKeys("\n");
	    }

	    public void submitForm() {
	        driver.findElement(submit).click();
	    }
	    
	    /*
		 * public static WebElement Fname(WebDriver driver) { return
		 * driver.findElement(By.xpath("//input [@placeholder='First Name']")); }
		 * 
		 * public static WebElement Lname(WebDriver driver) { return
		 * driver.findElement(By.xpath("//input [@id='lastName']")); }
		 * 
		 * public static WebElement Email(WebDriver driver) { return
		 * driver.findElement(By.xpath("(//input [@type='text'])[3]")); }
		 * 
		 * public static WebElement Gender(WebDriver driver) { return
		 * driver.findElement(By.xpath("//label[text()='Male']")); }
		 * 
		 * public static WebElement Gen(WebDriver driver) { return
		 * driver.findElement(By.xpath("//label[text()='Female']")); }
		 * 
		 * public static WebElement Ge(WebDriver driver) { return
		 * driver.findElement(By.xpath("//label[text()='Other']")); }
		 * 
		 * public static WebElement Mobile(WebDriver driver) { return
		 * driver.findElement(By.xpath("(//input [@type='text'])[4]")); }
		 * 
		 * 
		 * public static WebElement Dob(WebDriver driver) { return
		 * driver.findElement(By.xpath("(//input [@id='dateOfBirthInput']")); }
		 * 
		 * 
		 * public static WebElement Subject(WebDriver driver) { return
		 * driver.findElement(By.xpath("//input[@id='subjectsInput']")); }
		 * 
		 * public static WebElement Hobby(WebDriver driver) { return
		 * driver.findElement(By.xpath("//label[text()='Sports']")); }
		 * 
		 * public static WebElement Hob(WebDriver driver) { return
		 * driver.findElement(By.xpath("//label[text()='Reading']")); }
		 * 
		 * public static WebElement Ho(WebDriver driver) { return
		 * driver.findElement(By.xpath("//label[text()='Music']")); }
		 * 
		 * public static WebElement Upload(WebDriver driver) { return
		 * driver.findElement(By.xpath("//input[@id='uploadPicture']")); }
		 * 
		 * public static WebElement Addr(WebDriver driver) { return
		 * driver.findElement(By.xpath("//textarea[@placeholder=\"Current Address\"]"));
		 * }
		 * 
		 * public static WebElement State(WebDriver driver) { return
		 * driver.findElement(By.xpath("//div[@id='state']")); }
		 * 
		 * public static WebElement Drop(WebDriver driver) { return
		 * driver.findElement(By.xpath("//input [@id='react-select-3-input']")); }
		 * 
		 * public static WebElement City(WebDriver driver) { return
		 * driver.findElement(By.xpath("//div[@id='city']")); }
		 * 
		 * public static WebElement Dro(WebDriver driver) { return
		 * driver.findElement(By.xpath("//input [@id='react-select-4-input']"));
		 * 
		 * }
		 * 
		 * public static WebElement Submit(WebDriver driver) { return
		 * driver.findElement(By.xpath("//button[text()='Submit']")); }
		 */
	}


