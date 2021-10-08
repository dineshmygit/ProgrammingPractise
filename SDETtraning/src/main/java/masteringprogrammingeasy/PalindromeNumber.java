package masteringprogrammingeasy;

import org.junit.Test;

public class PalindromeNumber {
	@Test
	public void test1() {
		int num=121;
		findPalindromeNumber(num);
	}

	private boolean findPalindromeNumber(int x) {
		int result=0,tmp=x;
		if(x<=0) return false;
		while(x>0) {			
			int mod=x%10;
			result=(result*10)+mod;
			int div=x/10;
			x=div;
		}
		if(tmp==result) {
			return true;
		}
		return false;
	}
}