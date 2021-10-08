package InterviewPreparation;

import org.junit.Test;

public class PalindromeNumber {
	
	@Test
	public void test1() {
		int num=123;
		findPalindrome(num);
	}

	private void findPalindrome(int num) {
		int newNum=0,tmp=num;
		while(num>0) {
			int mod=num%10;
			newNum=(newNum*10)+mod;
			int div=num/10;
			num=div;
		}
		if(newNum==tmp) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}
}
