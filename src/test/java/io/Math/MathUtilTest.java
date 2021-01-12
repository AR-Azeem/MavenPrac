package io.Math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilTest {
	MathUtil mathutil;
	static int c =0;
	{
		c+=1;
		System.out.println(c);
	}
	@BeforeAll
	static void befroreall() {
		System.out.println("hello");
	}
	
	
	@BeforeEach
	void inti() {
		mathutil = new MathUtil();
	}
	
	@Test
	void test() {
		//MathUtil mathutil = new MathUtil();
		int expected = 2;
		int actual = mathutil.add(1,1);
		assertEquals(expected,actual);
	}
	@Test
	void testDivide() {
		
		assertThrows(ArithmeticException.class,()->mathutil.divide(1,0));
		System.out.println("Hello maven Jenkins");
	}
	
	@Test
	void testDivide1() {
		
		assertThrows(ArithmeticException.class,()->mathutil.divide(4,0));
	}
	
	@Test
	void testDivide2() {
		
		assertThrows(ArithmeticException.class,()->mathutil.divide(4,0));
	}
	
	

}
