package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Listener_ISuiteListener implements ISuiteListener {

	public void onStart(ISuite suite) {
		System.out.println("Running before start a Suite: " + suite.getName());
		
	}

	public void onFinish(ISuite suite) {
		System.out.println("Running After finish a Suite: " + suite.getName());
		
	}
	
	

}
