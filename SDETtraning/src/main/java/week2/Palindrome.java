package week2;

import org.junit.Test;
/*
1. Understand the problem
   If an given integer is palindrome return true
2. Test data set
  	input:121
  	Target:check whether it is palindrom i.e 121 after reversing
  	output: true if 121
3. Do you know how to solve.
   a.Brute force
4. Ask for hints and constraints

5. Alternative solution

6. Know O notation
7. write Pseudo code
   a.get the integer
   b.reverse the given integer
   c.compare the reversed interger with the target
   d.if matched return true
   e.if not return false.
8. Implement the code
9. Debug and Test
 */
public class Palindrome {


	@Test
	public void positiveCase() {
		int value=11211;
		boolean result=funCal(value);
		System.out.println(result);
	}

	@Test
	public void negativeCase() {
		int value=12000;
		boolean result=funCal(value);
		System.out.println(result);
	}

	@Test
	public void edgeCase() {
		int value=-121;
		boolean result=funCal(value);
		System.out.println(result);
	}
	
	/*
	 * Time complexity=O(n) Space complexity =O(1)
	 */		
	private boolean funCal(int value) {
		int rev=0,tmp=value;
		while(value>0) {                 //O(n)
			rev=rev*10+value%10;	//
			value=value/10;
		}
		if(tmp==rev) 
			return true;
		return false;
	}
}
