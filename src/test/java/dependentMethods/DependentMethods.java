package dependentMethods;

import org.testng.annotations.Test;

public class DependentMethods {

	@Test(dependsOnMethods= {"testMethod2"}, timeOut=100)
	public void testMethod1() throws InterruptedException{
		
	Thread.sleep(200);
	
	}
	
	@Test
	public void testMethod2(){
		
	}
}
