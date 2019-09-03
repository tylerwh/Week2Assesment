import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Car;

public class TestCar2 {
	String testCar2Make = "Toyota";
	Car Tercel = new Car(testCar2Make);
	double yearProducedToFail = 201.9;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCarMakeAddsToObject() {
		System.out.println("Inside testCarMakeAddsToObject()");
		assertEquals(testCar2Make, Tercel.getMake());
		//fail("Not yet implemented");
	}

}
