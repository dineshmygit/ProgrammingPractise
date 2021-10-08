package InterviewPreparation;

import org.junit.Test;

public class DividerModulos {
	@Test
	public void test1() {
		int num=121;
		findSingleDigit(num);
	}

	private void findSingleDigit(int num) {
		int result=num;
		while(result>10) {
			int mod=result%10;
			int div=result/10;
			result=div+mod;
		}
		System.out.println(result);
	}

}
