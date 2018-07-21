package test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNG_TestResult {
	
	@Test
	public void method1() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void method2()
	{
		Assert.assertTrue(true);
	}
	
	@Test(enabled=false)
	public void ignoredTest()
	{
		
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result){
		System.out.println("teste");
		if(result.getStatus()==ITestResult.FAILURE) {
			System.out.println("Failed: " + result.getMethod().getMethodName());
		}
		if(result.getStatus()==ITestResult.SUCCESS) {
			System.out.println("Sucessful: " + result.getMethod().getMethodName());
		}
	}
	
}
