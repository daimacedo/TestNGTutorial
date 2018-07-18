package dependentMethods;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

	@BeforeSuite
	public void runBeforeSuite()
	{
		System.out.println("This code will run before a suit start running");
	}
	
	@BeforeTest
	public void runOnceBeforeTagTest()
	{
		System.out.println("This code will run before the tag <test> on config.xml starts");
	}
	
	@AfterTest
	public void runOnceAfterTagTest()
	{
		System.out.println("This code will run after the tag <test> on config.xml ends");
	}
	
	@AfterSuite
	public void runAfterSuite()
	{
		System.out.println("This code will run after a suit ends running");
	}
	
}
