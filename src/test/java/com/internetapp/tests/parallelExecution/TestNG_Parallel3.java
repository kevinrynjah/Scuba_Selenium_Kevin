package com.internetapp.tests.parallelExecution;

import org.testng.annotations.Test;

public class TestNG_Parallel3 {
	
	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("TestNG_Parallel3 -> testMethod1");
		Thread.sleep(1000);
		System.out.println("TestNG_Parallel3 -> testMethod1 -> More Steps");
	}
	
	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_Parallel3 -> testMethod2");
		Thread.sleep(1000);
		System.out.println("TestNG_Parallel3 -> testMethod2 -> More Steps");
	}
}