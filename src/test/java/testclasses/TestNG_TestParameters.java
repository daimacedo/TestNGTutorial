package testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG_TestParameters {
	
	// Is not possible to run using parameters from java class, we need to run clicking on xml.config
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
		
		String[] stringArray = _response.split(",");
		System.out.println("test1");
		for(int i=0; i<stringArray.length;i++) {
			System.out.println("Parameter response from xml file: " + stringArray[i]);
		}
	}

}
