package testsPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.BespokeTripsPage;

public class BaseTest {
	WebDriver driver;
	BespokeTripsPage bp;

	@BeforeClass
	public void setup() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("remote-allow-origins=*");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://adventurebase.com/");
		bp = new BespokeTripsPage(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
