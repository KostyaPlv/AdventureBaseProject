package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	WebDriver driver;
	JavascriptExecutor js;
	WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		js = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void fillText(WebElement el, String text) {
		js.executeScript("arguments[0].setAttribute('style', 'background-color:yellow; border: 1px solid red;');", el);
		el.clear();
		el.sendKeys(text);
	}

	public void alertOk() {
		driver.switchTo().alert().accept();
	}

	public void mouseHover(WebElement el) {
		js.executeScript("arguments[0].setAttribute('style', 'background-color:yellow; border: 1px solid red;');", el);
		Actions action = new Actions(driver);
		action.moveToElement(el).perform();
	}

	public void select(WebElement el, String opt) {
		js.executeScript("arguments[0].setAttribute('style', 'background-color:yellow; border: 1px solid red;');", el);
		Select selectBox = new Select(el);
		selectBox.selectByVisibleText(opt);
	}

	public void click(WebElement el) {
		js.executeScript("arguments[0].setAttribute('style', 'background-color:yellow; border: 1px solid red;');", el);
		el.click();
	}

	public void submit(WebElement el) {
		el.submit();
	}

	public String getText(WebElement el) {
		js.executeScript("arguments[0].setAttribute('style', 'background-color:yellow; border: 1px solid red;');", el);
		return el.getText();
	}

	public void sleep(long mills) {
		try {
			Thread.sleep(mills);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}