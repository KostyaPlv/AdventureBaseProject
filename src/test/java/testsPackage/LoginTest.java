package testsPackage;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginTest extends BaseTest {
	@Test(description = "Login button functionalty")
	public void tc_03_loginButton() {
		HomePage hp = new HomePage(driver);
		hp.loginSelect();
	}

	@Test(description = "Login with wrong credentials",dataProvider = "getData")
	public void tc_04_wrongLogin(String user, String password) {
		LoginPage lp = new LoginPage(driver);
		lp.login(user, password);
		String expected = "Wrong username or password.";
		String actual = lp.errorMsg();
		assertEquals(actual, expected);
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] myData = { { "admin@gmail.com", "123456" }, { "user@yandex.ru", "s123" },
				{ "first@walla.co.il", "everest" } };
		return myData;
	}
}
