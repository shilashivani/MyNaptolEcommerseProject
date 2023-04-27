package test;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(test.Listeners.class)
public class Sample {

	
	@Test
	public void Test1() {
		System.out.println("test1");
	}
	
	@Test (timeOut = 5000)
	public void Test2() throws InterruptedException {
		Thread.sleep(6000);
		System.out.println("test2");
	}
	
	
	@Test (dependsOnMethods = "Test2")
	public void Test3() {
		System.out.println("test3");
	}
	
	@Test
	public void Test5() {
		System.out.println("Test5");
	}
	

	
}
