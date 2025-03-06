package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CustomerTest {
	Customer obj;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before all the test cases only one time");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After all the test cases only one time");
	}
	
	@Before
	public void setUp() {
		System.out.println("Excecutes every test method before execution");
		obj=new Customer();
	}
	
	@After
	public void setDown() {
		System.out.println("Excecutes every test method after execution");
		obj=null;
	}
	
	@Test
	public void testGreetUser() {
		System.out.println("testGreetUser method");
		assertEquals("hi hello", obj.greetUser("hi hello"));
	}
	
	@Test
	public void testByeUser() {
		System.out.println("testGreetUser method");
		assertEquals("bye", obj.byeUser("bye"));
	}
}
