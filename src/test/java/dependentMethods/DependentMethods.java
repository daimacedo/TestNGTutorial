package dependentMethods;

import org.testng.annotations.Test;

public class DependentMethods {

	@Test(dependsOnMethods= {"testMethod2"}, timeOut=10)
	public void testMethod1(){
		
	}
	
	@Test
	public void testMethod2(){
		
	}
}
