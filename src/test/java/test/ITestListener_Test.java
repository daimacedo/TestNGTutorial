package test;

import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners.TestNG_ITestListener;

public class ITestListener_Test {

@Listeners(TestNG_ITestListener.class)
	public class TestNG_ListenersTest {

		@BeforeClass
		public void beforeClass() {
			System.out.println("Running Before Class");
		}

		@AfterClass
		public void afterClass() {
			System.out.println("Running after class");
		}

		@Test
		public void testOne() {
			System.out.println("Running Test One");
		}

		@Test
		public void testTwo() {
			System.out.println("Running Test Two");
			Assert.assertTrue(false);
		}

		@Test(dependsOnMethods = "testTwo")
		public void testThree() {
			System.out.println("Running Test Three");
		}
	}
}
