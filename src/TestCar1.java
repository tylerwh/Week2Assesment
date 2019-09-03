import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;

public class TestCar1 {
	String testCar1 = "Ford";
	Car Bronco = new Car(testCar1);
	int yearToAdd = 2019;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void addMakeToTestCar1() {
		System.out.println("Inside addMakeToTestCar1()");
		String carMake = testCar1;
		assertTrue(carMake == Bronco.getMake());
		// fail("Not yet implemented");
	}
	
	@Test
	public void addYearToTestCar1() {
		System.out.println("Inside addYearToTestCar1()");
		Bronco.setYearProduced(yearToAdd);
		assertNotNull(Bronco.getYearProduced());
	}

}
