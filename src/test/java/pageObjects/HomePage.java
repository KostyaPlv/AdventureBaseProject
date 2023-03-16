package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	@FindBy(css = "#menu-item-4945 a")
	private WebElement adventuresTab;

	@FindBy(css = "#menu-item-7684 a")
	private WebElement ebcTrekButton;

	@FindBy(css = ".header__account-link.js-show-account-modal")
	private WebElement loginButton;

	@FindBy(css = "#menu-item-4979 a")
	private WebElement getInTouchTab;

	@FindBy(css = ".btn.btn--icon.btn.btn-block.btn-block--large.btn-block--orange.is-hidden-mobile.is-hidden-tablet.is-not-hidden-desktop-l")
	private WebElement bespokeTripsButton;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public void showAdventures() {
		mouseHover(adventuresTab);
	}

	public void ebcSelect() {
		click(ebcTrekButton);
	}

	public void loginSelect() {
		click(loginButton);
	}

	public void inTouchSelect() {
		click(getInTouchTab);
	}

	public void bespokeSelect() {
		click(bespokeTripsButton);
	}
}
