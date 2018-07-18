package groups;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGGroups {
	
	@BeforeMethod(alwaysRun=true)
	public void setUp()
	{
		System.out.println("Before Method running");
	}
	
	@Test(groups = {"cars", "SUV"})
	public void testHRV()
	{
		System.out.println("Running test -> testHRV");
	}
	
	@Test(groups= {"cars", "sedan"})
	public void testAudiA6()
	{
		System.out.println("Running test -> testAudiA6");
	}
	
	@Test(groups= {"bikes"})
	public void testNinja()
	{
		System.out.println("Running test -> testNinja");
	}
	
	@Test(groups= {"bikes"})
	public void testCBR()
	{
		System.out.println("Running test -> testCBR");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void tearDown()
	{
		System.out.println("After Method running");
	}

}
