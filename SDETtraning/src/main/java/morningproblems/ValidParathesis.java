package morningproblems;

import java.util.Stack;

import org.junit.Test;

import junit.framework.Assert;

public class ValidParathesis {
	
	@Test
	public void test1() {
		String str="{}}{{{{}}}}}{{{}}}";
		Assert.assertEquals(false, findValidParanthesis(str));
	}
	@Test
	public void test2() {
		String str="{{}}}";
		Assert.assertEquals(false, findValidParanthesis(str));
	}
	@Test
	public void test3() {
		String str="{{<>}}}{()()(}{}{}}";
		Assert.assertEquals(false, findValidParanthesis(str));
	}

	private boolean findValidParanthesis(String str) {
		Stack<Character> stack=new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='{' || str.charAt(i)=='(' || str.charAt(i)=='[') {
				stack.push(str.charAt(i));
			}else if(str.charAt(i)=='}' ){
				if(!stack.isEmpty() && stack.peek()=='{') {
					stack.pop();
				} 
				else return false;
				}else if(str.charAt(i)==')'){
				if(!stack.isEmpty() && stack.peek()=='(') {
					stack.pop();
				} 
				else return false;
			}else {
				if(!stack.isEmpty() && stack.peek()=='[') {
					stack.pop();
				} 
				else return false;
			}
		}
		return stack.isEmpty();
	}
}