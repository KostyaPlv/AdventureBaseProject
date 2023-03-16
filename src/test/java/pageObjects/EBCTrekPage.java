package pageObjects;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EBCTrekPage extends BasePage {

	@FindBy(css = ".adventure-breakdown__list div div:nth-child(1) ul li")
	private List<WebElement> includedList;

	@FindBy(css = ".adventure-breakdown__list div div:nth-child(2) ul li")
	private List<WebElement> notIncludedList;

	public EBCTrekPage(WebDriver driver) {
		super(driver);
	}

	public List<String> IncludedList() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < includedList.size(); i++) {
			String s = includedList.get(i).getText();
			list.add(s);
		}
		return list;
	}

	public List<String> notIncludedLsit() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < notIncludedList.size(); i++) {
			String n = notIncludedList.get(i).getText();
			list.add(n);
		}
		return list;
	}
}
