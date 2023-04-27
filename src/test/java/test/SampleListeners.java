package test;

import org.testng.annotations.Test;

public class SampleListeners {
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test(timeOut=5000)
	public void test2() throws InterruptedException
	{
	Thread.sleep(6000);	
	System.out.println("test2");
	}
	@Test(dependsOnMethods="test2")
	public void test3() {
		System.out.println("test3");
	}

}
