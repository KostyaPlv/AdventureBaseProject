package testsPackage;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pageObjects.HomePage;

public class BespokeTest extends BaseTest {

	@Test(description = "Functionalty of Bespoke Trips button")
	public void tc_05_bespokeTripsButton() {
		HomePage hp = new HomePage(driver);
		hp.bespokeSelect();
	}

	@Test(description = "Proceed with queastions button")
	public void tc_06_tripsQuastionsStart() {
		bp.letsGo();
	}

	@Test(description = "Solo or group adventure selection")
	public void tc_07_tripsQuastionsOne() {
		bp.stepOne();
	}

	@Test(description = "How many people selection")
	public void tc_08_tripsQuastionsTwo() {
		bp.stepTwo();
	}

	@Test(description = "Type of adventure selection")
	public void tc_09_tripsQuastionsThree() {
		bp.stepThree();
	}

	@Test(description = "Where i want the adventure selection")
	public void tc_10_tripsQuastionsFour() {
		bp.stepFour();
	}

	@Test(description = "Time of the year selection")
	public void tc_11_tripsQuastionsFive() {
		bp.stepFive();
	}

	@Test(description = "For how long selection")
	public void tc_12_tripsQuastionsSix() {
		bp.stepSix();
	}

	@Test(description = "Expirience selection")
	public void tc_13_tripsQuastionsSeven() {
		bp.stepSeven();
	}

	@Test(description = "Adventure summary")
	public void tc_14_tripsQuastionsValidation() {
		String expected = "How does this look to you?";
		String actual = bp.resultsText();
		assertEquals(actual, expected);
	}
}
