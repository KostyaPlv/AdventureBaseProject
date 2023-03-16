package testsPackage;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.InTouchPage;

public class InTouchTest extends BaseTest {
	@Test(description = "Correct phone check")
	public void tc_01_checkPhone() {
		HomePage hp = new HomePage(driver);
		InTouchPage itp = new InTouchPage(driver);
		hp.inTouchSelect();
		String expected = "+44 (0) 20 3813 4779";
		String actual = itp.phoneCheck();
		assertEquals(actual, expected);
	}

	@Test(description = "Correct mail check")
	public void tc_02_checkEmail() {
		HomePage hp = new HomePage(driver);
		InTouchPage itp = new InTouchPage(driver);
		hp.inTouchSelect();
		String expected = "hello@adventurebase.com";
		String actual = itp.emailCheck();
		assertEquals(actual, expected);
	}
}
