package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

	@FindBy(css = "#username")
	private WebElement usernameField;

	@FindBy(css = "#password")
	private WebElement passwordField;

	@FindBy(css = "[value='Sign In']")
	private WebElement signInButton;

	@FindBy(css = ".status.error")
	private WebElement errorText;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void login(String user, String password) {
		fillText(usernameField, user);
		fillText(passwordField, password);
		click(signInButton);
	}

	public String errorMsg() {
		wait.until(ExpectedConditions.visibilityOf(errorText));
		return getText(errorText);
	}
}
