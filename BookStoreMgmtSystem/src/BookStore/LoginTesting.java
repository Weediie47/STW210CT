package BookStore;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class LoginTesting {

	@Test
	void test() {

	
		Login ltest =new Login();
		int result=ltest.userLogin("a","a");
		assertEquals(1,result);
	}

}

