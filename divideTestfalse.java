package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTestfalse {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double result  = test.divide(30,5);
		assertEquals(3, result);
	}

}
