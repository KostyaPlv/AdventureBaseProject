package pageObjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BespokeTripsPage extends BasePage {

	@FindBy(css = "#step-start div a")
	private WebElement letsGoButton;

	@FindBy(css = "#strafe-cookie-allow")
	private WebElement closeCovid;

	@FindBy(css = "[data-val='individual']")
	private WebElement individualButton;

	@FindBy(css = "#step-1 [aria-label='Next Step']")
	private WebElement StepOneButton;

	@FindBy(css = "[data-val='1+person']")
	private WebElement onePersonButton;

	@FindBy(css = "#step-2 [aria-label='Next Step']")
	private WebElement StepTwoButton;

	@FindBy(css = "[data-val='trekking']")
	private WebElement trekkingButton;

	@FindBy(css = "#step-3 [aria-label='Next Step']")
	private WebElement StepThreeButton;

	@FindBy(css = "[data-val='asia']")
	private WebElement asiaButton;

	@FindBy(css = "#step-4 [aria-label='Next Step']")
	private WebElement StepFourButton;

	@FindBy(css = "[data-val='autumn']")
	private WebElement autumnButton;

	@FindBy(css = "#step-5 [aria-label='Next Step']")
	private WebElement StepFiveButton;

	@FindBy(css = "[data-val='multi-week']")
	private WebElement multiWeekButton;

	@FindBy(css = "#step-6 [aria-label='Next Step']")
	private WebElement StepSixButton;

	@FindBy(css = "[data-val='i%e2%80%99m+experienced']")
	private WebElement iamExpiriencedButton;

	@FindBy(css = "#step-7 [aria-label='Next Step']")
	private WebElement StepSevenButton;

	@FindBy(css = "[aria-label='Receive my adventure!']")
	private WebElement receiveAdventureButton;

	@FindBy(css = "#step-review h2")
	private WebElement getResultsText;

	public BespokeTripsPage(WebDriver driver) {
		super(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public void letsGo() {
		click(closeCovid);
		click(letsGoButton);
	}

	public void stepOne() {
		click(individualButton);
		click(StepOneButton);
	}

	public void stepTwo() {
		click(onePersonButton);
		click(StepTwoButton);
	}

	public void stepThree() {
		click(trekkingButton);
		click(StepThreeButton);
	}

	public void stepFour() {
		click(asiaButton);
		click(StepFourButton);
	}

	public void stepFive() {
		click(autumnButton);
		click(StepFiveButton);
	}

	public void stepSix() {
		click(multiWeekButton);
		click(StepSixButton);
	}

	public void stepSeven() {
		click(iamExpiriencedButton);
		click(StepSevenButton);
	}

	public void receiveAdventure() {
		click(receiveAdventureButton);
	}

	public String resultsText() {
		return getText(getResultsText);
	}
}
