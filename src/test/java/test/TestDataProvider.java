package test;

import org.testng.annotations.Test;

public class TestDataProvider {


	@Test(dataProvider="inputs", dataProviderClass=DataProvider.class)
	public void testDataProvider(String one, String two) {
		System.out.println("Testando: " + one + " " + two);
	}

}
