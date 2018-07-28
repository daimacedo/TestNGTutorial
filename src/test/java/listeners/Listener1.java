package listeners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class Listener1 implements IInvokedMethodListener{

	
	// Esses metodos serão rodados antes e depois de cada metodo, não precisa ser um metodo de teste
	// eh antes de depois de qualquer metodo.
	public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("Running before Invoke");
		
	}

	public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {
		System.out.println("Running after Invoke");
		
	}

	
}
