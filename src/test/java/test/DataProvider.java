package test;
public class DataProvider {
	

	@org.testng.annotations.DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {{"Citroen","c3"},{"VW","Jetta"},{"Honda","Civic"}};
	}


}
