package testListeners;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.Listener_IInvokedMethodListener;

@Listeners(Listener_IInvokedMethodListener.class)
public class Test_IInvokedMethodListener {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("Running Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Running after class");
	}
	
	@Test
	public void testOne()
	{
		System.out.println("Running Test One");
	}

	@Test
	public void testTwo()
	{
		System.out.println("Running Test Two");
	}
}
