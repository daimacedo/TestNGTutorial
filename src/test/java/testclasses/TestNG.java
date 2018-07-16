package testclasses;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

import org.testng.annotations.Test;
import app.SomeSum;

public class TestNG {

	// The tests are executed in alphabetic order
	@Test
	public void teste1()
	{
		System.out.println("running test: teste1 ");
		SomeSum obj = new SomeSum();
		int result = obj.sumNumbers(2, 4);
		
	}
	
	@Test
	public void teste2()
	{
		System.out.println("running test: teste2 ");
	}
	
	@Test
	public void teste3()
	{
		System.out.println("running test: teste3 ");
	}
	
}
