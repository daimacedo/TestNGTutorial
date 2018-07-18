package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_TestParameters {
	
	@Parameters({"browser","SO"})
	@BeforeClass
	public void SetUp(String _browser, String _SO)	{
		System.out.println("BeforeClass");
		System.out.println("Parameter browser from xml file: " + _browser);
		System.out.println("Parameter SO from xml file: " + _SO);
	}
	
	@Parameters({"response"})
	@Test
	public void test1(String _response) {
		System.out.println("test1");
		System.out.println("Parameter response from xml file: " + _response);
	}

}
