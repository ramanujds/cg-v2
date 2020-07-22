package com.capg.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import com.capg.demos.Calculator;
@TestInstance(Lifecycle.PER_CLASS)
class CalculatorTest {
	
	Calculator c;
	
	@BeforeAll
	public void init() {
		c=new Calculator();
		System.out.println("Init Method executed");
	}
	
	@BeforeEach
	public void beforeEachTest() {
		System.out.println("Test started");
	}
	@AfterEach
	public void afterEachTest() {
		System.out.println("Test Completed");
	}
	
	@AfterAll
	public void finalize() {
		System.out.println("All tests are Done");
	}

	@Test
	void testAdd() {
		
		assertEquals(11,c.add(5, 6) );
	}

	@Test
	@EnabledOnOs(OS.WINDOWS)
	void testSubtract() {
		assertEquals(5, c.subtract(15, 10));
	}

	@Test
	@Disabled
	void testMultiply() {
		assertEquals(25, c.multiply(6, 5));
	}

	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, ()->c.divide(5, 0));
	}
	
	@Nested
	class NestedTests{
		@Test 
		void test1() {
			assertNotNull(c);
		}
		@Test
		void test2() {
			assertTrue(c.add(8, 4)==12);
		}
	}

}
