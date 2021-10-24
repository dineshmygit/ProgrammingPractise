package Freshworks;

import java.util.Stack;

import org.junit.Test;

public class ReverseDecodeString {
	@Test
	public void test1() {
		String str="((works)hserf)";
		findDecode(str);
	}

	public void findDecode(String str) {
		Stack<Character> stack=new Stack<>();
		StringBuilder sb=new StringBuilder();
		StringBuilder result=new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='(') {
				stack.push(str.charAt(i));
			}else if(str.charAt(i)==')') {
				while(stack.peek()!='(') {
					sb.append(stack.pop());					
				}
				stack.pop();
				result=sb.reverse();
				sb=new StringBuilder();
			}else {
				stack.push(str.charAt(i));
			}
		}
		System.out.println(result);
	}

	public void findDecodeNormal(String str) {
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '(') {
				
			}
		}
	}
}