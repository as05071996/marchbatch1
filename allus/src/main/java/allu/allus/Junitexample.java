package allu.allus;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Junitexample {

	@BeforeClass
	public  static void bclass() {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void aclass() {
		System.out.println("after class");
	}
	
	@Test
	public void tc1() {
		
		System.out.println("test case1");
	}
	@Before
	public void Be() {
		
	System.out.println("before");
	}
	@After 
	public void af() {
		System.out.println("after ");
	} 
	
	 @Test
	public void abc () {
		
		System.out.println("Test Case2");
	}
}
