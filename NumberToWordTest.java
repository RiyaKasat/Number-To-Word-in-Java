import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumberToWordTest {

	NumberToWord obj = new NumberToWord();
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMain() {
		String str= "-1";
		String result= obj.input(str);
		assertEquals("Incorrect output : Must be positive",result);
		
		String str1= "9999999";
		String result1= obj.input(str1);
		assertEquals("Not Supported",result1);

		String str2= "999.99";
		String result2= obj.input(str2);
		assertEquals("nine Hundred AND ninety nine 99/100 ONLY",result2);
		
		String str3= "999.9";
		String result3= obj.input(str3);
		assertEquals("nine Hundred AND ninety nine 9/10 ONLY",result3);
		
		String str4= "999";
		String result4= obj.input(str4);
		assertEquals("nine Hundred AND ninety nine  ONLY",result4);

		

		
		
	}

	@Test
	void testFun() {
		int str= 50;
		String result= obj.fun(str);
		assertEquals("fifty  ",result);
		
		int str1= 10;
		String result1= obj.fun(str1);
		assertEquals("ten ",result1);
		
		
	}

	@Test
	void testConvert() {
		int str= 500;
		String result= obj.convert(str);
		assertEquals("five Hundred AND ",result);
		
		int str1= 5000;
		String result1= obj.convert(str1);
		assertEquals("five Thousand ",result1);
		
		int str2= 50001;
		String result2= obj.convert(str2);
		assertEquals("fifty  Thousand one ",result2);
		
		int str3= 500001;
		String result3= obj.convert(str3);
		assertEquals("five lakhs one ",result3);
		
	}

}
