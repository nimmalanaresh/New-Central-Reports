package Projects.Dummy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	
	@BeforeMethod
	public void setUp() {
	 
		System.out.println("Before method running");
	}

	@AfterMethod
	public void tearDown() {
		
		System.out.println("After method running");
	}
	
	
	@BeforeClass
	public void set() {
	 
		System.out.println("Before class running");
	}

	@AfterClass
	public void tear() {
		
		System.out.println("After class running");
	}

	@Test
	public void testMethod() {
		
		System.out.println("Test method running");
	}
	
	@Test
	public void testMethod123() {
		
		System.out.println("Test method123 running....................");
	}
	
	

}
