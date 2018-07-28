package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class TestNG_ITestListener implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart: Test Name -> " + result.getMethod().getMethodName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSucess: Test Name -> " + result.getMethod().getMethodName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailed: Test Name -> " + result.getMethod().getMethodName());
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped: Test Name -> " + result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("onStart before Tag <test> xml -> " + context.getName());
		ITestNGMethod methods[] = context.getAllTestMethods();
		System.out.println("These methods will be executed in this test tag: " + context.getName());
		for(ITestNGMethod method :methods) {
			System.out.println("Teste: "+ method.getMethodName());
		}
	}

	public void onFinish(ITestContext context) {
		System.out.println("onFinish after Tag <test> xml -> " + context.getName());
	}

}
