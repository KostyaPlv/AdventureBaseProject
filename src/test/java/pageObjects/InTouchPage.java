package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InTouchPage extends BasePage {

	@FindBy(css = ".contact-list li:nth-child(1) h4 a")
	private WebElement phone;

	@FindBy(css = ".contact-list li:nth-child(2) h4 a")
	private WebElement email;

	public InTouchPage(WebDriver driver) {
		super(driver);
	}

	public String phoneCheck() {
		return getText(phone);
	}

	public String emailCheck() {
		return getText(email);
	}
}
