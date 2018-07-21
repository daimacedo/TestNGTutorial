package test;

import org.testng.annotations.Test;

public class DataProvider {

	@org.testng.annotations.DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {{"Citroen","c3"},{"VW","Jetta"},{"Honda","Civic"}};
	}


	@Test(dataProvider="inputs")
	public void testDataProvider(String one, String two) {
		System.out.println("Testando: " + one + " " + two);
	}

}
