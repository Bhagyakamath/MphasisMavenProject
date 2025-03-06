package com.test;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Timeout(value=5, unit=TimeUnit.SECONDS)
@Suite
@DisplayName("Test suite sample example")
@SelectPackages("com.test")
@IncludeClassNamePatterns(".*Test")
@SelectClasses({CalculatorTest1.class, CalculatorTest.class})
public class CalculatorTest1 {
	Calculator obj;
	@Test
	@Timeout(value=3, unit=TimeUnit.SECONDS)
	public void testAdd() {
		System.out.println("before sleep method");
		try {
			TimeUnit.SECONDS.sleep(5);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}

