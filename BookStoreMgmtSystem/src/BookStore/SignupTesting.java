package BookStore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SignupTesting {

	@Test
	void test() {

	
		Reg ltest =new Reg();
		int result=ltest.userSignup("a", "a", "a", "a");
		assertEquals(1,result);
	}

}
