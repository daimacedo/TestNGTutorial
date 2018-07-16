package testclasses;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import app.SomeSum;

public class TestNGAssert {
	
	@Test
	public void testeSum()
	{
		System.out.println("running test: teste1 ");
		SomeSum obj = new SomeSum();
		int result = obj.sumNumbers(2, 4);
		assertEquals(result, 6);
	}
	
	@Test
	public void String()
	{
		System.out.println("running test: String ");
		SomeSum obj = new SomeSum();
		String expectedString = "Daiane Rosa";
		String result = obj.addingStrings("Daiane", "Rosa");
		Assert.assertEquals(expectedString, result);
		
		
	}
	
	@Test
	public void array()
	{
		System.out.println("running test: array ");
		
		int[] expectedArray = {1,2,3};
		SomeSum obj = new SomeSum();
		int[] result = obj.getArray();
		Assert.assertEquals(expectedArray, result);
	}
}
