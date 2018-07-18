package dependentMethods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DependentMethods extends Base {

	
	@BeforeMethod
	public void BeforeMethods()	{
		System.out.println("Running before methods");
	}
	
	@AfterMethod
	public void AfterMethods()	{
		System.out.println("Running after methods");
	}
	
	@Test(dependsOnMethods= {"testMethod2"}, timeOut=100)
	public void testMethod1() throws InterruptedException{
		
		System.out.println("Running TestMethod1");
		Thread.sleep(200);
	
	}
	
	@Test
	public void testMethod2(){
		System.out.println("Running TestMethod1");
		
	}
}
