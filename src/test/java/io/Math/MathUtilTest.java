package io.Math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilTest {

	@Test
	void test() {
		MathUtil mathutil = new MathUtil();
		int expected = 2;
		int actual = mathutil.add(1,1);
		assertEquals(expected,actual);
	}

}
