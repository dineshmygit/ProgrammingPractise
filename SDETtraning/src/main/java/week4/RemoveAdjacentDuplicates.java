package week4;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

/*
1. Understand the problem 
2. Test data set
  	input: Sting
  	Target:
  	output:String
3. Do you know how to solve
4. Ask for hints and constraints
5. Alternative solution
   time complexity:O(n^2)
   space complexity : O(n)  
   
6. Know O notation
7. write Pseudo code
8. Implement the code
9. Debug and Test
 */


public class RemoveAdjacentDuplicates {
	
	
	@Test
	public void test1() {
		String str="abbacc";//a=3 //b=2//abbacc//aaabbcc//
		Assert.assertEquals(removeAdjCharacter(str), "");
	}


	@Test //negative
	public void test2() {
		String str="abcd";
		Assert.assertEquals(removeAdjCharacter(str), "abcd");
	}

	@Test //edge
	public void test3() {
		String str="aaa";
		Assert.assertEquals(removeAdjCharacter(str), "a");
	}
	
	
	/* covert string character array
	 * create a stack with character as data type
	 * push the char to stack //
	 * if the char and the peek element is same then pop the peak element
	 * else push into stack
	 * return the string 
	 *  */
	private String removeAdjCharacter(String str) {
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		Stack<Character>stack =new Stack<Character>();
		for (int i = 0; i < ch.length; i++) {
			if(!stack.isEmpty() && stack.peek()==ch[i]) stack.pop();
			else stack.push(ch[i]);
		}
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}
}
