package testsPackage;

import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.EBCTrekPage;
import pageObjects.HomePage;

public class EBCTrekTest extends BaseTest {

	@Test(description = "EBC Trek selection")
	public void tc_15_EBCTrek() {
		HomePage hp = new HomePage(driver);
		hp.showAdventures();
		hp.ebcSelect();
	}

	@Test(description = "List of what's included")
	public void tc_16_included() {
		EBCTrekPage ebc = new EBCTrekPage(driver);
		List<String> includedList = ebc.IncludedList();
		System.out.println(includedList);
		List<String> expectedList = Arrays.asList("3 nights at Hotel Shanker on BB & twin-sharing basis",
				"All Airport/hotel transfers as required by the itinerary", "Flight Tickets: Lukla - Kathmandu - Lukla",
				"Full-time services of a trained and experienced trekking guided for the duration of trek",
				"Extra assistant Guide for 8 pax & above", "Breakfast & dinner during the trek period",
				"Porters to carry luggage during the trek: 1 porter per two trekkers",
				"Wages, traveling expenses, accommodation and meals for all crew members & porters",
				"All necessary permits", "Medical Kit");
		Assert.assertEquals(includedList, expectedList);
	}

	@Test(description = "List of what's not included")
	public void tc_17_notIncluded() {
		EBCTrekPage ebc = new EBCTrekPage(driver);
		List<String> notIncludedList = ebc.notIncludedLsit();
		System.out.println(notIncludedList);
		List<String> expectedList = Arrays.asList("International flights", "Travel/personal insurance",
				"Emergency evacuation", "Lunch during trek", "Bar & beverages",
				"Any extra expenses forced by unforeseen circumstances (Example: expenses forced by flight cancellation due to weather)");
		Assert.assertEquals(notIncludedList, expectedList);
	}
}
